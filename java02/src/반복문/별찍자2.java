package 반복문;

import java.util.Scanner;

public class 별찍자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 >> ");
		int s = sc.nextInt();	//1
		System.out.print("종료값 >> ");
		int e = sc.nextInt();	//10
		
		int sum = 0;
		for (int i = s; i <= e; i++) {
			//sum = sum + i;
			if (i % 2 == 0) {
				System.out.println();
			}
		}
		System.out.println("다 더한 값은 " + sum);

	}

}
