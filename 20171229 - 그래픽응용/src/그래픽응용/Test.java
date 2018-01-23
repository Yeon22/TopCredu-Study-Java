package 그래픽응용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame {
	Container contentPane;
	JLabel NameBungi[] = new JLabel[4];
	JTextField Bungi[] = new JTextField[4];
	MyPanel panel;
	//백분율로 구하는
	int bun[] = new int [4];
	
	
	Test(){
		setTitle("그래픽응용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		
		panel = new MyPanel();
		
		JPanel p = new JPanel();
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		p.setLayout(grid);
		
		bun[0] = 150;
		bun[1] = 200;
		bun[2] = 250;
		bun[3] = 320;
		
		NameBungi[0] = new JLabel("1/4분기");
		NameBungi[1] = new JLabel("2/4분기");
		NameBungi[2] = new JLabel("3/4분기");
		NameBungi[3] = new JLabel("4/4분기");
		
		Bungi[0] = new JTextField(10);
		Bungi[1] = new JTextField(10);
		Bungi[2] = new JTextField(10);
		Bungi[3] = new JTextField(10);
		
		JButton input = new JButton("입력");
		input.addActionListener(new MyActionListener());
		
		for(int i=0; i<4; i++) {
			p.add(NameBungi[i]);
			p.add(Bungi[i]);
		}
		
		contentPane.add(p, BorderLayout.NORTH);
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(input,BorderLayout.SOUTH);
		
		setSize(300,500);
		setVisible(true);
	}
	
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for(int i=0; i<bun.length; i++) {
				bun[i] = Integer.parseInt(Bungi[i].getText());
			}
			
			repaint();
		}
	}
	
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.drawString("매출현황", 10, 130);
			
			g.setColor(Color.BLACK);
			g.drawString("1/4분기", 10, 150);
			g.drawString("2/4분기", 10, 170);
			g.drawString("3/4분기", 10, 190);
			g.drawString("4/4분기", 10, 210);
			
			g.setColor(Color.GREEN);
			float sum = 0.0f;
			for(int i=0; i<4; i++) {
				sum += bun[i];
			}
			float back[] = new float[4];
			//백분율
			//1/4  /전체*100
			//2/4  /전체*100
			for(int i=0; i<4; i++) {
				back[i] = (float)bun[i]/sum * 100 * 5;
			}
			
			g.fillRect(80, 140, (int)back[0], 15);
			g.fillRect(80, 160, (int)back[1], 15);
			g.fillRect(80, 180, (int)back[2], 15);
			g.fillRect(80, 200, (int)back[3], 15);
		}
	}

	public static void main(String[] args) {
		new Test();
	}

}
