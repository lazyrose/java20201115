package 클래스활용;

import 클래스만들기.Phone;

public class Phone활용 {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.color = "검정";
		p1.company = "apple";
		System.out.println("p1전화기색 " + p1.color);
		System.out.println("p1전화기회사 " + p1.company);
		p1.call();
	}

}
