package ���;

import java.sql.Date;

public class ��¥ extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("����");
			}
			Date date = new Date;
			System.out.println(Date);	
		}
	}
}
