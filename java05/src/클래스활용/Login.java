package 클래스활용;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField id;
	private static JTextField pw;

	public static void main(String[] args) {
		//기본틀 부품필요
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\lim\\java_ws\\java05\\diary.png"));
		lblNewLabel.setBounds(12, 10, 446, 198);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel_1.setBounds(22, 218, 97, 49);
		f.getContentPane().add(lblNewLabel_1);
		
		id = new JTextField();
		id.setForeground(Color.RED);
		id.setFont(new Font("굴림", Font.BOLD, 45));
		id.setBounds(133, 218, 325, 49);
		f.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel_1_1.setBounds(22, 277, 97, 49);
		f.getContentPane().add(lblNewLabel_1_1);
		
		pw = new JTextField();
		pw.setForeground(Color.RED);
		pw.setFont(new Font("굴림", Font.BOLD, 45));
		pw.setColumns(10);
		pw.setBounds(133, 277, 325, 49);
		f.getContentPane().add(pw);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 id/pw가 원래의 id/pw와 일치하는지 체크
				String id2 = id.getText();//id 텍스트필드에 입력한 값 가지고 온다.
				String pw2 = pw.getText();//pw 텍스트필드에 입력한 값 가지고 온다.
				System.out.println("가지고 온 id: " + id2);
				System.out.println("가지고 온 pw: " + pw2);
				//원래 id/pw지정
				String id3 = "root";
				String pw3 = "1234";
				if ( id2.equals(id3) && pw2.equals(pw3) ) { //and연산자: 조건이 모두 true!
					JOptionPane.showMessageDialog(f, "로그인성공");
					Diary d = new Diary();
					d.open();
				} else {
					JOptionPane.showMessageDialog(f, "로그인실패!");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\lim\\java_ws\\java05\\login.png"));
		btnNewButton.setBounds(22, 360, 261, 71);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id.setText("");
				pw.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\lim\\java_ws\\java05\\reset.png"));
		btnNewButton_1.setBounds(308, 336, 139, 95);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(500, 500);
		f.setTitle("로그인 화면");
		//일기장 이미지 넣을 부분 필요
		f.setVisible(true);
	}
}
