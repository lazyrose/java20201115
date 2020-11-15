package 순차문;

public class 기본입력1 {

	public static void main(String[] args) {
		char pass1 = 'p';
		char pass2 = 'q';
		
		if (pass1 == pass2) {	//조건이 맞으면, true
			System.out.println("PASS");
			System.out.println("합격입니다");
		}else {	//조건이 안맞으면, false
			System.out.println("재입력");
		}
		
	}

}
