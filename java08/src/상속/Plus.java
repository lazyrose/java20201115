package ���;

public class Plus extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu���� ������ ����");
			}
			System.out.println("���� " + i);
		}
	}
}
