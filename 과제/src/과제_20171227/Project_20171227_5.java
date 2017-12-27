package 과제_20171227;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Project_20171227_5 extends JFrame {
	JLabel [] label = new JLabel[16];
	
	public Project_20171227_5() {
//	5. GridLayout을 사용하여 다음 그림과 같이 Color.WHITE, Color.GRAY, Color.Red등 
//		16개의 색을 배경색으로하는 4*4 바둑판을 구성하라   힌트 : label.setOpaque(true);
		
		setTitle("Hello Embedded");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4, 4));
		Color color[] = {
				Color.RED, Color.ORANGE, Color.yellow, Color.BLUE, Color.DARK_GRAY, Color.magenta,
				Color.GREEN, Color.WHITE, Color.ORANGE, Color.BLUE, Color.PINK, 
				Color.gray, Color.LIGHT_GRAY, Color.MAGENTA, Color.RED, Color.WHITE
				};
		
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(("      "+i));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			add(label[i]);
		}
		
		setSize(500, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Project_20171227_5();
	}

}
