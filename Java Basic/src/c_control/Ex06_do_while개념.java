package c_control;

import java.util.Scanner;

public class Ex06_do_while개념 {

	public static void main(String[] args) {
//		while(true){
//			Scanner input = new Scanner(System.in);
//			System.out.println("숫자를 입력하시오");
//			int su = input.nextInt();
//		
//			for(int i = 1; i <10; i++ ) {
//				System.out.printf("%d * %d = %d \n",su , i , su*i);
//							
//			}
//			System.out.println("구구단 다시 할까요 ?");
//			String result = input.next();
//			if( result.equals("N") | result.equals("n") ) break;
//		}	
		String result = "";
		do{
			
			Scanner input = new Scanner(System.in);
			System.out.println("숫자를 입력하시오");
			int su = input.nextInt();
		
			for(int i = 1; i <10; i++ ) {
				System.out.printf("%d * %d = %d \n",su , i , su*i);
							
			}
			System.out.println("구구단 다시 할까요 ?");
			result = input.next();
			//if( result.equals("N") | result.equals("n") ) break;
		
		}while( result.equals("Y") | result.equals("y") );	
	}	
}