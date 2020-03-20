package d_array;

import java.util.Calendar;

public class Ex03_요일 {

	public static void main(String[] args) {
		
		Calendar ca1 = Calendar.getInstance();
		int y = ca1.get(Calendar.YEAR);
		int m = ca1.get(Calendar.MONTH);
		int d =	ca1.get(Calendar.DATE);
		System.out.println(y+ "년"+ (m+1) +"월"+d+"일");
		//시,분.초 출력
		
		Calendar ca2 = Calendar.getInstance();
		int h = ca2.get(Calendar.HOUR);
		int mi = ca2.get(Calendar.MINUTE);
		int s = ca2.get(Calendar.SECOND);
		System.out.println(h+ "시"+ mi +"분"+ s +"초");
		
		//요일 : 일요일(1) ~ 토요일 (7)
		String[] yo= {"일","월","화","수","목","금","토"};
		Calendar ca3 = Calendar.getInstance();
		
		
		System.out.println(yo[ca3.get(Calendar.DAY_OF_WEEK)-1] + "요일");
		
		
	}

}
