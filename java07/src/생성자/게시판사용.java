package 생성자;

import 복습.게시판;

public class 게시판사용 {

	public static void main(String[] args) {
		게시판 b3 = new 게시판("월요일", "학교감", "박길동");
		System.out.println(b3);
		
		게시판 b1 = new 게시판();
		//멤버변수는 각 객체마다 메모리가 따로 만들어짐
		b1.title = "토요일";
		b1.content = "토요일 오후";
		b1.writer = "홍길동";
		//멤버메서드는 객체가 만들어지고 나서, 그 객체로 언제든 원본영역에 있는거 호출해서 쓸 수 있음
		b1.글쓰기();
		System.out.println(b1);
		
		게시판 b2 = new 게시판();
		b2.title = "일요일";
		b2.content = "주말 끝";
		b2.writer = "송길동";
		b2.글쓰기();

		
	}

}
