package 스윙툴바와툴팁;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame {
	public ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/FileIcon.png")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/SaveIcon.png")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}

}
