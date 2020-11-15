package 데이터;

public class 나 {

	public static void main(String[] args) {
		// 실습1
		int age = 100;
		char gender = '여';
		double eye = 1.5;
		//타입 변수명; //렘에 공간이 할당, 선언
		//자바는 선언할 때 램에 공간이 만들어진다.
		boolean food = true;
		
		food = false;	//값 변경(변수명 = 바꿀 값;)
		
		String name = "홍길동";	//스트링(실): 홍--길--동
								//기본 데이터가 아니므로 첫 글자는 대문자로 적음
								//String(o), string(x)
		
		System.out.println("내 이름은 "+ name+ "입니다.");
		System.out.println("내 나이는 "+ age+ "입니다.");
		System.out.println("나는 "+ gender+ "입니다.");
		System.out.println("내 시력은 "+ eye+ "입니다.");
		System.out.println("나는 점심을 먹었나? "+ food);
	}

}
