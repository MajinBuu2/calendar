package calendar;

import java.util.Scanner;

public class MaxDays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력해주세요. ");
		int month = scan.nextInt();
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("%d월은 %d일까지 있습니다.",month,maxDays[month -1]);
		scan.close();
	}

}
