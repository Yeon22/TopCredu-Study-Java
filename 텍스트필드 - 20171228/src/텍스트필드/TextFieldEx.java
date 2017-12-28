package 텍스트필드;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("이름  : "));
		add(new JTextField(10));
		add(new JLabel("학과  : "));
		add(new JTextField("     컴퓨터공학과      "));
		add(new JLabel("주소  : "));
		add(new JTextField("서울시 ...",20));
		
		setSize(340, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx();
	}

}
