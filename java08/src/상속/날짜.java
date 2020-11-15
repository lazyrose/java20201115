package 상속;

import java.sql.Date;

public class 날짜 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("에러");
			}
			Date date = new Date;
			System.out.println(Date);	
		}
	}
}
