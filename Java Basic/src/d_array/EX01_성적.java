package d_array;

public class EX01_성적 {

	public static void main(String[] args) {
		
//		int [] kor ;
//		kor = new int[5];
//		int [] kor = new int[5];
//		kor [0] = 90;
//		kor [1] = 88;
//		kor [2] = 89;
//		kor [3] = 70;
//		kor [4] = 77;
        //kor [5] = 99;
		
		// 배열 초기화 
		//int []kor = new int[] {90,88,89,70,77};
		int []kor =  {90,88,89,70,77};  // 이런식으로 생략가능
		
		
		int total = 0;
		for(int i =0; i< kor.length; i++) {
			System.out.println(kor[i]);
			total += kor[i];
		}
		
		System.out.println("총점 : "+total );
			
				
	
	
	
	
	}

}
