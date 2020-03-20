package b_operator;

import java.util.Scanner;

public class ha {
public static void main(String[] args) {
  /* 
   Scanner input = new Scanner(System.in);
   System.out.println("연도입력");
   int a = input.nextInt();
   
   if(a%400==0) {
	   System.out.println("윤년");
   } else if(a%100==0) {
	   System.out.println("윤년이아냐");
   } else if(a%4==0) {
	   System.out.println("윤년");
   } else {
	   System.out.println("윤년이아냐");
   }
   
   */
		
		System.out.println("연도입력");
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();
		if(( f%4 == 0 && f%100 !=0 )|| f%400 == 0  )
			System.out.println("윤년");
		else {
			System.out.println("평년");
		}
}		
}