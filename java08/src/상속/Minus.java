package ���;

public class Minus extends Thread{
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu���� ������ ����");
			}
			System.out.println("���� " + i);
		}
	}
}
