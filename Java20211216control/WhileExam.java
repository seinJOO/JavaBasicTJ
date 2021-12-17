package Java20211216control;

import java.util.*;
public class WhileExam {

	public static void main(String[] args) {
/*
		While 반복문은 for에 비해서 구조가 간단하다.
		조건식이 참일 동안 반복 수행한다.
		조건식 생략 불가, 보통 조건식에 true를 넣어 무한 반복 수행
		무한루프 -> for(::)	while(true) - 반드시 종료 조건을 만들어야 함
		
		
		while (조건식) {) -> 조건식이 참일 동안 수행한다
		
		for (초기화;조건식;증감식) 	=	for (int i = 0; i < 5 ; i++)
		
		->  초기화				=	int i = 0;
			while (조건식) {		=	while (i < 5) {
				증감식			=		i++;
			}					=	}
			
	Quiz. while문을 사용하여 카운트다운 - 마지막에 Awesome!!!출력, 중간중간 버퍼링 주기(조금 무식한 방법 - 중간에 while 넣어서 시간이 걸리는 연산 돌리게 하기)
			
		int i = 10;
		System.out.println("카운트 다운 시작");
		while (i >= 1) {
			System.out.println(i);
			i--;
			long j = 999_999_999L; //_ : 숫자 자리표시(숫자가 너무 클때 보기좋게)
			while (j >= 0) {
				j--;
			}
		}
		System.out.println("Awesome!!!");
		
	Quiz. 숫자를 입력하면 각 자리수의 숫자들의 합을 계산하시오
			
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>>");
		int num = scan.nextInt();		
		int sum = 0;
		
		while (num != 0) {			
			sum += num % 10; //나머지 넣기
			num /= 10 ; //몫만 넣기
		}
		System.out.println(sum);
		
	Quiz. 1부터 10까지 입력값과 누적값을 출력하기
	
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요 >");
		int i = scan.nextInt();
		int sum = 0;
		int j = 1;
		
		while (i > 0) {
			sum += j;
			System.out.printf("%d - %d%n", j , sum);
			j++;
			i--;
		}
	
	}


}
