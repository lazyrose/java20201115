package ����;

public class �Խ��� {
	//���� => ��� ���� -> ��ü����(��������, �۷ι�����)
	//�ڵ��ʱ�ȭ(int->0, ������->null: �ּҰ� ����)
	String title;	//����, ��ġ�� �߿�
	String content;
	String writer = null;


	//Ŭ������ �Ȱ��� �̸��� ���� Ŭ������ �ϳ��� ���� ���� �ڵ����� �������
	public �Խ���() {
		
	}
	public �Խ���(String t, String c, String w) {
		title = t;
		content = c;
		writer = w;
	}
	
	//����(�������)=>�޼���
	public void �۾���() {
		System.out.println("�۾��� ����");
	}

	public void �ۻ���() {
		System.out.println("�ۻ��� ����");
	}

	//���� �־��� ����� ��������. (�������̵�)
	public String toString() {
		return "����: " + title + 
				"  ����: " + content + 
				"  �۾���: " + writer;
	}
}