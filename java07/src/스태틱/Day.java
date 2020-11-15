package 스태틱;

public class Day {
	//
	String doing;
	int time;
	String location;
	
	//static 변수
	static int count;	//전역변수, 자동으로 0으로 초기화

	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = 
	}

	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}

