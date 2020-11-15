package 형변환;

import java.util.ArrayList;

public class 리스트연습 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");	//Object<--String(작), 자동형변환
		list.add(100);
		list.add(11.11);
		list.add(new 사람());
		String name = (String)list.get(0);
		//String(작) <-- Object(큰), 강제형변환
		//자동형변환을 하는 경우, 부모클래스의 메서드가 더 적으므로 자식클래스에서 추가된 메서드를 사용할 수 없다
		//자식클래스의 추가된 메서드를 사용하고자 하는 경우에는 강제형변환해서 자식클래스로 만들어준 후 사용가능
		
	}

}
