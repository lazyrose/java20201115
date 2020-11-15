package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 그래픽 extends JFrame{

	public 그래픽() {
		setTitle("형변환");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		JButton b1 = new JButton("push");
		JButton b2 = new JButton("push me");
		JLabel l = new JLabel("im label");
		add(b1);	//Component(부모)<-- button, label(자식)
		add(b2);
		add(l);
		
		버튼처리클래스 처리 = new 버튼처리클래스();
		//b1.addActionListener(처리);
		//b2.addActionListener(처리);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1을 눌렀음");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2를 눌렀음");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		그래픽 그래픽s = new 그래픽();
	}
}
