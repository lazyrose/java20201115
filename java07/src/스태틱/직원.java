package 스태틱;

public class 직원 {
	String name;
	String gender;
	int age;
	
	static int count;
	static int sum;
	
	public 직원(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;
	}
	
	//평균구하는 기능을 정의(메서드)
	//객체생성하지 않아도 클래스이름으로 바로 접근해서 사용할 수 있는 메서드
	public int getAvg() {
		int result = sum/count;
		return result;
	}

	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}