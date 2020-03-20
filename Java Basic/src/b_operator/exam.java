package b_operator;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		//100점 만점의 학생 점수를 입력받아 80~90 사이라면 '평균'이라고 출력
			
		// (1) 학생점수 변수 선언
		int score = 0;
			
		// (2) Scanner 선언
		Scanner b = new Scanner(System.in);
					
		// (3) 화면에 "점수 입력->" 문장 출력
	
		System.out.println("학생 점수입력");
				// (4) 입력값을 변수에 저장
		score = b.nextInt();
		// (5) 입력값이 80보다 크고 90보다 작다면
		if(score>80 && score<90) {
			// (6) '평균' 출력  
			System.out.println("평균");
		}
		
		


	}

}
