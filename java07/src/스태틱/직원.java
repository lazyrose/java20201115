package ����ƽ;

public class ���� {
	String name;
	String gender;
	int age;
	
	static int count;
	static int sum;
	
	public ����(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;
	}
	
	//��ձ��ϴ� ����� ����(�޼���)
	//��ü�������� �ʾƵ� Ŭ�����̸����� �ٷ� �����ؼ� ����� �� �ִ� �޼���
	public int getAvg() {
		int result = sum/count;
		return result;
	}

	public String toString() {
		return "���� [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}