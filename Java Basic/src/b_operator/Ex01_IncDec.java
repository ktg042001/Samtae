package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		/*
		// [1]
		System.out.println("a=" +a + ", b=" + b);
		System.out.println("a=" +a+1 + ", b=" + b+1); //문자열에다가 1붙은거
		System.out.println("a=" +(a+1) + ", b=" + (b+1) );
		
		// [2]
		a++; //a = a + 1;
		b--; //b = b - 1;
		System.out.println("a=" + a + ", b=" + b );
		
		// [3] 증가감소연산자는 위치 주요!!!!!!!!!!
		int result = ++a;
		System.out.println("결과 " + result);// 6
		
		int result2 = b--;
		System.out.println("결과" + result2);// 7
		System.out.println("b: " + b);//6
		*/
		// [4]
		System.out.println("a=" + ++a + ",b" + --b);//6,6 
		System.out.println("a=" + a++ + ",b=" + b--);//6,6
		System.out.println("a=" + a + ",b=" + b);//7,5
	
	}

}
