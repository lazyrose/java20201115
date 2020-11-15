package 제어문;

import java.util.Date;

public class 인사하기 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int time = date.getHours();
		System.out.println("현재 시각은 " + time + "시");
		
		if (time < 10) {
			System.out.println("굿모닝");
		} else if (time < 17) {
			System.out.println("굿애프터눈");
		} else if (time < 21) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
	}

}
