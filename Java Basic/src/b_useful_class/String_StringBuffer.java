package b_useful_class;

public class String_StringBuffer {

	public static void main(String[] args) {
		
		// 0 .기본형
		int a = 10;
		a += 5;
		System.out.println(a);
		
		// 1. String : 참조형
		String s = new String ("안녕");
		//String s = "안녕";
		s = s + "하세요";
		System.out.println(s);
		
		// 2.Stringbuffer
		StringBuffer sb = new StringBuffer("행복한");
		//StringBuffer sb2 = "행복한";
		//sb = sb +"목요일";
		sb.append("목요일");
		System.out.println(sb);	
		
	}

}
