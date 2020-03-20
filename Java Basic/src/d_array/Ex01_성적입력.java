package d_array;

import java.util.*;


/*
 *	학생점수를 입력받아 평균과 총점을 출력
 * 
 *	입력형식 : 80/88/77
 * 	출력형식 : 
 * 			총점 : xxxxxx
 * 			평균 : xxxxxx
 * 			
 */
public class Ex01_성적입력 {

	public static void main(String[] args) {
		
		int [] kor = new int[3];
		// 1. 입력받아 score 변수에저장
		System.out.println("점수 입력");
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		StringTokenizer st = new StringTokenizer(temp,"/");
		for(int i = 0; st.hasMoreTokens(); i ++) {
			String token = st.nextToken();
			kor[i] = Integer.parseInt(token);
		}
		
		// 2. 총점구하기;
		 int sum = 0;
		 double yo = 0;
		 for(int i = 0 ; i < 3 ; i++) {
			 sum += kor[i];
		 }
		 yo = (double)sum/3; 
		 System.out.println("총점 : "+sum);
		 System.out.println("평균 : "+yo);
			 
		 
		// 3. 총점과 평균출려
		



	}

}
