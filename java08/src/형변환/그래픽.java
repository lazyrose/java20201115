package ����ȯ;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �׷��� extends JFrame{

	public �׷���() {
		setTitle("����ȯ");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		JButton b1 = new JButton("push");
		JButton b2 = new JButton("push me");
		JLabel l = new JLabel("im label");
		add(b1);	//Component(�θ�)<-- button, label(�ڽ�)
		add(b2);
		add(l);
		
		��ưó��Ŭ���� ó�� = new ��ưó��Ŭ����();
		//b1.addActionListener(ó��);
		//b2.addActionListener(ó��);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư1�� ������");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư2�� ������");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		�׷��� �׷���s = new �׷���();
	}
}
