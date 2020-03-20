package d_array;

public class Ex05_Lotto2 {

	public static void main(String[] args) {
		
		int[][] lotto = new int[5][6];
		
		for(int i = 0 ; i < 5; i ++) {	//줄
				for(int j = 0; j<6; j++) {	//칸
			lotto[i][j] = (int)(Math.random()*45)+1;
			}
		}
		//정렬
		
		
		//출력
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<6; j++) {
				System.out.print(lotto[i][j]+ "/");
			}
			System.out.println();
		}
		
	}

}
