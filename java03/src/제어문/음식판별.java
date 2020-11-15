package 제어문;

import javax.swing.JOptionPane;

public class 음식판별 {

	public static void main(String[] args) {
		//실습
		String data = JOptionPane.showInputDialog("당신이 먹고 싶은 음식은? 1)짜장  2)우동  3)라면");
		switch (data) {
		case "1":
			System.out.println("1이면 중국집으로 가요");
			break;
		case "2":
			System.out.println("2이면 일식집으로 가요");
			break;
		case "3":
			System.out.println("3이면 분식집으로 가요");
			break;
		default:
			System.out.println("위에 것 중에 없으면 집에서 먹어요");
			break;
		}

	}

}
