package ���;

public class ���۸� extends ����{
	//�������: name, age, speed
	//����޼���: eat(), run()
	
	public void space() {
		eat();	//�ش� Ŭ�������� �ִ� �޼���� ȣ���ؼ� �ٷ� ��� ����
		System.out.println(name + "�� �ϴ��� ����");
	}
	
	@Override	//������, �������̵�
	public void run() {
		System.out.println("�ϴ��� ���鼭 ���� ���� �پ������");
	}

	@Override
	public String toString() {
		return "���۸� [speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
}
