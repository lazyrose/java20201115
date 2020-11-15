package 배열고급;

public class 깊은복사 {

	public static void main(String[] args) {
		int[] term1 = {100, 80, 90};
		//참조형 변수를 복사하는 경우 얕은 복사는
		//주소가 가르키는 값들을 복사하지 않는다.!
		//int[] term2 = term1;//얕은 복사(얕게 주소만 복사)
		int[] term2 = term1.clone(); //깊은 복사
		System.out.println("term1: " + term1);
		System.out.println("term2: " + term2);
		term2[0] = 99;
		for (int x : term1) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : term2) {
			System.out.print(x + " ");
		}
	
	}

}
