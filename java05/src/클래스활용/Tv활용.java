package 클래스활용;

import 클래스만들기.Tv;

public class Tv활용 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.on();
		tv.off();
		tv.shape = "네모";
		tv.size = 42;
		System.out.println(tv);
		
		Tv tv2 = new Tv();
		tv2.off();
		tv2.shape = "네모";
		tv.size = 55;
		System.out.println(tv2);
		
		
		
		
		
		
		
		
		
	}

}
