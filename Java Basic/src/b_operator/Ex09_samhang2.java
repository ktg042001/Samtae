package b_operator;

import java.util.Scanner;

public class Ex09_samhang2 {

	public static void main(String[] args) {
		// 학생 점수를 입력받아 80 이상이면  "합격"출력하고 그렇지 않으면 "불합격" 출력
		// - > 삼항연산자 이용
		
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("점수입력");
		int a = input.nextInt();
		
		String result = (a >= 80 )? "합격":"불합격";
		
		System.out.println("결과"+ result);
	}

}
