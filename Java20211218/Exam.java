package Java20211218;

import java.util.*;

public class Exam {

	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
	/*	
		//1
		System.out.print("연도를 입력하세요>");
		int year = scan.nextInt();
		
		if (year % 100 != 0 | year % 400 == 0 && year % 4 == 0 ) {
			System.out.println(year + "년은 윤년입니다.");
		} else System.out.println(year + "년은 윤년이 아닙니다.");
		
		//2
		System.out.print("x좌표를 입력하세요>");
		int x = scan.nextInt();
		System.out.print("y좌표를 입력하세요>");
		int y = scan.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Quadrant 1");
		}else if (x < 0  && y > 0) {
			System.out.println("Quadrant 2");
		}else if (x < 0  && y < 0) {
			System.out.println("Quadrant 3");
		}else if (x > 0  && y < 0) {
			System.out.println("Quadrant 4");
		}
		
		//3
		System.out.print("시간 : ");
		int h = scan.nextInt();
		System.out.print("분 : ");
		int m = scan.nextInt();
		
		if (m >= 45) {
			m = m - 45;
		}else if (m < 45 && h == 0) {
			h = 23;
			m = m + 15;
		}else {
			h--;
			m = m + 15;
		}
		System.out.printf("%d %d", h,m);
		
		//while문
		
		System.out.print("정수를 입력하세요>");
		int first = scan.nextInt();
		int count = 0;
		int last = first;
		boolean b = true;
		
		while (b) {
			int a = (first / 10) + (first % 10);
			first = (first % 10) * 10 + (a % 10);
			b = (first != last);
			count++;				
			}			
		System.out.println(count);

		//우리끼리 연습문제~!

		//# 3-2
		
		System.out.print("사과의 개수를 입력해주세요>");
		int apple = scan.nextInt();
		int bucket = 0;
		
		if (apple % 10 != 0) {
			bucket = apple / 10 + 1;
		}else bucket = apple / 10;
		
		System.out.printf("바구니 %d개가 필요합니다\n",bucket);
		
		// # 3-4
		System.out.print("백자리 이하를 버립니다. 정수를 입력해주세요>");
		int num = scan.nextInt();
		int result = num / 100 * 100;
		System.out.println(result);
		
		// # 4-2
		
		int total = 0;
		for (int i = 1 ; i <= 20 ; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				total += i;
			}
		}
		System.out.println("1부터 20까지 정수 중 2 또는 3의 배수가 아닌 수의 총합 : " + total);
		
		// # 4-5
		int i = 0;
		int j = 0;
		while (i <= 10) {
			while (j <= i) {
				System.out.print("*");
				j++;				
			}
			j=0; i++; System.out.println();
		}
		
		// # 4-7
		
		int value = 1 + rand.nextInt(6);
		System.out.println(value);
		
		// # 4-9 ******
		
		String str = scan.nextLine();
		int sum = 0;
		for (int s = 0; s < str.length(); s++) {			
			char val = str.charAt(s);
			sum += (val - '0');	 //char이 아스키코드로 되니까 char값을 1로 바꿔주기		
		}
		System.out.println(sum);
	*/	
		// # 4-12
		
		
		int end = 1;
		
			
		while (end < 10) {
			end += 3;
			for (int back = 1 ; back <= 3 ; back++) {				
				for (int front = end - 2 ; front <= end ; front++) {
					if (front > 9) break;
					System.out.printf("%d * %d = %d\t", front, back, front*back);					
				}
				System.out.println();
			}
			System.out.println("\n");
		}
			
		
			
	/*
		// # 4 - 14
		System.out.print("1과 100 사이의 값을 입력하세요 : ");
		
		int com = 1 + rand.nextInt(100);
		int cnt = 0;
		while (true) {
			int game = scan.nextInt();
			cnt++;
		if (game < com) {
			System.out.print("더 큰 수를 입력하세요>");
		}else if (game > com) {
			System.out.print("더 작은 수를 입력하세요>");
		}else System.out.printf("맞췄습니다\n시도 횟수는 %d번입니다.", cnt);break;			
		}
			
		
		// # 5 - 3
		
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("sum = "+ sum);
*/
		
		
	}
}
