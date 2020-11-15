package 스태틱;

public class 미사일사용 {

	public static void main(String[] args) {
		미사일 m1 = new 미사일("미사일1.png", 100);
		System.out.println(미사일.count);
		미사일 m2 = new 미사일("미사일2.png", 200);
		System.out.println(미사일.count);
		미사일 m3 = new 미사일("미사일3.png", 300);
		System.out.println(미사일.count);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

}
