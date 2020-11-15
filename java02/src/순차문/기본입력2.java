package 순차문;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) {
		String id1 = "root"; // 설정
		String id2 = JOptionPane.showInputDialog("아이디를 입력하세요");
		String pass1 = "abc123"; // 설정
		//String pass2 = "abc123"; // 입력
		String pass2 = JOptionPane.showInputDialog("비밀번호를 입력하세요");

		//논리연산자: and(&&, 조건이 다 맞아야함), or(||, 조건이 한 개 이상 맞아야함), not(!)
		if (id1.equals(id2) && pass1.equals(pass2)) { // true
			System.out.println("PASS");
		} else { // false
			// 컨트롤+쉬프트+f : 자동 format
			System.out.println("재입력");
		}

	}

}
