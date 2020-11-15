package 복습;

public class 데이터연산자 {

	public static void main(String[] args) {
		// 기본데이터: 정수, 실수, 문자, 논리
		double 온도 = 25.5;
		float 몸무게 = 99.9F;	//f
		
		byte age = 100;	//-128~127
		short distance = 20000; //+-3만
		int high = 100;	//+-21억
		long space = 2111111111L;	//1
		
		char gender = '남';	//한글자
		
		boolean check = true;	//false
		
		System.out.println(age + distance);
		System.out.println(age == distance);
		System.out.println(age != distance);
		
		//int와 int계산은 무조건 int
		int sum = high + 1;	//101
		int count = 5;
		//하나라도 double이면 계산의 결과는 무조건 double
		System.out.println(sum / (double)count);
		//강제타입변환 => (변경하고자 하는 타입) 변수명
		//캐스팅casting
		
		
	}

}
