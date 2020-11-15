package 제어문;

import java.util.Date;

public class 날짜관련 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900;	//년
		int month = date.getMonth();//월
		int today = date.getDate();	//일
		System.out.println(year + "년 " + month + "월 " + today + "일");
		
		int day = date.getDay();
		System.out.println(day);
		if (day == 0) {
			System.out.println("일요일");
		} else if(day ==6) {
			System.out.println("토요일");
			//조건이 맞으면, 아래는 더이상 실행시키지 않고, 여기에서 if가 break가 걸려서 끝남
		} else if (day == 5) {
			System.out.println("금요일");
		}
	}

}
