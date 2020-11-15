package 네트워크;

import java.net.ServerSocket;

public class 네트워크서버 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 시작됨. 고객의 요청을 기다리는 중..");
		int count = 0;	//지역변수, 초기화
		while (true) {
			server.accept();	//승인함
			count++;
			System.out.println(count + ": 고객의 요청을 승인함");
		}
	}

}
