package ���;

public class Counter extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 6000; i++) {
			try {
				Thread.sleep(500); 	//millis: �и�������, �ʴ������� �� ���� ����. 1000 = 1��
			} catch (InterruptedException e) {
				System.out.println("�����߻�!!");
			}
			System.out.println("ī����: " + i);
		}
	}
}
