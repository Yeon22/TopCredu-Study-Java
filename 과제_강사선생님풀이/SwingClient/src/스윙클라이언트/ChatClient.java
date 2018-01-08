package 스윙클라이언트;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener{
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Receiver serverMessage;
	JTextField clientMessage;
	JTextField NickName;
	JPanel panel;
	JScrollPane spane;
	JComboBox IconBox;
	String [] strIcon = {"noIcon","Icon1","Icon2","Icon3"};
	
	public ChatClient() {
		setTitle("클라이언트 채팅 창"); //프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료 버튼 클릭하면 프로그램종료
		setLayout(new BorderLayout());
		//서버에서 받음 메시지를 출력할 컴포넌트 TextArea상속받을클래스
		serverMessage = new Receiver(); 
		
		serverMessage.setEditable(false); //편집 불가
		Thread t = new Thread(serverMessage); //서버에서 메세지 수신을 위한 스레드 생성
		NickName = new JTextField(6);
		IconBox = new JComboBox(strIcon);
		panel = new JPanel(new FlowLayout());
		clientMessage = new JTextField(20);
		clientMessage.addActionListener(this);
		spane = new JScrollPane(serverMessage); //긴 텍스트를 위해 ScrollPane에서 표시
		//add(NickName,BorderLayout.SOUTH);
		add(spane,BorderLayout.CENTER);
		panel.add(NickName);
		panel.add(clientMessage);
		panel.add(IconBox);
		add(panel,BorderLayout.SOUTH);
		setSize(400,200);
		setVisible(true);
		try {
			setupConnection();//클라이언트가 서버접속하는 함수
		}catch(IOException e) {
			handleError(e.getMessage());//에러가 나면 출력하는 함수
		}
		t.start();
	}
	
	private void setupConnection() throws IOException{
		socket = new Socket("localhost",9999);
		System.out.println("연결됨");
		//서버로부터 메세지를 받는 스트림
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
		//서버로 메세지를 보내는 스트림
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	public static void main(String[] args) {
		ChatClient frame = new ChatClient();
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable{
		public void run() {
			String inputMessage = null;
			String split[] = null;
			
			while(true) {
				try {
					inputMessage = in.readLine();//서버에서 한 행의 문자열을 읽음
					split = inputMessage.split("-");
					
					if(split.length<3)
					{
						inputMessage = split[0] + split[1];
					}
					else
					{
						inputMessage = split[0] + split[1] +".jpg"+split[2];
					}
				}catch(IOException e) {
					handleError(e.getMessage());
				}
				
				serverMessage.append("\n" + inputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos);//caret포지션을 가장 마지막으로 이동
			}
			
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clientMessage) {
			int Index = IconBox.getSelectedIndex();
			String IconName = IconBox.getItemAt(Index).toString();
			System.out.println(IconName);
			String outputMessage = "";
			
			if(IconName.equals("noIcon"))
			{
				outputMessage = NickName.getText()+">"+"-"+clientMessage.getText();
			}
			else
			{
				outputMessage = NickName.getText()+">"+"-"+IconName+"-"+clientMessage.getText();
			}
			
			try {
				out.write(outputMessage+"\n"); //문자열 전송
				out.flush();
				serverMessage.append("\n"+outputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos);//caret포지션을 가장 마지막으로 이동
				clientMessage.setText(null);//입력창의 문자열 지움
			}catch(IOException e1) {
				handleError(e1.getMessage());
			}
			
		}
		
	}

}
