package a_datatype;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		//나이와 키를 입력받아서 출력
		int age;
		double height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이 ->");
		age = input.nextInt();
		
		System.out.print("키 - >");
		height = input.nextDouble();
		
		//이름 
		System.out.println("이름 ->");
		input.nextLine(); // 이는 nextInt() 에서 Enter 를 칠 때 발생하는 '개행문자'를 처리하지 않고 버퍼에 남기기 때문이다
		String name = input.nextLine(); // next 뒤에  Line 넣어주면  스페이스 활용한 문자열가능
	 
		System.out.print(name + "님" + " 나이 "+ age + " 키 " + height );
		
		
	}

}
