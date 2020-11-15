package 배열;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화앨범만들기 {
	static int count = 2;

	public static void main(String[] args) {
		
		String[] title = {"삼진그룹 영어토익반", "담보", "위플래쉬", "미스터트롯: 더 무비", "소리도 없이"};
		String[] list = {"001.png", "002.png", "003.png", "004.png", "005.png"};
		double[] jumsu = {9.27, 9.18, 8.87, 8.93, 7.89};
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500,500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel top = new JLabel(title[2]);
		top.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		f.getContentPane().add(center, BorderLayout.CENTER);
		//컨트롤+쉬프트+o
		ImageIcon icon = new ImageIcon(list[2]);
		center.setIcon(icon);
		
		JLabel sub = new JLabel(jumsu[2] + "점");
		sub.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		
		JButton button2 = new JButton("<<");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count > 0) {
					count--;	//1<-2
					top.setText(title[count]);
					ImageIcon icon = new ImageIcon(list[count]);
					senter.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "왼쪽 마지막입니다");
				}
			}
		});
		f.getContentPane().add(button2, BorderLayout.WEST);
		
		JButton button = new JButton(">>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count < 4) {
					count++;	//2<-3
					top.setText(title[count]);
					ImageIcon icon = new ImageIcon(list[count]);
					senter.setIcon(icon);
				}else {
					JOptionPane.showMessageDialog(f, "오른쪽 마지막입니다");
				}
			}
		});
		f.getContentPane().add(button, BorderLayout.EAST);
		
		//맨 끝에 있어야 한다
		f.setVisible(true);
	}
}
