package 예외처리;

public class 예외처리1 {

	public static void main(String[] args) {
		System.out.println("출발");
		
		try {
			String[] name = {"홍길동", "박길동"};	//0,1
			name[2] = "송길동";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("에러 발생 유무에 관계없이 무조건 실행");
			System.out.println("파일의 close() 실행");
		}
		System.out.println("실행가능?");
	}

}
