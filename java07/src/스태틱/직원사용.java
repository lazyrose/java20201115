package 스태틱;

public class 직원사용 {

	public static void main(String[] args) {
		직원 w1 = new 직원("홍길동", "남", 25);
		직원 w2 = new 직원("김길동", "여", 22);
		직원 w3 = new 직원("송길동", "남", 24);
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(직원.count + "명");
		//System.out.println(직원.sum/직원.count + "세");
		System.out.println(w1.getAvg() + "세");
	}

}
