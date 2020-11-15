package 배열;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] seat = new int[5][10];	//가로줄(행), 세로줄(열): 개수
		//50개의 int변수가 만들어졌음
		//System.out.println(seat.length);
		//각 행마다 개수를 구해주어야 함
		//System.out.println(seat[0].length);
		
		seat[0][0] = 1;
		seat[0][1] = 1;
		seat[0][2] = 1;
		
		seat[2][6] = 1;
		seat[2][7] = 1;
		seat[2][8] = 1;
		seat[2][9] = 1;
		
		
		for (int i = 0; i < seat.length; i++) {	//5
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

}
