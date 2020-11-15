package 상속;

public class Counter extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 6000; i++) {
			try {
				Thread.sleep(500); 	//millis: 밀리세컨즈, 초단위보다 더 작은 단위. 1000 = 1초
			} catch (InterruptedException e) {
				System.out.println("에러발생!!");
			}
			System.out.println("카운터: " + i);
		}
	}
}
