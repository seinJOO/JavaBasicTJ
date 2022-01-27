package Java20211222;

public class recursiveExam {

	public static void main(String[] args) {
/* 
    
	재귀 호출 recursive call 
	- 매서드 내부에서 자기 자신 매서드를 다시 호출(마트료시카 인형처럼)
	- 무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 됨
	  따라서 조건문을 통한 탈출이 필수적으로 따라다닌다.
	- 일반적인 형태	
		void method(int n) {
			if(n == 0)	//탈출지점
			return;
		
		System.out.println(n); //무한반복
		method(--n);	//자기자신을 자신이 호출함
		}
		
	- 반복문은 같은 문장을 반복해서 수행하지만, 재귀 호출은 반복문보다 몇 가지 과정을 거침
		예) 매개변수 복사 종류 후 복귀할 주소 저장 등이 필요
	- 내부적으로 추가가 필요한 것이 많기 때문에 반복문보다 재귀호출 수행시간이 더 오래 걸림
	- 반복문 대신 사용하는 이유는 재귀의 논리적 간결함 때문 -> 코드가 간결하고 이쁨
	- 재귀 호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 클 경우에만 사용 권장
	
		facfor(n) 매서드를 만들어서 팩토리얼 계산하기		
		System.out.println(facfor(5));
		System.out.println(facrecur(5));
		
		x^1부터 x^n의 합을 구하는 재귀 매서드를 만드세요	
	*/	System.out.println(recursiveExam.powRecur(2,5));
		
		
	}
	
	static int facfor(int n) {
		int result = 1;
		for (int i = 1 ; i <= n ; i++) {
			result *= i;
		}
		return result;
	}
	
	static int facrecur(int n) {		
		int result = 0;		
		
		if (n==1) result = 1;
		else result = n * facrecur(n-1); // 5 * 4 * 3 * 2 * 1
		
		return result;
	}
	
	static int powRecur(int x, int n) {
		int result = 0;
		
		for (int i = 1 ; i < n ; i++) {
			result += power(x, i);			
		}
		return result;
	}

	static int power(int x , int i) {
		if (i == 1) return x;
		return x * power(x, i-1);
	}
	
	
	
	
}
