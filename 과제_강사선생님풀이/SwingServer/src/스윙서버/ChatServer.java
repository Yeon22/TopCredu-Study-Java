package 스윙서버;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer extends JFrame implements ActionListener{
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	JTextField serverMessage;
	JTextField NickName;
	JComboBox IconBox;
	JPanel panel;
	JScrollPane spane;
	Receiver clientMessage;
	String []strIcon = {"noIcon","Icon1","Icon2","Icon3"};
	
	public ChatServer() {
		setTitle("서버 채팅 창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		clientMessage = new Receiver();
		clientMessage.setEditable(false);
		Thread t = new Thread(clientMessage);
		NickName = new JTextField(6);
		IconBox = new JComboBox(strIcon);
		
		panel = new JPanel(new FlowLayout());
		serverMessage = new JTextField(20);
		serverMessage.addActionListener(this);
		spane = new JScrollPane(clientMessage);
		
		panel.add(NickName);
		panel.add(serverMessage);
		panel.add(IconBox);
		add(spane,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		setSize(400,200);
		setVisible(true);
		
		try {
			setupConnection();
		}catch(IOException e) {
			handleError(e.getMessage());
		}
		
		t.start();
	}
	
	private void setupConnection() throws IOException{
		listener = new ServerSocket(9999);
		socket = listener.accept();
		System.out.println("연결됨");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	public static void main(String[] args) {
		ChatServer frame = new ChatServer();
	}
	
	private class Receiver extends JTextArea implements Runnable{
		public void run() {
			String inputMessage = null;
			String split[] = null;
			
			while(true) {
				
				try {
					inputMessage = in.readLine();
					split = inputMessage.split("-");
					
					if(split.length<3)
					{
						inputMessage = split[0]+ split[1];
					}
					else
					{
						inputMessage = split[0] + split[1] +".jpg"+split[2];
					}
				}catch(IOException e) {
					handleError(e.getMessage());
				}
				
				clientMessage.append("\n"+inputMessage);
				int pos = clientMessage.getText().length();
				clientMessage.setCaretPosition(pos);				
			}
			
		}
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()  == serverMessage) {
			int Index =IconBox.getSelectedIndex();
			String IconName = IconBox.getItemAt(Index).toString();
			String outputMessage ="";
			
			if(IconName.equals("noIcon"))
			{
				outputMessage = NickName.getText()+">"+"-"+serverMessage.getText();
			}
			else
			{
				outputMessage = NickName.getText()+">"+"-"+IconName+"-"+serverMessage.getText();
			}
			
			try {
				out.write(outputMessage+"\n");
				out.flush();
				clientMessage.append("\n"+outputMessage);
				int pos = clientMessage.getText().length();
				clientMessage.setCaretPosition(pos);
				serverMessage.setText(null);
			}catch(IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}

}
