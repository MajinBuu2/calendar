package calendar;
import java.util.Scanner;

public class AgainFindMax {

	public int maxdays(int month) {
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return maxDays[month-1];
	}
	
	public static void main(String[] args) {
		int month;
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 월을 입력해주세요.");
		month = scan.nextInt();
		AgainFindMax cal = new AgainFindMax();
		System.out.printf("%d월은 %d일까지 있습니다.", month, cal.maxdays(month));
		scan.close();
	}
}
