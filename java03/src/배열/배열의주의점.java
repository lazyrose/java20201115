package 배열;

public class 배열의주의점 {

	public static void main(String[] args) {
		// 배열을 쓸 때는 공간을 만드는 순간에 값을 이미 알고 있는지 모르고 있는지 체크해야 함
		// 1. 값을 모르는 경우 : 공간을 일단 만들고, 나중에 값을 넣음
		// 2. 값을 아는 경우 : 공간을 만들면서, 바로 값을 넣음
		int[] jumsu = {100, 80, 90, 60, 55};
		jumsu[0] = 90;
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}

		//가족의 키(double), 나이(int), 이름(String), 성별(char), 저녁을 먹었는지(boolean) 프린트
		double[] height = {150.5, 170.5, 180.5, 130.5, 167.5};
		for (int i = 0; i < height.length; i++) {
			System.out.println(name[i]);
		}
		int[] age = {10, 20, 30, 40, 50};
		for (int = 0;  < age.length; ++) {
			System.out.println(age[i]);
		}
		String[] name = {"홍길동", "김길동", "홍길순", "홍길준", "홍길영"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		char[] gender = {'남', '여', '남', '여', '남'};
		for (int = 0;  < gender.length; ++) {
			System.out.println(gender[i]);
		}
		//boolean[] food = {true, false};
		
	}

}
