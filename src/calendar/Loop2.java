package calendar;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scan = new Scanner(System.in);
		System.out.print("반복 횟수를 입력하세요. ");
		int repeat = scan.nextInt();
		for(int i=0; i<repeat; i++) {
			System.out.printf("월을 입력하세요. %n> ");
			int num = scan.nextInt();
			if(num == -1) {
				System.out.println("Hava a nice day!");
			}else {
			System.out.printf("%d월은 %d일까지 있습니다. %n",num, month[num-1]);
			}
		}
		scan.close();
		

	}

}
