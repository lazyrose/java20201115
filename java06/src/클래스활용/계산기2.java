package 클래스활용;

public class 계산기2 {
	public void add(int x, int y) {
		//입력값이 들어가는 위치에 만들어지는 x,y
		//
		System.out.println(x + y + " 더하다");
	}
	public void minus(int a, int b, int c) {
		System.out.println((a - b - c) + " 빼다");
	}
	//public: 아무데서나 접근가능
	//int: 반환(return)되는 
	public int mul(int d, int f) {
		//void: 없다. 리턴이 없다. 넘겨줄 값이 없다.
		int result = d * f;
		System.out.println(result + " 곱하다");
		return result;
	}
}
