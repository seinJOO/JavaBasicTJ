package Java20211216control;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {		
	
		/*
	반복문 : for, while, do~while	
		  
	For 반복문 : 어떤 작업을 반복적으로 수행되도록 할 때 사용
		반복 횟수를 정확히 특정할 때 주로 사용된다.
		문법이 직관적이라 가독성이 좋음.
		- 기본형태 for (start; stop; step)
					   초기값; 조건식; 증감식
		초기값 -> 조건식 -> 수행 문장들....-> 증감식 
			 -> 조건식 -> 수행 문장들....-> 증감식 
			 -> 조건식 -> 종료(조건 만족X)
			 
	초기값 : 반복문에 사용할 변수를 초기화 - 처음에 딱 한 번만 실행됨.
		     보통은 변수를 하나만 사용하지만 2개 이상도 사용 가능함
		   
		   for(int i=1, j=0; i<10, i++){}
	
	조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가, 거짓이 되는 경우 반복을 종료한다.
		     조건식을 잘못 설정할 경우 한 번도 실행되지 않거나, 영원히 반복되는 경우(무한루프)가 발생할 수 있다.
		     
	증감식 : i++, i--, i+= 2, i = i + 2
	
	*. 초기값, 조건식, 증감식 전부 혹은 하나 이상 생략 가능 -> for(;;) {} = 무한루프
	
	Quiz. 1부터 5까지를 아래와 같이 출력하기
	1
	2
	3
	4
	5
	12345

		
		for (int i = 1 ;  i < 6 ; i++) {
			System.out.println(i);
		}
		for (int i = 1 ; i < 6 ; i++) {
			System.out.print(i);
		}
	
	Quiz. 1부터 10까지의 합을 출력하시오. 단 누계 값까지 출력하시오
		1부터 1까지의 합 : 1 ...
		
		
		int total = 0;
		for (int i = 1 ; i <= 10 ; i++) {			
			System.out.printf("1부터 %d까지의 합 : %d%n", i , total += i);			
		}
	Quiz. 1부터 10까지 ->  증가출력 **여백**감소출력		
		for (int i = 1 , j = 10 ; i <= 10 ; i++, j--) {
			System.out.printf("%d \t %d\n", i , j);			
		}
	Quiz. 구구단을 출력하세요
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d * %d = %d \t", i , j , i*j);
			}System.out.println();
		}
	Quiz. *을 출력할 라인의 수를 입력하세요 > 5 (삼각형으로 출력)		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("*을 출력할 라인의 수를 입력하세요>");
		int num = scan.nextInt();
		
		for (int i = 0 ; i < num ; i++) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}System.out.println();	
		}
	Quiz. 역삼각형 출력 ?????????????????
		Scanner scan = new Scanner(System.in);
		System.out.print("*을 출력할 라인의 수를 입력하세요>");
		int num = scan.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			for (int j = num ; j >= i ; j--) {
				System.out.print("*");
			}System.out.println();	
		}
	
	
	향상된 for 구문 = for each
	for (타입 변수명 : 배열 또는컬렉션) {} -> for문보다 자주 씀, 고객 정보나 주문 정보, 게시판 글 등에 사용.
		
		-기본 예시-
		int[] arr = {1,2,3,4,5};
		//기본 for구문 - arr 배열의 i번째 출력 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//향상된 for 구문 - arr배열을 모두 출력
		for (int i : arr) {
			System.out.println(i);
		}
		
		//배열의 합계까지 출력
		int sum = 0;
		int count = 0;
		for (int i : arr) {
			System.out.println(i);
			sum += i;
			count++;
		}System.out.printf("총합은 %d입니다.\n갯수는 %d입니다.",sum, count);
		
		*/

	}

}
