package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 증권정보프로그램 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,200);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("카카오");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// 카카오 크롤링해서 파일로 저장
			네이버증권접속 증권 = new 네이버증권접속();
				try {
					증권.open("005930");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(74, 28, 140, 33);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				네이버증권접속 증권 = new 네이버증권접속();
				try {
					증권.open("005930");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(74, 97, 140, 33);
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);
	}
}
