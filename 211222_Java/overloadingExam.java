package Java20211222;

public class overloadingExam {

	public static void main(String[] args) {
/*		
		Overloading
		자바에서는 한 클래스 내에 이미 사용 중인 이름과 동일한 이름의 매서드가 있더라도,
		*매개변수의 갯수가 다르거나 타입이 다르면* 같은 이름을 사용하여 매서드를 정의할 수 있다.
		
		오버로딩의 사전적인 의미는 '과적하'
		하나의 이름으로 여러 기능을 구현하고자 할 때 사용함 (보통 하나의 매서드 이름에 하나의 기능만을 구현)
		
		1. 매서드명이 동일해야 한다
		2. 매개변수의 개수 또는 타입이 달라야한다
		*. 오버로딩에서 반환타입(return)은 오버로딩 구현에 있어서 아무런 영향을 주지 못한다.
		ex) println()의 경우 괄호 안에 무엇이 있던 에러 없이 '출력 기능'을 지속적으로 수행
		
		매서드 오버로딩을 사용하면 사용자가 단 하나의 매서드 명으로 다양한 처리 결과를 얻을 수 있도록 구성할 수 있다
		 = 매번 다른 이름의 매서드들을 생성할 필요가 없다
		ex) println() ->> printlnline(); printlnint1(); printlnstr3() ...
		
		
			#실습1
			
	
			System.out.println(add(2,3));
			System.out.println(add(2,3,4));
			add("홍길동",990); // void타입의 add매서드에서 출력명령이 있기 때문에 println이 필요하지 않음!! 
			
			<메인 바깥에 만들기>
			static int add(int a, int b) {
				int result = a + b; 
				return result;
			}
			
			static int add(int a, int b, int c) { //매개변수가 다른 add 오버로딩
				int result = a + b + c;
				return result;
			}
			
			static void add(String a, int b) {	//매개변수 타입이 다른 add 오버로딩
				System.out.println(a + "님의 토익 점수는 " + b + "입니다.");
			}
		
		가변인자 오버로딩(Variable Arguments overloading)
		 	= JDK 1.5부터 매개변수의 개수를 동적으로 지정할 수 있음 !!! -> *...args*
		 	
		 	#실습 2 불특정 길이의 배열을 기호와 반복 출력해보기
		 	
		 	String[] strArr = {"10","20","30"};
			String[] strArr2 = {"10","20","30","40","50"};
			
			System.out.println(concat("",strArr));
			System.out.println(concat("",strArr2));
			
			System.out.println(concat("-",strArr));
			System.out.println(concat("/",strArr2));
			
			static String concat(String a, String...args) {
			String result = "";
				for (String str : args) { //for-each구문을 통해 들어오는 개수만큼 하나씩 받음
					result += str + a;
				}
			return result;
			}
			
			#실습 3 불특정 길이의 숫자 배열 요소를 모두 합하거나, 모두 곱하는 매서드
				** 문자열을 비교할 때는 .equals()를 쓰자 !!!
			
			int[] intArr1 = {1,2,3};
			int[] intArr2 = {1,2,3,4,5};
			
			System.out.println(arrCal("+",intArr1));
			System.out.println(arrCal("*",intArr2));
			
			static int arrCal(String a, int...args) {		
			int result = (a.equals("+") ? 0 : 1);
						
				for (int arg : args) {			//이렇게 표현 많이 함! args에서 arg 하나씩을 뺀다
					if (a.equals("+")) {				
						result += arg;
					}else if (a.equals("*")) {				
						result *= arg;
					}
				}
			return result;			
			}
		 	
		
	*/		
			
		
	}
	
	
	
	
		

}
