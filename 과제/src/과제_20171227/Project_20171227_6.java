package 과제_20171227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Project_20171227_6 extends JFrame {
//	6. 학생성적을 국어, 영어,수학 점수로 입력받을 수 있게 UI를 구성하고
//		학점 버튼을 만들어서 버튼을 누르면 평균점수에 따라서
//		90~100 A학점 표시
//		80~89  B학점 표시
//		70~79  C학점 표시
//		60~69  D학점 표시
//		60미만 F학점 표시 
	
	public Project_20171227_6() {
		setTitle("학점 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel iKor = new JLabel("국어 성적");
		iKor.setLocation(75,30);
		iKor.setSize(100,20);
		add(iKor);
		JTextField iKor2 = new JTextField("");
		iKor2.setLocation(205, 30);
		iKor2.setSize(100, 20);
		add(iKor2);
		
		JLabel iEng = new JLabel("영어 성적");
		iEng.setLocation(75,60);
		iEng.setSize(100,20);
		add(iEng);
		JTextField iEng2 = new JTextField("");
		iEng2.setLocation(205,60);
		iEng2.setSize(100, 20);
		add(iEng2);
		
		JLabel iMath = new JLabel("수학 점수");
		iMath.setLocation(75,90);
		iMath.setSize(100,20);
		add(iMath);
		JTextField iMath2 = new JTextField("");
		iMath2.setLocation(205,90);
		iMath2.setSize(100, 20);
		add(iMath2);

		JLabel Score = new JLabel();
		Score.setBounds(130, 170, 150, 90);
		add(Score);
		
		JButton ScoreBtn = new JButton("학점 계산");
		ScoreBtn.setLocation(150, 140);
		ScoreBtn.setSize(95, 28);
		add(ScoreBtn);
		
		ScoreBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iKor_ck = Integer.parseInt(iKor2.getText());
				int iEng_ck = Integer.parseInt(iEng2.getText());
				int iMath_ck = Integer.parseInt(iMath2.getText());
				
				int total = iKor_ck+iEng_ck+iMath_ck;
				float avg = total/3.0f;
				
				switch((int)avg/10) {
				case 10:
				case 9:
					Score.setText("당신의 학점은 : A 입니다.");
					break;
				case 8:
					Score.setText("당신의 학점은 : B 입니다.");
					break;
				case 7:
					Score.setText("당신의 학점은 : C 입니다.");
					break;
				case 6:
					Score.setText("당신의 학점은 : D 입니다.");
					break;
				default:
					Score.setText("당신의 학점은 : F 입니다.");
					break;
				}
			}
		});
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_6();
	}

}
