package Java20211216control;

import java.util.*;

public class ifExam {
	public static void main(String[] args) {
		/*
	 제어문 Control Statement - IF, Switch
	 코드의 제일 위에서부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하는 기능
	 일부분은 건너뛰기도 하고, 다시 위에서부터 내려올 수 있게 제어한다.
	 
	 if - 가장 기본적인 제어문 (if 중첩문은 사용 지양하기)
		 
		 int score = 80;
		 if (score > 60) { // 80 > 60 -> true
			 System.out.println("합격입니다");
		 	}	
		 	
		 (90 <= x && x <= 100) 점수x가 90점 이상 100점 이하 동시만족
		 (x < 0 || x > 100) 점수 x가 0 미만 또는 100 초과 하나만 만족
		 (x % 3 == 0 && x % 2 != 0) x는 2의 배수가 아닌 3의 배수
		 (depar == "영업부" || depar == "기획부") 영업부와 기획부만 뽑기
		
		
		if (false) 
		System.out.println("welcome"); //블럭이 없을 땐 한 줄만 실행됨
		System.out.println("Hello");
		
		
	if - else 구문 (else : 그 밖의 나머지 모든 것...) - 분기가 2개로 수행되는 구조
		if (조건식) {
			true......
			}else {
			else.....
			}
	if - else if 구문 (처리해야할 경우의 수가 3개 이상이면 사용) - 조건식을 만족하면 더 이상은 다른 조건식을 확인하지 않음
		if (조건식) {
			true......
			}else {
			else.....
			}
			
		 Quiz. 점수를 입력 받아 98 이상이면 A+, 94이상 A, 90이상 A- ...
		 
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade = "";
		
		String sign = (8 <= score%10 ? "+" : 4 <= score % 10 ? "" : "-");
		
		if (90 <= score) {
			grade = "A";
		}else if (80 <= score) {
			grade = "B";
		}else if (70 <= score) {
			grade = "C";
		}else if (60 <= score) {
			grade = "D";
		}else grade = "F";
		
		System.out.println(score < 60 ? grade : grade + sign);
		
	switch구문- if문보다 간결하고 알아보기 쉬움
		(if문의 경우 항목이 많아질수록 복잡해지고 코드 가독성이 많이 떨어짐. 평균 처리시간도 항목이 늘어날수록 길어지게 됨.)
		보통 처리해야하는 경우의 수가 아주 많을 경우에 switch
		switch로 만든 모든 구문은 if로 구현할 수 있지만, if로 만든 모든 구문을 switch로 구현할 수는 없음 (switch ⊂ if )
		
		1. 조건식을 계산
		2. 조건식을 만족하는 case 문으로 이동함
		3. 해당 case문의 구문들을 실행함
		4. break 만나기 전까지는 모든 구문을 전부 실행함
		*. switch 구문의 조건식 결과는 정수 또는 문자열 !
		
		Quiz. 특정 월을 입력받아서 3 4 5 봄 6 7 8 여름 9 10 11 가을 12 1 2 겨울
		"?월의 계절은 ?입니다."
		조건 : switch구문의 총 라인 수는 10줄 내외로 작성	
		
		Scanner scan = new Scanner(System.in);
		int mon = scan.nextInt();
		String month = "";
		
		switch (mon) {
		case 1: case 2: case 12: month = "겨울";
		break;
		case 3: case 4: case 5: month = "봄";
		break;
		case 6: case 7: case 8: month = "여름";
		break;
		case 9: case 10: case 11: month = "가을";		
		break;
		}
		System.out.println(mon+"월의 계절은 "+month+"입니다.");
		
		Quiz. 
		가위(1) 바위(2) 보(3) 중 하나를 입력하세요> 1
		당신은 1이고 컴퓨터는 2입니다
		컴퓨터가 이겼습니다.
		
		가위(1) 바위(2) 보(3) 중 하나를 입력하세요> 1
		당신은 1이고 컴퓨터는 3입니다
		당신이 이겼습니다.
		
		가위(1) 바위(2) 보(3) 중 하나를 입력하세요> 1
		당신은 1이고 컴퓨터는 1입니다
		비겼습니다.
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력하세요>");
		int me = scan.nextInt();
		int com = 1 + rand.nextInt(3) ;
		
		String win = "당신이 이겼습니다.";
		String lose = "컴퓨터가 이겼습니다.";
		String draw = "비겼습니다.";
		String result = "";
		
		System.out.println("당신은 "+ me + "이고 컴퓨터는 "+ com + "입니다.");		
		switch (me - com) {
		case 2: case -1: result = lose; 
		break;
		case 0 : result = draw; 
		break;
		case 1: case -2: result = win; 
		break;
		}
		
		System.out.println(result);
		
		#주민등록번호를 입력하세요 > 000000-0000000
			"당신은 남성입니다."
			"당신은 여성입니다."
		*/	
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요>");
		String num = scan.nextLine();
				
		switch (num.charAt(7)) {
		case '1': case '3': System.out.println("당신은 남성입니다.");
		break;
		case '2': case '4': System.out.println("당신은 여성입니다.");
		break;
		}
			
		
		
	}
}
