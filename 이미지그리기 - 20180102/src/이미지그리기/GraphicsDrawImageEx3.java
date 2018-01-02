package 이미지그리기;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import 이미지그리기.GraphicsDrawImageEx2.MyPanel;

public class GraphicsDrawImageEx3 extends JFrame {
	Container contentPane;
	
	public GraphicsDrawImageEx3() {
		setTitle("drawImage 사용 예제 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageicon = new ImageIcon("images/cat.jpg");
		Image image = imageicon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}

}
