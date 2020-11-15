package 상속;

public class 이미지 extends Thread{
	@Override
	public void run() {
		string[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
		}
	}
}