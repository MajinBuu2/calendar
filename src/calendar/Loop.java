package calendar;

import java.util.Scanner;

public class Loop {
	//반복횟수를 알때는 for, 모를때는 while 
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.printf("반복 횟수를 입력하세요. %n");
		int num = scan.nextInt();
		int[] month = new int[num];
		System.out.println("월을 입력하세요.");
//		for(int i=0; i<num; i++) {
//			month[i] = scan.nextInt();
//		}
		int i=0;
		while(i<num) {
			month[i] = scan.nextInt();
			i++;
		}
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(i=0; i<num; i++) {
			System.out.printf("%d월은 %d일까지 있습니다.%n",month[i], maxDays[month[i]-1]);
		}
		scan.close();
	}

}
