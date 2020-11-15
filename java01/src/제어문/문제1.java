package 제어문;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// 실습
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("취미 >> ");
		String hobby = sc.next();
		System.out.print("소속 >> ");
		String cl = sc.next();
		
		System.out.println("------------------");
		
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 취미는 " + hobby);
		System.out.println("당신의 소속은 " + cl);
		
	}

}
