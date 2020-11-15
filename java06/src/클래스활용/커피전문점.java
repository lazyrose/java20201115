package 클래스활용;

public class 커피전문점 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.color = "빨강";
		cal.add();
		
		계산기 cal2 = new 계산기();
		cal2.color = "파랑";
		cal2.mul();
	}

}
