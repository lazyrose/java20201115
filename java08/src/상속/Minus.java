package 상속;

public class Minus extends Thread{
	@Override
	public void run() {
		for (int i = 100; i > 0; i--) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("cpu와의 문제가 생김");
			}
			System.out.println("감소 " + i);
		}
	}
}
