package d_array;

public class Ex07_연습문제 {

	public static void main(String[] args) {
		int[][] star = new int[][]{{3,-5, 12 },{-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};

		// 2. 값입력 별표

		for (int i = 0; i < star.length; i++) {				//줄 (행)
			
			star[i] = new int[i+1];
			for (int j = 0; j < i+1; j++) {		//칸 (열)
				star[i][j] =  ;

			}

		}
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j] + " ");

			}
			System.out.println();

		}
	}
}