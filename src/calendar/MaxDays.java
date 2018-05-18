package calendar;

import java.util.Scanner;

public class MaxDays {
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MaxDays cal = new MaxDays();
		System.out.print("달을 입력해주세요. ");
		int month = scan.nextInt();
		
		System.out.printf("%d월은 %d일까지 있습니다.",month, cal.maxDaysOfMonth(month));
		scan.close();
	}

}
