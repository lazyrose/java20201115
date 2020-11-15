package 반복문;

import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		//실습
		//int score = 88;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A학점");
		}else if (score >= 80 && score < 90) {
			System.out.println("B학점");
		}else if (score >= 70 && score < 80) {
			System.out.println("C학점");
		}
		else{
			System.out.println("F학점");
		}

	}

}
