package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		//JButton b1 = new JButton();
		//b1.setText("push me");
		
		//JButton b2 = new JButton();
		//b2.setText("push me too");
		
		//f.add(b1);
		//f.add(b2);
		
		/*
		for (int i = 0; i < 50; i++) {
			JButton b1 = new JButton();
			b1.setText(i + "push me");
			f.add(b2);
		}
		*/
		
		//FlowLayout flow = new FlowLayout();
		//f.setLayout(flow);
		
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB20C\uB7EC\uC694!");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(96, 91, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBC84\uD2BC");
		btnNewButton_1.setBounds(203, 91, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("push");
		btnNewButton_2.setBounds(312, 91, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);

	}
}
