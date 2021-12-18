
public class LogicalExam {

	public static void main(String[] args) {
		
//		Quiz 2 문자를 하나 입력받아서 그 문자가 숫자인지 문자인지 (영문자) 인지를 출력하시오. 
//		"문자를 하나 입력하세요."
//		"입력하신문자는 숫자입니다."
//		"입력하신 문자는 영문자입니다."
//		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 하나 입력하세요.");
		
		String a = scan.nextLine();
		char ch = ' ';		
        ch = a.charAt(0);
         
         if ('0' <= ch && ch <='9') {
        	 System.out.println("입력하신 문자는 숫자입니다");
        	 
         } else if (ch >='a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
        	 System.out.println("입력하신 문자는 영문자입니다.");
         }
        	 
         
}
		
		
		/* 논리 연산자는 둘 이상의 조건을 and 또는 or연결하여 하나의 식으로 표현한다.
		 * || (or) 피 연산자의 어느 한쪽만 true 여도 최종값은 true로 변환
		 * && (and) 피 연산자 양쪽 모두 동시에 true여야만 true로 변환
		 * x > 10 &&  x < 20 (o)
		   10 < x && x < 20 (o)
		   10 < x < 20 (x)
		 * i % 2 ==0 || i % 3 ==0 //2의 배수도 ok 3의 배수도 ok
		 * 
		 * 
		 * */ 
		
		
		

	}