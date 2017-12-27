package 스윙연습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


class OutClass implements ActionListener{
//	static을 안 쓰고 함수로 가져다 쓰려고 할 때
//	JLabel CurTime;
//	OutClass(JLabel Cur){
//		CurTime = Cur;
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		Test.CurTime.setText(hour+":"+minute+":"+second);
//		CurTime.setText(hour+":"+minute+":"+second);
	}
}


public class Test extends JFrame implements ActionListener{
//	JLabel CurTime;
	public static JLabel CurTime;
	
	Test() {
		setTitle("4개 클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		CurTime = new JLabel("현재 시각");
		//좌표 x,y, 크기 가로크기,세로크기
		CurTime.setBounds(100,100,100,40);
		
		
		JButton timebtn = new JButton("외부클래스");
		timebtn.setBounds(50, 200, 100, 30);
		//이벤트 리스너
		OutClass al = new OutClass();
//		OutClass al = new OutClass(CurTime);
		timebtn.addActionListener(al);
		
		
		JButton timebtn2 = new JButton("내부클래스");
		timebtn2.setBounds(150,200,100,30);
		//이벤트 리스너
		InnerClass il = new InnerClass();
		timebtn2.addActionListener(il);
		
		
		JButton timebtn3 = new JButton("익명클래스");
		timebtn3.setBounds(250,200,100,30);
		timebtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar now = Calendar.getInstance();
				int hour = now.get(Calendar.HOUR);
				int minute = now.get(Calendar.MINUTE);
				int second = now.get(Calendar.SECOND);
				
				CurTime.setText(hour+":"+minute+":"+second);
			}
		});
		
		
		JButton timebtn4 = new JButton("메인클래스");
		timebtn4.setBounds(350,200,100,30);
		timebtn4.addActionListener(this);
		
		
		add(CurTime);
		add(timebtn);
		add(timebtn2);
		add(timebtn3);
		add(timebtn4);
		setSize(500, 400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Test();
	}
	
	
	class InnerClass implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Calendar now = Calendar.getInstance();
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			CurTime.setText(hour+":"+minute+":"+second);
		}
	}

//	메인클래스
	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		CurTime.setText(hour+":"+minute+":"+second);
	}

}
