package ����ȯ;

import java.util.ArrayList;

public class ����Ʈ���� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");	//Object<--String(��), �ڵ�����ȯ
		list.add(100);
		list.add(11.11);
		list.add(new ���());
		String name = (String)list.get(0);
		//String(��) <-- Object(ū), ��������ȯ
		//�ڵ�����ȯ�� �ϴ� ���, �θ�Ŭ������ �޼��尡 �� �����Ƿ� �ڽ�Ŭ�������� �߰��� �޼��带 ����� �� ����
		//�ڽ�Ŭ������ �߰��� �޼��带 ����ϰ��� �ϴ� ��쿡�� ��������ȯ�ؼ� �ڽ�Ŭ������ ������� �� ��밡��
		
	}

}
