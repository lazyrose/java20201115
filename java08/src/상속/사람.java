package 상속;

public class 사람 extends Thread{
	//상태
	String name;
	int age;
	
	//동작
	public void eat() {
		System.out.println("사람이 먹다");
	}
}
