package 네트워크;

public class 계좌 {
	String name;
	String field;
	int price;
	
	public void 입금하다() {
		System.out.println(name + "가 " + price + "원 입금하다");
	}
	public void 출금하다() {
		System.out.println(name + "가 " + price + "원 출금하다");
	}
	@Override
	public String toString() {
		return "계좌 [이름=" + name + ", 종류=" + field + ", 금액=" + price + "]";
	}
	
	//원래 있던 메서드를 똑같이 다시 써주면 다시 써준 메서드가 실행
	//=> 재정의(override, 오버라이드)
	/*
	public String toString() {
		return name + ", " + field + ", " + price;
	}
	*/
	
}
