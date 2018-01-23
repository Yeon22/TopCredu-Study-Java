package 콤보박스;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboActionEx extends JFrame{
	Container contentPane;
	String [] fruits = {"apple", "banana", "kiwi", "mango"};
	ImageIcon [] images = {
		new ImageIcon("images/apple.jpg"),
		new ImageIcon("images/banana.jpg"),
		new ImageIcon("images/kiwi.jpg"),
		new ImageIcon("images/mango.jpg")
	};
	JLabel imgLabel = new JLabel(images[0]);
	
	ComboActionEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource(); // 이벤트가 발생한 객체를 가져온다.
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboActionEx();
	}

}
