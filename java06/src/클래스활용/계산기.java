package 클래스활용;

public class 계산기 {
	String color;	//상태: 멤버변수, 전역변수(글로벌변수, global)
	
	//기능: 멤버메서드(=함수, 명령어)
	public void add() {
		int price = 0;	//선언 <- 선언의 위치가 중요
		//지역변수(로컬변수, local)
		//해당 메서드 지역에서만 쓸 수 있음
		//선언의 위치가 사용할 수 있는 범위가 된다
		// 지역변수는 자동초기화가 안되어서 쓰레기값이 들어가 있다
		// 프로그래머가 초기화를 시켜주어야한다
		System.out.println(price);
		
		//전역변수는 자동초기화가 된다
		System.out.println(color + "색 계산기로 더하다");
	}
	public void mul() {	//곱하기 기능 처리
		System.out.println(color + "색 계산기로 곱하다");
	}
}
