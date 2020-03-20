package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_while개념 {

	public static void main(String[] args) {
		
//		int hap = 0;
//		int i = 1;
//		// for( ; i<11 ; ) {
//		while (i <= 10) {
//			hap += i; // hap = hap + i
//			i++;
//		}
//		System.out.println("합 : " + hap);
		
		// 숫자 하나 입력받기
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		int su = input.nextInt();
//		int i = 1;
//		while(i <10 ) {
//			System.out.printf("%d * %d = %d \n",su , i , su*i);
//			i++;
//		}
		// 문장을 입력받아 단어로 나눠서 출력
		// "빨리 코로나 끝났으면 좋겠습니다" 
//		
//////////////////////////////////////////////////////////////////////////		
//		Scanner input = new Scanner(System.in);
//		System.out.println("정수 입력받기(ex. 90/80/70/60)");
//		String line  = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line); 
//		int yo = 0;
//		int yo1 = 0;
//		while(st.hasMoreTokens()) { // 토큰의 갯수만큼 반복
//			String temp = st.nextToken(); 	// 변수 temp에 토큰을 순서대로 저장
//			int su = Integer.parseInt(temp); // String -> int 형변환
//			
//			if(su%2==0) {
//				
//				yo++;
//			}else {
//				yo1++;				
//			}
//			
//			
//			
//		}
//		System.out.println("짝수"+yo+"개"+" 홀수"+yo1+"개"); 
////////////////////////////////////////////////////////////////////////////
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력받기");
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		int yo = 0; // 짝수변수
		int yo1 = 0;// 홀수변수
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			int su = Integer.parseInt(temp);
			
			if(su%2 == 0) {
				yo++;
			}else {
				yo1++;
			}
			
		}
		System.out.println("짝수 "+ yo + "개 ");
		System.out.println("홀수 "+yo1 + "개");
//////////////////////////////////////////////////////////////////////////////////				
		int gm = 0;
		while(gm<51) {
			gm++;
			if(gm==3) {
				System.out.println("짝");
			}
		}
		
		
	}

}
