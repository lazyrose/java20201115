package ������;

import ����.���ּ�;

public class ���ּ���� {

	public static void main(String[] args) {
		//s1�� ���α׷��Ӱ� ���� ��ǰ(���): object(��ü)
		//new�� ������ Ŭ������ ��ü�� �����(����)
		//new => ��ü �����ϴ� Ű����
		//����������� ���簡 ��
		//Ŭ�����̸��� �Ȱ��� �޼���: ��ü������ �ڵ� ȣ��
		//=> ������ �޼���(constructor)
		//=> ��ü������ ����ʱ�ȭ
		���ּ� s1 = new ���ּ�(100, 100, "space.jpg");
		System.out.println(s1);

		���ּ� s2 = new ���ּ�(200, 200, "space.jpg");
		System.out.println(s2);
		
		���ּ� s3 = new ���ּ�(300, 300, "space.jpg");
		System.out.println(s3);
	}

}
