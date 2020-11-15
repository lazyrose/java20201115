package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 sup = new 수퍼맨();
		sup.age = 385;
		sup.name = "클라크";
		sup.speed = 1000;
		sup.eat();
		sup.run();
		sup.space();
		System.out.println(sup);
	}

}
