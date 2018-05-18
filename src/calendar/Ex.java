package calendar;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		String inputNum = scan.nextLine();
		String[] splitedNum = inputNum.split(" ");
		
		int first = Integer.parseInt(splitedNum[0]);
		int second = Integer.parseInt(splitedNum[1]);
		int sum = first + second;
		System.out.println("두 수의 합은 "+sum+"입니다.");
	}
}
