package 인터페이스;

public class 휴대폰잭사용 {

	public static void main(String[] args) {
		애플잭 apple = new 애플잭();
		apple.납작하게만들다();
		apple.핀8로만들다();
		apple.레벨을나누어서만들다();
		
		//인터페이스는 부모의 역할을 할 수 있다.
		//부모(큰)<-작
		바나나잭 apple = new 바나나잭();
		apple.납작하게만들다();
		apple.핀8로만들다();
	}

}
