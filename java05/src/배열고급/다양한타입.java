package 배열고급;

import java.util.ArrayList;

public class 다양한타입 {

	public static void main(String[] args) {
//		내가 가방에 가지고 있는 물건들 순서
//		--------------------
		ArrayList list = new ArrayList();
//		1) 필통, 휴대폰, 1000을 가지고 있었음.
		list.add("필통");
		list.add("휴대폰");
		list.add("1000");
		
//		2) 가방 목록을 프린트
		System.out.println(list);
		
//		3) 2000이 추가되었음. => 전체 목록 프린트
		list.add(2000);
		System.out.println(list);
		
//		4) 필통을 뺐음. => 프린트
		list.remove(0);
		System.out.println(list);
		
//		5) 현재 남아있는 가방의 물건들 개수 프린트
		System.out.println(list.size());
	}

}
