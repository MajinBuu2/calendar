package calendar;
import java.util.*;

public class CalendarPrint {
	
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1,s2;
		System.out.print("두 수를 입력해주세요.");
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
//		System.out.println("두 수의 합은 "+ (a+b) +"입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,a+b);
		
		scanner.close();
	}
}
