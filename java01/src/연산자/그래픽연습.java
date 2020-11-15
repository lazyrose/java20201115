package 연산자;

import javax.swing.JOptionPane;

public class 그래픽연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력");	//홍길동
		System.out.println(name);
		//int age = 100;
		//외부에서 입력해서 변수에 넣어주는 경우는 
		//컴퓨터는 무조건 String 처리함
		String age = JOptionPane.showInputDialog("나이를 입력");
		int age2 = Integer.parseInt(age);
		
		//System.out.println(age + 1 + "세");
		//숫자가 고정되어 숫자를 입력했을때 문자로 인식, 201세로 나옴
		System.out.println(age2 + 1 + "세");
	}

}
