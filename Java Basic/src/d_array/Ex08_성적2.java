package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_성적2 {

	public static void main(String[] args) {

		// 학생수 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int su = input.nextInt();
		input.nextLine();

		// 점수를 저장할 변수(score)를 학생수만큼 선언
		int[][] score = new int[su][3];

		// 엽력
		int sum[] = new int[score.length];
		for (int i = 0; i < su; i++) {
			System.out.println((i + 1) + "번째 학생의 점수를 입력하세요 - > ");
			String jum = input.nextLine();
			StringTokenizer st = new StringTokenizer(jum, "/");
			int tokensu = st.countTokens();
			for (int j = 0; j < tokensu; j++) {
				String strScore = st.nextToken();
				score[i][j] = Integer.parseInt(strScore);
				int total = score[i][j];
				sum[i] = total;

			}
		}

		// 출력

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				System.out.print(score[i][j] + " ");

			}

			System.out.println();
		}
		int max = 0;// 가장 큰행
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > sum[max]) {
				max = i;

			}

		}
		System.out.println("총점 : " + sum);
	}
}
