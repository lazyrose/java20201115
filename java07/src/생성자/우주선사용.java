package 생성자;

import 복습.우주선;

public class 우주선사용 {

	public static void main(String[] args) {
		//s1이 프로그래머가 원한 부품(대상): object(객체)
		//new를 가지고 클래스의 객체를 만든다(생성)
		//new => 객체 생성하는 키워드
		//멤버변수들이 복사가 됨
		//클래스이름과 똑같은 메서드: 객체생성시 자동 호출
		//=> 생성자 메서드(constructor)
		//=> 객체생성시 멤버초기화
		우주선 s1 = new 우주선(100, 100, "space.jpg");
		System.out.println(s1);

		우주선 s2 = new 우주선(200, 200, "space.jpg");
		System.out.println(s2);
		
		우주선 s3 = new 우주선(300, 300, "space.jpg");
		System.out.println(s3);
	}

}
