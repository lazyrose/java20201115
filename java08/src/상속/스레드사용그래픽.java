package ���;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Date;
import java.awt.Color;

public class ��������׷��� extends JFrame{
	JLabel c, i, d;	//���������� ����. �۷ι� ����
	
	public ��������׷���() {
		getContentPane().setBackground(new Color(0, 139, 139));
		setTitle("���� ������ ���α׷���");
		setSize(1000, 300);
		
		c = new JLabel("ī���� ���� �κ�");
		c.setFont(new Font("����", Font.BOLD, 30));
		getContentPane().add(c, BorderLayout.NORTH);
		
		i = new JLabel("�̹��� ���� �κ�");
		i.setFont(new Font("����", Font.BOLD, 20));
		getContentPane().add(i, BorderLayout.EAST);
		
		d = new JLabel("��¥ ���� �κ�");
		d.setFont(new Font("����", Font.BOLD, 20));
		getContentPane().add(d, BorderLayout.SOUTH);
		
		Counter2 cc = new Counter2();
		��¥2 dd = new ��¥2();
		�̹���2 im = new �̹���2();
		cc.start();
		dd.start();
		im.start();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		��������׷��� name = new ��������׷���();
	}
	
	//����Ŭ����(inner class)
	public class Counter2 extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 6000; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("�����߻�!!");
				}
				c.setText("ī����: " + i);
			}
		}
	}
	
	public class ��¥2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5000; i++) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("����");
				}
				Date date = new Date();
				d.setText(date + " ");	//String.valueof(date)�� ���� ��
			}
		}
	}

	public class �̹���2 extends Thread{
		@Override
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int j = 0; j < 5; j++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					System.out.println("cpu���� ������ ����");
				}
				ImageIcon icon = new ImageIcon(list[j]);
				i.setIcon(icon);
			}
		}
	}
}
