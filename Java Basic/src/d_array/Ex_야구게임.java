package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_야구게임 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		int []baseball = new int[3];
		int []answer = new int[3];
		
		int strike=0, ball=0;
		// 1. 임의의 수 3개를 baseball 저장
		for(int i =0; i<baseball.length;i++) {
			baseball[i]=(int)(Math.random()*10);
		}
		for(int i=0; i<baseball.length; i++) {
			System.out.println(baseball[i]+" ");			
		}
		HERE :
		for(int k=0; k<5;k++) {
		//2. 사용자 입력값을 받아서 answer에 각각의 숫자를 저장
		String str;
		System.out.println("숫자 입력 - >");
		str = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		int  cnt = 0;
		while(st.hasMoreTokens()) {
			answer[cnt++]=Integer.parseInt(st.nextToken());
		}
		ball=0;strike=0;
		//3. 값 비교
		for(int i = 0 ; i < 3; i++) {
			for (int j=0; j<3; j++) {
				if(baseball[i] == answer[j]) {
					if(i==j){
						strike++; 
					}else {
						ball++;
					}
				}//end if.1
			}//end for-j
		}//end for-i
		//4 .strike와 ball 출력 
		System.out.println("스트라이크 :" + strike + "/볼: "+ball);
		if( strike == 3) {
			break HERE;
		}
	}//end for -k
	}

}
