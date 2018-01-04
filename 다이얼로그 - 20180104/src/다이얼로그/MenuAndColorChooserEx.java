package 다이얼로그;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuAndColorChooserEx extends JFrame {
	JLabel label = new JLabel("Hello");
	
	public MenuAndColorChooserEx() {
		setTitle("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem colorMenuItem = new JMenuItem("Color");
		JMenu fileMenu = new JMenu("Text");
		colorMenuItem.addActionListener(new MenuActionListener());
		fileMenu.add(colorMenuItem);
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{
		JColorChooser chooser = new JColorChooser();
		
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) {
				Color selectedColor = chooser.showDialog(null, "Color", Color.BLUE);
				if(selectedColor != null)
					label.setForeground(selectedColor);
			}
		}
	}

	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}

}
