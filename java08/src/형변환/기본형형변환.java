package ����ȯ;

public class �⺻������ȯ {

	public static void main(String[] args) {
		//��: Ÿ��(type)
		//���� Ÿ��(������Ÿ��)
		//����ȯ(casting,ĳ����)
		byte age = 120;
		int b = age;	//ū<--��(int<--byte, �ڵ�����ȯ)
		byte c = (byte)b;	//��<--ū(byte<--int, ��������ȯ)
		
		int d = 1000;
		byte e = (byte) d;	//��������ȯ�� ���� ������ �����ϰ� �������� ����
	}

}
