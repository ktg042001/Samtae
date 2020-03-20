package c_control;

public class Ex02_if_학번 {

	public static void main(String[] args) {
	
		String hakbun = "2017111123";
		String year = hakbun.substring(0,4);
		char daehak = hakbun.charAt(4);
		
		
		String colleage = "";
		
		//학과 구하기
		String 학과번호 = hakbun.substring(5,7); //	"11"
		String 학과명 = "";		
		
		
		
		if(daehak =='1') {
			colleage = "공대";
			if(학과번호.equals("11")) {
				학과명 ="컴퓨터학과";
			}
		}else if (daehak =='2') {
			colleage ="사회대";
			if(학과번호.equals("11")) {
				학과명 = "사회학과";
			}
		}
		System.out.println(hakbun + "번 학생은" + year + "년에 입학 " + colleage);
	}

}
