package 예외처리;

public class 예외처리2사용 {

	public static void main(String[] args) {
		예외처리2 ex = new 예외처리2();
		try {
			ex.open();
		} catch (Exception e) {
			System.out.println("에러가 발생해서 main에서 예외처리함");
		}
		System.out.println("실행가능?");
	}

}
