package 스태틱;

public class 매일일기장 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count + "일째");
		System.out.println(Day.sum + "시간");
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count + "일째");
		System.out.println(Day.sum + "시간");
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count + "일째");
		System.out.println(Day.sum + "시간");
	}

}
