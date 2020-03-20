package d_array;

public class Ex02_최대값찾기 {

	public static void main(String[] args) {
		
		int [] score = new int[]{77,88,69,12,44};
		// max 변수 선언
		int max = 0;
		//반복문(for) - 배열의 갯수만큼
			// score의 i번째의 값과 max 비교
			// max값이 더 작다면 max에 저장
		// 최대값 max 출력
		for(int i = 0 ; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			
			
		}
		System.out.println(max);
	}
}