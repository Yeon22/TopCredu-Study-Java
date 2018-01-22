package 器飘弃府坷父甸扁_20180108_start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ScoreManager extends JFrame {
	JPanel panel = new JPanel();
	
	ScoreManager(){
		setTitle("己利包府矫胶袍");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu student = new JMenu("切积包府");
		menubar.add(student);
		JMenu score = new JMenu("己利包府");
		menubar.add(score);
		
		JMenuItem student_info = new JMenuItem("切积沥焊");
		student.add(student_info);
		JMenuItem score_info = new JMenuItem("己利泅炔");
		score.add(score_info);
		
		student_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Student());
				panel.setLayout(null);
			}
		});
		
		score_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Score());
				panel.setLayout(null);
			}
		});
		
		add(panel);
		setJMenuBar(menubar);
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScoreManager();
	}

}
