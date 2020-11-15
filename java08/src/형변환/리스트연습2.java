package 형변환;

import java.util.ArrayList;

public class 리스트연습2 {

	public static void main(String[] args) {
		//<> : 객체생성시 프로그래머가 타입을 결정할 수 있는 문법
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		list.add("송길동");
		String name = list.get(0);
	}

}
