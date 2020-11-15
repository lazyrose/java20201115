package 복습;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 나의버튼들 {
	private static JTextField text;


	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100) + 1;
		JFrame f = new JFrame();
		f.setTitle("숫자 맞추기 게임");
		f.setSize(300,300);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("숫자를 맞춰보자");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				public void actionPerformed(ActionEvent arg0) {
					//count = count + 1;
					count++;	//증감연산자
				}
				
				String data = text.getText();	//"88"
				int data2 = Integer.parseInt(data);
				text.setText("");
				JOptionPane.showMessageDialog(f, "입력한 데이터는 " + data2);
				
				if (target == data2) {	//비교연산자의 결과는 true/false
					JOptionPane.showMessageDialog(f, "정답입니다.");
				} else if (target > data2) {
					JOptionPane.showMessageDialog(f, "작아요.");
				} else {
					JOptionPane.showMessageDialog(f, "커요.");
				}
			}
		});
		
		b1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b1.setBounds(32, 178, 222, 52);
		f.getContentPane().add(b1);
		
		text = new JTextField();
		text.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		text.setBounds(55, 88, 176, 45);
		f.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("당신이 생각한 숫자를 입력하세요");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(32, 34, 222, 15);
		f.getContentPane().add(lblNewLabel);
		f.setVisible(true);
	}
}
