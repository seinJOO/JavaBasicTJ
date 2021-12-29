package Java20211229;
import java.util.*;

public class Homework {
	
	static void aryRmv(int[] a, int idx) {
		int cnt = idx;
		for (int i = idx ; i < a.length ; i++) {
			if (i == a.length - 1) break;
			a[i] = a[cnt + 1];
			cnt++;			
		}
	}
	
	static void aryRmvN(int[]b, int idxb, int n) {
		int cnt = idxb;
		for (int i = idxb ; i <= idxb + n ; i++) {
			if (cnt + n >= b.length) break;
			b[i] = b[cnt + n];
			cnt++;	
		}
	}
	
	static void aryIns(int[] a, int idx, int x) {		
		for (int i = a.length - 1 ; i >= 0 ; i--) {
			if (i == idx) {
				a[i] = x; break;
			}
			a[i] = a[i-1];
		}
	}
	
	static void aryExchng(int[]a, int[]b) {
		int nums = 0;
		if (a.length >= b.length) nums= b.length;
		if (b.length >= a.length) nums = a.length;
		int[] chg = new int[nums];
		for (int i = 0 ; i < nums ; i++) {
			chg[i] = a[i];
			a[i] = b[i];
			b[i] = chg[i];
		}		
	}
	
	static int[] arrayClone(int[] a) {
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// # 7-18 main
		
		System.out.print("요소 수 : ");
		int ind = sc.nextInt();
		int[] a = new int[ind];
		for (int i = 0 ; i < ind ; i++) {
			System.out.printf("a[%d] : ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스 : ");
		int idx = sc.nextInt();
		aryRmv(a,idx);
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.printf("a[%d] = %d%n", i , a[i]);
		}
		
		// # 7-19 main
		
		System.out.print("요소 수 : ");
		int pcs = sc.nextInt();
		int[] b = new int[pcs];
		for (int i = 0 ; i < pcs ; i++) {
			System.out.printf("a[%d] : ", i);
			b[i] = sc.nextInt();
		}
		
		System.out.print("삭제를 시작할 인덱스 : ");
		int idxb = sc.nextInt();
		
		System.out.print("삭제할 요소의 수 : ");
		int n = sc.nextInt();
		
		aryRmvN(b, idxb, n);
		
		for(int i = 0 ; i < b.length ; i++) {
			System.out.printf("a[%d] = %d%n", i , b[i]);
		}
		
		// # 7-20 main
		
		System.out.print("요소 수 : ");
		int twt = sc.nextInt();
		int[] c = new int[twt];
		for (int i = 0 ; i < twt ; i++) {
			System.out.printf("a[%d] : ", i);
			c[i] = sc.nextInt();
		}
		
		System.out.print("삽입할 요소의 인덱스 : ");
		int idxc = sc.nextInt();
		
		System.out.print("삽입할 값: ");
		int x = sc.nextInt();
		
		aryIns(c, idxc, x);
		
		for(int i = 0 ; i < c.length ; i++) {
			System.out.printf("a[%d] = %d%n", i , c[i]);
		}
		
		
		// # 7-21 main
		
		System.out.print("배열 a의 요소 수 : ");
		int apcs = sc.nextInt();
		int[] twoa = new int[apcs];
		for (int i = 0 ; i < apcs ; i++) {
			System.out.printf("a[%d] : ", i);
			twoa[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요소 수 : ");
		int bpcs = sc.nextInt();
		int[] twob = new int[bpcs];
		for (int i = 0 ; i < bpcs ; i++) {
			System.out.printf("b[%d] : ", i);
			twob[i] = sc.nextInt();
		}
		
		aryExchng(twoa, twob);
		
		System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
		
		for(int i = 0 ; i < twoa.length ; i++) {
			System.out.printf("a[%d] = %d%n", i , twoa[i]);
		}
		for(int i = 0 ; i < twob.length ; i++) {
			System.out.printf("b[%d] = %d%n", i , twob[i]);
		}
	
		
		//# 7-22 main
		
		System.out.print("요소 수 : ");
		int cls = sc.nextInt();
		int[] cln = new int[cls];
		for (int i = 0 ; i < cls ; i++) {
			System.out.printf("x[%d] : ", i);
			cln[i] = sc.nextInt();
		}
		int[] cln2 = arrayClone(cln);
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		
		for(int i = 0 ; i < cln.length ; i++) {
			System.out.printf("y[%d] = %d%n", i , cln2[i]);
		}
		
		
		
	}

}
