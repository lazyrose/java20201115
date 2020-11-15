package 배열;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 실습 {

	public static void main(String[] args) {
		//1
		//int num[] = {10,20,30,40,50};
		//System.out.println(num[0] + num[1]);
		/*
		int[] n1 = new int[5];
		for (int i = 0; i < n1.length; i++) {
			n1[i] = (i + 1) * 10;
		}
		System.out.println(n1[0] + n1[1]);
		*/
		
		//2
		String[] program = new String[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < program.length; i++) {
			program[i] = JOptionPane.showInputDialog("과목 입력: ");
		}
		System.out.println("**" + program[0] + "보다는 " + program[1] + "**");
		
		//3
		int n2[] = {11, 22, 33, 44};
		for (int i = 0; i < n2.length; i++) {
			if (n2[i] == 3) {
				System.out.println(i);
			}
		}
		
		//4
		int[] n4 = new int[5];
		//i => index
		for (int i = 0; i < n4.length; i++) {
			n4[i] = i + 1;
		}
		//i => 
	}

}
