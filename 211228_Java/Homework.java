package zSelfTest;
import java.util.*;
import java.lang.Math.*;

public class Homework {
	
		// # 7-3 method
		static int readPlusInt(int n) {
			String num = String.valueOf(n);
			String nums = "";
			for (int i = 0 ; i <= num.length() - 1 ; i++) {				
				nums += num.substring(num.length() - 1 - i, num.length() - i); 
			}
			return Integer.parseInt(nums);
		}
		
		// # 7-15 method
		
		static int sumOf(int[] a) {
			int sum = 0;
			for (int i = 0 ; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
		
		// # 7-16 method
		static int minOf(int[] a) {
			int min = a[0];
			
			for (int i = 0 ; i < a.length ; i++) {
				if (a[i] < min) min = a[i];
			}			
			return min;
		}
		
		// # 7-17 method
		static int linearSearch(int[] a, int key) {
			String ans = "";
			for (int i = 0 ; i < a.length ; i++) {
				if (key == a[i]) ans += String.valueOf(i);				
			}
			if (ans.length() > 1) {
				System.out.println("해당 값의 요소가 여러 개 존재합니다.");				
			}
			return Integer.parseInt(ans.substring(0,1));
		}
		
		static int linearSearchR(int[] a, int key) {
			String ans = "";
			for (int i = a.length - 1 ; i >= 0 ; i--) {
				if (key == a[i]) ans += String.valueOf(i);				
			}
//			if (ans.length() > 1) {
//				System.out.println("해당 값의 요소가 여러 개 존재합니다.");	
//			}
			return Integer.parseInt(ans.substring(0,1));
		}

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// # 7-9 main
		int n = 0;			
		while (true) {
		System.out.print("양의 정숫값 : ");	
			n = sc.nextInt();
			if (n > 0) break;
		}
		System.out.printf("반대로 읽으면 %d입니다.%n",readPlusInt(n));
		
		// # 7-10 main
		
		System.out.println("암산 훈련!!");
		int end = 1;
		while (end > 0) {
		int x = (int)(Math.random()*1000);		
		int y = (int)(Math.random()*1000);
		int z = (int)(Math.random()*1000);
		int con = rand.nextInt(3);
		int answer = 0;
		
		while (true) {
		
		if (con == 0 ) {
			System.out.printf("%d + %d + %d = ",x,y,z);
			answer = x + y + z ;
		}else if (con == 1) {
			System.out.printf("%d + %d - %d = ",x,y,z);
			answer = x + y - z ;
		}else if (con == 2) {
			System.out.printf("%d - %d + %d = ",x,y,z);
			answer = x - y + z ;
		}else {
			System.out.printf("%d - %d - %d = ",x,y,z);
			answer = x - y - z ;
		}		
		int me = sc.nextInt();
		if (me != answer) {
			System.out.println("틀렸습니다!");
			continue;
		}else {
			System.out.print("다시 한 번?<Yes...1/No...0> : ");
			end = sc.nextInt();
			break;
		}
		}
				
		}

		// # 7-15 main
		System.out.print("요소 수 : ");
		int pcs = sc.nextInt();
		int[] x = new int[pcs];
		for (int i = 0 ; i < pcs ; i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = sc.nextInt();
		}
		System.out.printf("모든 요소의 합은 %d입니다.%n", sumOf(x));

		// # 7-16 main
		System.out.print("사람 수는 : ");
		int p = sc.nextInt();
		System.out.printf("%d명의 신장과 체중을 입력하자.%n", p);
		
		int[] height = new int[p];
		int[] weight = new int[p];
		
		for (int i = 1 ; i <= p ; i++) {
			System.out.print(i + "번의 신장 : ");
			height[i-1] = sc.nextInt();
			System.out.print(i + "번의 체중 : ");
			weight[i-1] = sc.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람의 신장 : "+ minOf(height) + "cm");
		System.out.println("가장 마른 사람의 체중 : " + minOf(weight) + "kg");
		// # 7-17 main
		System.out.print("요소 수 : ");
		int arrpcs = sc.nextInt();
		int[] arr = new int[arrpcs];
		for (int i = 0 ; i < arrpcs ; i++) {
			System.out.printf("x[%d] : ", i);
			arr[i] = sc.nextInt();
		}
		System.out.print("찾는 값 : ");
		int key = sc.nextInt();
		
		System.out.println("가장 앞에 위치한 값은 x["+linearSearch(arr,key) + "]에 있습니다.");
		System.out.println("가장 뒤에 위치한 값은 x["+linearSearchR(arr,key) + "]에 있습니다.");
	
		}

}
