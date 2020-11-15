package 순차문;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// 실습
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? ");
		String name = sc.nextLine();
		
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		
		System.out.print("나의 몸무게는? ");
		double weight = sc.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean();
		
		System.out.print("나의 좌우명은? ");
		String life = sc.nextLine();
		
		// 중간에 사용하지 않을 enter 인식하는 경우, nextLine()으로 처리
		sc.nextLine();
		
		System.out.println("---------------------");
		System.out.println("내 이름은 " + name);
		System.out.println("내 내년 키는 " + (height + 10));
		System.out.println("내 내년 몸무게는 " + (weight - 10));
		System.out.println("나는 저녁을 " + dinner);
		System.out.println("나의 좌우명은 " + life);
	}

}
