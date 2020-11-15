package 연산자;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		// 실습
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		System.out.println("두 수의 합은 " + (num1 + num2));
		System.out.println("두 수의 차는 " + (num1 - num2));
		System.out.println("두 수의 곱은 " + (num1 * num2));
		System.out.println("두 수의 나눗셈은 " + (num1 / num2));
		
		JOptionPane.showMessageDialog(null, num1+num2);
		//null, 없다라는 의미, 널
	}

}
