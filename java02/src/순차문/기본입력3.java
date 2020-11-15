package 순차문;

import javax.swing.JOptionPane;

public class 기본입력3 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("숫자1 입력");	//200
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		
		System.out.println(n1 + n2); 	//결합연산자(1개 이상 String)
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		System.out.println(n11 + n22); 	//산술연산자

	}

}
