package calendar;

import java.util.Scanner;

public class CalendarMonth {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요. ");
		int month = scan.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 
				|| month == 8 || month == 10 || month == 12) {
			System.out.printf("%d월은 31일까지 있습니다.", month);
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.printf("%d월은 30일까지 있습니다.", month);
		}else if(month == 2) {
			System.out.printf("%d월은 28일까지 있습니다.", month);
		}else {
			System.out.println("1 ~ 12까지의 숫자만 입력해주세요.");
		}
		
		scan.close();
	}
}
