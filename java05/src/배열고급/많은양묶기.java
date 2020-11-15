package 배열고급;

import java.util.ArrayList;
import java.util.Date;

public class 많은양묶기 {

	public static void main(String[] args) {
		//다른 타입들, 크기가 유동
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(55.55);
		list.add(true);
		System.out.println("개수: " +  list.size());
		System.out.println(list);
		Date date = new Date();
		list.add(date);
		System.out.println("개수: " +  list.size());
		System.out.println(list);
		list.remove(3);
		System.out.println("개수: " +  list.size());
		System.out.println(list);
		
		
		

	}

}



