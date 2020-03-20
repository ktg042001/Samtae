package c_control;

public class Ex04_for중첩 {

	public static void main(String[] args) {
		
		
		//*****
		for(int j =0; j<5;j++) {	//  줄
			for(int i  = 0; i<j ; i++) {
				System.out.print(" ");
			}
			for(int i=0;i<5-j;i++) {	//  개
			System.out.print("*");
			}
			System.out.println();
		
		
	 //-----------------------------------
		//A~Z 한줄에 출력
		//26출력
//		for(int i=0; i<26; i++) {
//			for(char b = 'A'; b <='A'+i; b++) {
//			System.out.print(b);	
//				}
//			System.out.println();
//		}
//	
	
	
	}
}
}