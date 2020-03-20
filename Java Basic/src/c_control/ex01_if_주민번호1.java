package c_control;

import java.util.*;

public class ex01_if_주민번호1 {

	public static void main(String[] args) {
		
		String id = "200708-3234567" ;
		char sung = id.charAt(7);
		// sung 변수에 값이 1이면 '남자' 출력
		// 그렇지 않고 sung 변수에 값이 2이면 '여자'출력
		// 1이거나 3이거나 9이면 남자
		// 2이거나 4이거나 0이면 여자
		
		//String result = ((sung == '1')? "남자":"여자");
		//System.out.println("결과"+result);
		if(sung  =='1'||sung == '3'|| sung == '9') {
		 System.out.println("남자");
		} else if( sung =='2' ||sung =='4' ||sung =='0') {
			System.out.println("여자");
		}
		//------------------------------------------
		String nai =id.substring(0,2);  //start번째부터 end번째 앞까지
			//nai = "92"
		// 문자열을 정수로 변환
		int nai2 = Integer.parseInt(nai);
			// nai2 = 92
		
		// 올해 연도 구하기
		Calendar c = Calendar.getInstance(); 
		int year = c.get(Calendar.YEAR);
		
		
		int age = 0;
		// ######
		if(sung == '1' || sung == '2') {     
		age = year - ( 1900 + nai2) + 1;
		} else if(sung == '3' || sung =='4') {
			age = year - ( 2000 + nai2) + 1;
	
		} else if(sung == '9'|| sung =='0' ){
			age = year - ( 1800 + nai2) + 1;
		}
		System.out.println("나이 :" + age);
		
		
		
		
	}
	}