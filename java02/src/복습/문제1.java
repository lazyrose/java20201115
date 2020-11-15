package 복습;

public class 문제1 {

	public static void main(String[] args) {
		// 실습 - 모든 점수를 합해 평균 구하기
		int 체육 = 66, 수학 = 77, 영어 = 88, 국어 = 99;
		int sum = 체육 + 수학 + 영어 + 국어;
		double avg = (double)sum / 4;
		
		System.out.println("1학기 성적의 합계는 " + sum + "입니다.");
		System.out.println("1학기 성적의 평균은 " + avg + "입니다.");
		
		
		final double pi = 3.14;
			//항상 똑같은 값 : 상수 (final), 변경 불가능
		double r = 2.2;
		double 넓이 = pi * r * r;

		System.out.println("원의 면적은 " + 넓이 + "입니다.");
	}

}
