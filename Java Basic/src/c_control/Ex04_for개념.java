package c_control;

public class Ex04_for개념 {

	public static void main(String[] args) {
		/*
		 * for 문
		 * 
		 * for( 초기치; 조건식; 증가치){ 반복구문 }
		 * 
		 * 
		 */
		// 0. 인사말 5번 출력하기
		
		//		for ( int i = 0; i<5; i++) {
		//			System.out.println("안녕하세요");
		//		}
        
		//	1. 1~10까지의 합을 구하기
//		int hap = 0;
//		for (int i = 1; i <= 100; i++) {
//
//			hap += i; // hap = hap +i;
//		}
//
//		System.out.println("합 = " + hap);

	// 2. 1 ~ 100까지 홀수의 합과 짝수의 합 구하기
		
//		int even = 0, odd = 0;
//		for (int i = 1;  i<=100; i++) {
//			if( i%2 == 0){
//				even +=i;
//			}else if (i%2==1) {
//				odd +=i;
//			}
//			
//			//숫자 i가 홀수라면 odd 합구하기
//			//그렇지 않으면 even 합구하기
//		}
//		
//		System.out.println("짝수의 합 = "+ even);
//		System.out.println("홀수의 합 = "+ odd);
		
		//3. A~Z 출력 
//		for(char ch='A';ch<='Z';ch++) {
//			System.out.print(ch);
//		}
//		//4. A~Z 출력(2개씩 건너뛰기)
//		
//		for(char ch='A';ch<='Z';ch +=2) {
//			System.out.print(ch);
//		}
//		
//		//5. Z~A출력
		
		for(char ch='Z';ch>='A';ch--) {
			System.out.print(ch);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
