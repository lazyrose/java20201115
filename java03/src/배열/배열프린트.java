package 배열;

public class 배열프린트 {

	public static void main(String[] args) {
		/*
		int t = 0;	//쓰레기값 상태는 변수는 값을 프린트x, 연산x
		//처음값을 넣어주는 것을 변수 초기화
		System.out.println(t);
		*/
		
		int[] s = new int[100];	//0으로 자동 초기화
		s[0] = 100;
		s[s.length - 1] = 900;	//배열은 자동 초기화
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ": " + s[i]);
		}
	}

}
