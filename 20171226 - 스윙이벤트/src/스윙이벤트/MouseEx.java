package 스윙이벤트;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyMouseListener implements MouseListener {
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 버튼 안쪽에 들어가질 때
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 버튼 안쪽에 있다가 나올 때
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.yellow);
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
}


public class MouseEx extends JFrame {
	MouseEx(){
		setTitle("버튼에 Mouse이벤트 리스너를 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.yellow);
		
		//이벤트를 붙이겠다.
		MyMouseListener listener = new MyMouseListener();
		//마우스 이벤트를 버튼이 동작할 때
		btn.addMouseListener(listener);
		
		add(btn);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEx();

	}

}
