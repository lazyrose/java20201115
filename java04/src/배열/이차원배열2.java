package 배열;

public class 이차원배열2 {

	public static void main(String[] args) {
		// 2차원 배열은 1차원 배열을 여러개 모아놓은 것
		int[][] seat = new int[3][];	//0,1,2행
		int[] s0 = new int[10];
		int[] s1 = new int[5];
		int[] s2 = new int[8];
		seat[0] = s0;
		seat[1] = s1;
		seat[2] = s2;
		
		for (int i = 0; i < seat.length; i++) {	//5
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
