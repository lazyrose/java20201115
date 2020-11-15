package 배열;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		int[] 정답 = new int[990];
		int[] 내답 = new int[990];
		
		Random r = new Random(42);
		//씨앗값 : seed값
		for (int i = 0; i < 정답.length; i++) {
			정답[i] = r.nextInt(4) + 1;	//0~3 => 1~4
		}
		for (int i = 0; i < 내답.length; i++) {
			내답[i] = r.nextInt(4) + 1;	//0~3 => 1~4
		}
		int jumsu = 0;
		for (int i = 0; i < 정답.length; i++) {
			System.out.println(i + 1 + ": " + 정답[i] + " <-> " + 내답[i]);
			if (정답[i] == 내답[i]) {
				jumsu++;
			}
		}
		System.out.println("점수는 " + jumsu + "점");
	}

}
