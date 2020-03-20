package c_control;

import java.util.Scanner;

public class Ex00 {
	public static void main(String args[]) {
		System.out.println("1과 100 사이의 숫자 3개를 입력하세요 ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();

		System.out.println(n1 + " " + n2 + " " + n3 + " ");

		int ans = 0;

		if (n1 >= n2) {
			if (n2 >= n3) {
				ans = n2;
			} else if (n3 >= n1) {
				ans = n1;
			}
		}

		else if (n1 >= n3) {
			if (n3 >= n2) {
				ans = n3;
			} else if (n2 >= n1)
				ans = n1;
		}

		else if (n2 >= n3 & n3 >= n1) {
			ans = n3;
		} else {
			ans = n2;
		}

		System.out.println("2번째로 큰 수는 " + ans);
	}
}