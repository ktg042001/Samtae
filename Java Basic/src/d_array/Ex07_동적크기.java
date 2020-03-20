package d_array;

public class Ex07_동적크기 {

	public static void main(String[] args) {

		char[][] star = new char[5][];

		// 2. 값입력 별표

		for (int i = 0; i < star.length; i++) {				//줄 (행)
			
			star[i] = new char[i+1];
			for (int j = 0; j < i+1; j++) {		//칸 (열)
				star[i][j] = '*';
			}
		}
		// 출력
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j] + " ");

			}
			System.out.println();

		}

	}

}
