package 상속;

public class Plus extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu와의 문제가 생김");
			}
			System.out.println("증가 " + i);
		}
	}
}
