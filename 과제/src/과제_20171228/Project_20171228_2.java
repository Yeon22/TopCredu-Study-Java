package 과제_20171228;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Project_20171228_2 extends JFrame {
	Container contentPane;
	JButton Leftbtn, Rightbtn;
	JLabel imageLabel;
	ImageIcon [] image = new ImageIcon[3];
	int currentId;
	
	public Project_20171228_2() {
		setTitle("2017년 12월 28일 과제 2번");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		for(int i=0; i<image.length; i++) {
			image[i] = new ImageIcon("images_20171228/"+i+".jpg");
		}
		currentId = 0; // 현재 선택된 이미지 번호
		imageLabel = new JLabel(image[currentId]); 

		ImageIcon leftIcon = new ImageIcon("images_20171228/왼쪽화살표.jpg");
		ImageIcon rightIcon = new ImageIcon("images_20171228/오른쪽화살표.jpg");
		Leftbtn = new JButton(leftIcon);
		Rightbtn = new JButton(rightIcon);
		
		Leftbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentId --; // 이미지 번호 감소. 이전 이미지
				currentId += image.length; // currentId가 음수가 될 수 있기 때문에 3을 더함
				currentId %= image.length; // 3 이 넘는 것을 막기 위해 이미지 개수로 나머지 구함
				imageLabel.setIcon(image[currentId]); // 이미지 레이블에 이미지 변경
			}
		});
		
		Rightbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentId ++; // 이미지 번호 증가. 다음 이미지
				currentId %= image.length; // 3 이 넘는 것을 막기 위해 이미지 개수로 나머지 구함
				imageLabel.setIcon(image[currentId]); // 이미지 레이블에 이미지 변경
			}
		});
		
		contentPane.add(imageLabel,BorderLayout.CENTER);
		contentPane.add(panel,BorderLayout.NORTH);
		panel.add(Leftbtn);
		panel.add(Rightbtn);
		
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Project_20171228_2();
	}

}
