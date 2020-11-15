package 네트워크;

public class 회원가입 {

	public static void main(String[] args) {
		System.out.println("id\tpw\tname\ttel");
		System.out.println("----------------------------");
		
		회원 m1 = new 회원("root", "1234", "park", "011");
		//m1.id = "root";
		//m1.pw = "1234";
		//m1.name = "park";
		//m1.tel = "011";
		System.out.println(m1);
		
		회원 m2 = new 회원("admin", "1111", "kim", "012");
		//m2.id = "admin";
		//m2.pw = "1111";
		//m2.name = "kim";
		//m2.tel = "012";
		System.out.println(m2);
		
		회원 m3 = new 회원();
		m3.id = "apple";
		m3.pw = "2222";
		m3.name = "song";
		m3.tel = "013";
		System.out.println(m3);
		
		회원 m4 = new 회원();
		m4.id = "melon";
		m4.pw = "3333";
		m4.name = "jung";
		m4.tel = "014";
		System.out.println(m4);
	}

}
