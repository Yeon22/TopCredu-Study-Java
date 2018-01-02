package 스윙과제풀이;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//	6. 학생성적을 국어, 영어,수학 점수로 입력받을 수 있게 UI를 구성하고
//	학점 버튼을 만들어서 버튼을 누르면 평균점수에 따라서
//	90~100 A학점 표시
//	80~89  B학점 표시
//	70~79  C학점 표시
//	60~69  D학점 표시
//	60미만 F학점 표시 

public class Test3 extends JFrame{
	JTextField Kor;
	JTextField Eng;
	JTextField Math;
	JButton ResultBtn;
	JLabel Result;
	
	Test3(){
		setTitle("학생성적");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(new JLabel("국어 : "));
		Kor = new JTextField(20);
		add(Kor);
		
		add(new JLabel("영어 : "));
		Eng = new JTextField(20);
		add(Eng);
		
		add(new JLabel("수학 : "));
		Math = new JTextField(20);
		add(Math);
		
		ResultBtn = new JButton("                     학점구하기                              ");
		
		ResultBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				int iKor = Integer.parseInt(Kor.getText());
				int iEng = Integer.parseInt(Eng.getText());
				int iMath = Integer.parseInt(Math.getText());
				
				float fAvg = (float)(iKor+iEng+iMath)/3.0f;
				
				if(fAvg >=90 && fAvg <=100) {
					Result.setText("A학점입니다.");
				} else if(fAvg >=80 && fAvg <90) {
					Result.setText("B학점입니다.");
				} else if(fAvg >=70 && fAvg <80) {
					Result.setText("C학점입니다.");
				} else if(fAvg >=60 && fAvg <70) {
					Result.setText("D학점입니다.");
				} else {
					Result.setText("F학점입니다.");
				}
				
			}
		});
		
		add(ResultBtn);
		
		Result = new JLabel("결과");
		add(Result);
		
		setSize(300,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test3();
	}

}
