package 복습;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의 {

	public static void main(String[] args) {
		// 자바는 부품조립식 언어(객체 지향언어, OOP)
		// 컨트롤 + 스페이스바 : 자동완성
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		f.setSize(300, 300); //가로, 세로값
		
		b1.setText("강아지");
		f.add(b1);
		
		b1.setIcon(Icon);
		
		f.setVisible(true);
	}

}
