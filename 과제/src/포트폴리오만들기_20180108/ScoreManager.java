package 포트폴리오만들기_20180108;

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
		setTitle("성적관리시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu student = new JMenu("학생관리");
		menubar.add(student);
		JMenu score = new JMenu("성적관리");
		menubar.add(score);
		
		JMenuItem student_info = new JMenuItem("학생정보");
		student.add(student_info);
		JMenuItem score_info = new JMenuItem("성적현황");
		score.add(score_info);
		JMenuItem score_graph = new JMenuItem("그래프");
		score.add(score_graph);
		
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
		
		score_graph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.revalidate();
				panel.repaint();
				panel.add(new Graph());
				panel.setLayout(null);
			}
		});
		
		add(panel);
		setJMenuBar(menubar);
		setSize(700, 800);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScoreManager();
	}

}
