package d_array;

public class Ex05_Lotto {

	public static void main(String[] args) {
		
		int[]lotto = new int[6];
		for(int j=0;j<6;j++) {
			lotto[j] =(int)(Math.random()*45) +1;
		}
		//정렬
		for(int i = lotto.length-1; i>0;i--) {
			for(int j = 0; j < i ;j++) {
				if(lotto[j] > lotto[j+1]) {
					//swapping
					int temp= lotto[j]  ;
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
					

		
		
		for(int j=0;j<6;j++) {
			System.out.print(lotto[j] + "/");
		}
	}

}
		}
	}}
