package ũ�Ѹ�;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �����������α׷� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,200);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("īī��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// īī�� ũ�Ѹ��ؼ� ���Ϸ� ����
			���̹��������� ���� = new ���̹���������();
				try {
					����.open("005930");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton.setBounds(74, 28, 140, 33);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("�Ｚ����");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				���̹��������� ���� = new ���̹���������();
				try {
					����.open("005930");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_1.setBounds(74, 97, 140, 33);
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);
	}
}
