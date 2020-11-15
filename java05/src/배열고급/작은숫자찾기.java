package 배열고급;

public class 작은숫자찾기 {

	public static void main(String[] args) {
		int[] n = {33, 66, 11, 44, 88};
		int min = n[0]; //11
		for (int i = 1; i < n.length; i++) {
			if(min > n[i]) { //88
				min = n[i];
			}
		}
		System.out.println(min);
	}

}
