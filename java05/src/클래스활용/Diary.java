package 클래스활용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Diary {
	static JLabel l1, l2, l3;
	static JTextField t1, t2, t3;
	static JButton b1;
	
	public void open() {
		JFrame f = new JFrame();
		f.setSize(500, 550);
		f.setTitle("일기써서 파일에 저장하자!!");
		f.getContentPane().setBackground(Color.yellow);
		f.setLayout(new FlowLayout());
		l1 = new JLabel("날짜");
		l2 = new JLabel("제목");
		l3 = new JLabel("내용");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		
		l1.setForeground(Color.BLUE);
		l2.setForeground(Color.BLUE);
		l3.setForeground(Color.BLUE);
		
		b1 = new JButton();
		ImageIcon icon = new ImageIcon("save.png");
		b1.setIcon(icon);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		
		f.setVisible(true);
	}

}
