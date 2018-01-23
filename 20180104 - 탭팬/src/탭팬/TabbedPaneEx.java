package ÅÇÆÒ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneEx extends JFrame {
	public TabbedPaneEx() {
		setTitle("ÅÇÆÒ ¸¸µé±â ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane pane = createTabbedPane();
		add(pane, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}
	
	JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP);
		pane.addTab("tab1", new JLabel(new ImageIcon("images/cat.jpg")));
		pane.addTab("tab2", new JLabel(new ImageIcon("images/dog.jpg")));
		pane.addTab("tab3", new MyPanel());
		return pane;
	}
	
	class MyPanel extends JPanel{
		MyPanel(){
			this.setBackground(Color.yellow);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.BLACK);
			g.drawString("tab 3¿¡ µé¾î°¡´Â JPanel ÀÔ´Ï´Ù.", 30, 50);
		}
	}

	public static void main(String[] args) {
		new TabbedPaneEx();
	}

}
