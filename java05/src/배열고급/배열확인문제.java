package 배열고급;

import java.util.Random;

public class 배열확인문제 {

	public static void main(String[] args) {
//		1. 실수 값 500개를 만들어보세요.
//		   랜덤사용, 빈배열 만들기
		Random r = new Random();
		double[] n = new double[500];

//		   랜덤하게 만든 값들 배열에 넣기
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextDouble();
		}
//
//		2. 이 중 최소값을 찾아보세요.
//		   배열의 첫번째값을 최소값 넣는 변수에 넣어두기
		double min = n[0];
//		   for문을 돌려서 배열을 쭉 순서대로 꺼내 최소값과 비교
		for (int i = 0; i < n.length; i++) {
//		   비교해서 최소값보다 작으면, 최소값의 변수로 저장
			if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.println("최소값은 " + min);
//
//		3. 최소값을 가지는 개수는 몇개인가요?
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (min == n[i]) {
				count++;
			}
		}
		System.out.println(count);

//		4. 실수 값 500개를 또 하나 만들어보세요.
		double[] n2 = new double[500];

//		   랜덤하게 만든 값들 배열에 넣기
		for (int i = 0; i < n2.length; i++) {
			n2[i] = r.nextDouble();
		}

//		5. 두 실수 값들이 동일한 것은 몇 개인가요?
		int count2 = 0;
		for (int i = 0; i < n2.length; i++) {
			if (n[i] == n2[1]) {
				count2++;
			}
		}
		System.out.println("두 배열의 일치값 개수: " + count2 + "개");
		
		
		
		
		
		
		
		
	}

}
