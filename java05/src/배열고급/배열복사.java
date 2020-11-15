package 배열고급;

public class 배열복사 {

	public static void main(String[] args) {
		//복사
		//기본형 : 값을 복사
		//참조형 : 주소를 복사
		int a = 100;
		int b = a;//기본형 복사
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a = 200;
		System.out.println("변경후--------");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		System.out.println();
		int[] c = {1,2,3}; 
		int[] d = c;
		System.out.println("c: " + c);
		for (int x : c) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("d: " + d);
		for (int x : d) {
			System.out.print(x + " ");
		}
		c[0] = 999;
		
		System.out.println("변경후--------");
		System.out.println("c: " + c);
		for (int x : c) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("d: " + d);
		for (int x : d) {
			System.out.print(x + " ");
		}
		
		
		
		
		
		
		
	}

}







