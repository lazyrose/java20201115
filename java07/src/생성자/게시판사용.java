package ������;

import ����.�Խ���;

public class �Խ��ǻ�� {

	public static void main(String[] args) {
		�Խ��� b3 = new �Խ���("������", "�б���", "�ڱ浿");
		System.out.println(b3);
		
		�Խ��� b1 = new �Խ���();
		//��������� �� ��ü���� �޸𸮰� ���� �������
		b1.title = "�����";
		b1.content = "����� ����";
		b1.writer = "ȫ�浿";
		//����޼���� ��ü�� ��������� ����, �� ��ü�� ������ ���������� �ִ°� ȣ���ؼ� �� �� ����
		b1.�۾���();
		System.out.println(b1);
		
		�Խ��� b2 = new �Խ���();
		b2.title = "�Ͽ���";
		b2.content = "�ָ� ��";
		b2.writer = "�۱浿";
		b2.�۾���();

		
	}

}
