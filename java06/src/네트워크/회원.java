package 네트워크;

public class 회원 {
	String id;
	String pw;
	String name;
	String tel;
	
	//입력값이 없는 클래스이름과 동일한 메서드가 자동으로 만들어지게 되어있음
	public 회원() {
	}
	
	public 회원(String a, String b, String c, String d) {
		id = a;
		pw = b;
		name = c;
		tel = d;
	}
	
	@Override
	public String toString() {
		return id + "\t" + pw + "\t" + name + "\t" + tel;
	}
}
