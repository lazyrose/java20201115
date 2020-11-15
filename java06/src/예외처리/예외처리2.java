package 예외처리;

public class 예외처리2 {

	public void open() throws Exception{
		System.out.println("시작");
		
		int x = 100;
		int y = x/0;
		
		System.out.println("끝");
	}
}
