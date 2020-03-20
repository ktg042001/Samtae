package c_control;

public class Ex07_break_continue {

	public static void main(String[] args) {

		HERE :
		for(int i = 0 ;i<3;i++) {
			for(int j=0;j<3;j++) {
				//if(j==1) break; //블럭을 벗어나는 문장 ( 반복 벗어나기)
				//if(j==1) continue; //블럭 끝으로가기 (반복은 수행함)
				if(j==1) continue HERE;
				System.out.printf("<%d,%d,>\n",i,j); 
			}
			System.out.println("데이타");

		}

	}
}