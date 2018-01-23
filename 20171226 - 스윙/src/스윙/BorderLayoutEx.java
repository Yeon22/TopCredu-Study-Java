package 스윙;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		setTitle("BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(10,10));
		
		//위에 붙여라
		add(new JButton("add"),BorderLayout.NORTH);
		//맨밑에 붙여라
		add(new JButton("sub"),BorderLayout.SOUTH);
		//오른쪽에 붙여라
		add(new JButton("mul"),BorderLayout.EAST);
		//왼쪽에 붙여라
		add(new JButton("div"),BorderLayout.WEST);
		//센터 중앙에 붙여라
		add(new JButton("Calculate"),BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
