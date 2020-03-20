package c_control;

public class Ex05_while연습 {

	public static void main(String[] args) {

		//3 6 9 게임

		//		for(int i = 1 ; i<50 ; i++) {
		//			int su = i;
		//			boolean su369 = false;
		//			
		//			while( su != 0 ) {
		//				int na = su % 10;
		//				if(na==3 || na==6 || na==9){
		//					System.out.print("짝");
		//					su369 = true;
		//				}	
		//				su /=10; //su = su / 10
		//			}
		//			
		//			if(su369) System.out.println();
		//			else System.out.print(i);
		//		}
//		int yo = 0;
//		for(int i = 1 ; i <10001 ; i ++ ) {
//			int su = i;
//
//			while(su !=0) {
//				int na = su % 10;
//				if(na==8) {
//					yo++;
//
//				}su /=10;
//			}
//
//
//
//		}System.out.println(yo);
//		int yo = 0;
//		for(int i =1 ; i < 10001 ; i++ ) {
//			int su = i;
//			
//			while(su!=0) {
//				int na = su%10;
//				if(na==8) {
//					yo++;
//				}su/=10;
//			}
//		}System.out.println(yo);
//	 	int count = 0;
//		 for(int i = 1; i < 10001; i++)
//		 {
//		    for(int j = i; j > 0; j /= 10)
//		    {
//		        if(j % 10 == 8)
//		        {
//		            count++;
//		        }
//		    }
//		}System.out.println(count);
		
		  int n = 1;
		  int sum = 0;
		  while( true ){
		     sum += n;
		     if ( n++   ==   10 ) break;
		  }
		  System.out.println("SUM = " + sum );
	}
}

