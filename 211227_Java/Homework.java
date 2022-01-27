package Java20211227;
import java.util.*;

public class Homework {
	
	// # 7-3 method
	static int med(int a, int b, int c) {
		int mid = 0;
		if (b < a && a < c || c < a && a < b) mid = a;
		if (c < b && b < a || a < b && b < c) mid = b;
		if (b < c && c < a || a < c && c < b) mid = c;
		
		return mid;
	}
	
	// # 7-4 method
	static int sumUp(int n) {
		int sum = 0;
		for (int i = 1 ; i <= n ; i++) {
			sum += i;
		}
		return sum;
	}
	
	// # 7-6 method
	static void printSeason(int m) {
		String mon = "";
		if (m > 0 && m < 13) {
			
		switch (m) {
		case 3: case 4: case 5: mon="봄";
		case 6: case 7: case 8: mon="여름";
		case 9: case 10: case 11: mon="가을";
		case 12: case 1: case 2: mon="겨울";
		}
		System.out.printf("해당 월의 계절은 %s입니다.%n",mon);
		}else ;
	}
	
	//# 7-7 method
	static void putChar(int n) {
		for (int i = 1 ; i <= n ; i++) {
			System.out.print("*");
		}
	}
	static void putStart(int stg) {
		for (int n = 1 ; n <= stg ; n++) {
			putChar(n);
			System.out.println();
		}
	}
	// # 7-8 method 
	static int random(int a, int b) {
		Random rand = new Random();
		int num = 0;
		if (b <= a) {
			num = a;
		} else num = a + rand.nextInt(b - a);
		
		return num;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// # 7-3 main
		System.out.print("정수 a :");
		int a = sc.nextInt();
		System.out.print("정수 b :");
		int b = sc.nextInt();
		System.out.print("정수 c :");
		int c = sc.nextInt();
		
		System.out.println("중간값은 "+ med(a,b,c) + "입니다.");
		
		// # 7-4 main
		System.out.println("1부터 x까지의 합을 구하자");
		System.out.print("x의 값 : ");
		int n = sc.nextInt();
		System.out.printf("1부터 %d까지의 합은 %d입니다.%n",n,sumUp(n));
		
		// # 7-6 main
		System.out.print("몇 월입니까(1~12) : ");
		int m = sc.nextInt();
		printSeason(m);
		
		//# 7-7 main
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 : ");
		int stg = sc.nextInt();
		putStart(stg);
		
		//# 7-8 main
		System.out.println("난수를 생성합니다.");
		System.out.print("하한값 : ");
		int min = sc.nextInt();
		System.out.print("상한값 : ");
		int max = sc.nextInt();
		
		System.out.printf("생성한 난수는 %d입니다.", random(min,max));
		
		

	}

}
