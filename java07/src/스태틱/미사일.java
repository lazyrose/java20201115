package ����ƽ;

public class �̻��� {
	//��ü ������ �ڵ����� ����Ǵ� ������(dynamic ����)
	//������ ���� ����(instance ����)
	String name;
	int move;
	static int count;	//����(static) ����
	
	public �̻���(String name, int move) {
		this.name = name;
		this.move = move;
		count++;
	}

	public String toString() {
		return "�̻��� [name=" + name + ", move=" + move + "]";
	}
}
