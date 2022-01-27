package Java20211224;	

public class ExceptionExam {

	public static void main(String[] args)  {
/*								
	예외 처리 (Exception Handling)
		- 프로그램이 실행 중 어떤 원인에 의해 오작동하거나 비정상적인 종료가 되는 경우가 있다
		- 이러한 결과를 초래하는 원인을 에러 또는 오류라고 한다 -> 예외 처리가 필요
		- 발생 시점에 따라
			1) 컴파일 에러 : 컴파일 시 발생하는 에러 - 프로그램 진입 불가
						 오타나 잘못된 구문, 잘못된 자료형 등 기본적인 검사를 수행하여 오류 확인
						 
			
			2) 런타임 에러 : 실행 중 발생하는 에러 - 프로그램 진입 후 동작 중에 발생
						  컴파일 시 에러가 발생하지 않았다고 하더라도 프로그램이 동작 중에 에러가 발생할 수 있음
						  프로그램 실행 중 동작을 멈춘 상태로 오랜시간 지속되거나,
						  갑자기 프로그램이 실행을 멈추고  강제 종료되는 경우 등이 있음
			*) 논리적 에러 : 실행은 되지만 의도와 다르게 동작하는 에러 
		
	자바에서는 발생할 수 있는 오류를 Exception과 Error *클래스*로 정의하고 있다 !
		- 에러 error : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
		- 예외 exception : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
		
	try-catch 구문
		- 에러(프로그래머가 수습 불가)는 어쩔수 없지만, 예외는 프로그래머가 그에 대한 처리를 미리 해주어야 함
		- 예외처리 : 프로그램 실행 시 발생할 수 있는 예기치 못한 *예외의 발생에 대비한 코드*를 작성하는 것
				    예외의 발생으로 인한 프로그램의 비정상적인 종료를 막고 정상적인 실행상태를 유지할 수 있음 
		- 기본 형태
			try {
				//예외가 발생할 가능성이 있는 구문들
			} catch (오류명Exception e) {	-> 마치 객체를 생성하듯 에러객체 e를 생성
				//예외가 발생 시 예외 처리 구문
			} finally {
				//예외 발생 유무와는 상관 없이 항상 실행하는 구문 - 생략 가능(하지만 자주 씀)
			}
		1. 발생한 예외와 일치하는 catch블록이 있는지 확인한다.(catch가 여러개 존재 가능)
		2. 일치하는 catch 블록을 찾게되면 그 블록의 문장을 수행하고 빠져나간다.
		*. 예외가 발생하지 않는 경우는 catch를 거치지 않고 빠져나간다.
			예시 1)
			int num = 100;
			int result = 0;
			
			for (int i = 0 ; i < 10 ; i++) {
				try {
					result = num / i;
					System.out.println(result);
				} catch (Exception e) { 
					//오류 발생 시 catch구문 안으로 들어감, Exception = 모든 종류의 에러
					//특정 에러 타입으로 바꿔서 기재 가능
					System.out.println("0으로 나눌 수 없습니다.");
				}			
			}
			예시 2)
				
			System.out.println(1);
			System.out.println(2);
			
			try {
				System.out.println(3);
				System.out.println(4);
			} catch (Exception e) {
				System.out.println(5); // 예외가 없으면 5는 찍히지 않음
			}	
			System.out.println(6);
	
			예시 3)
			System.out.println(1);
			System.out.println(2);
			
			try {
				System.out.println(3);
				System.out.println(0/0); // 예외가 발생하면 바로 catch구문으로 넘어감
				System.out.println(4);   // 실행되지 않음
			} catch (Exception e) {
				System.out.println(5); 
			}	
			System.out.println(6);
			
			예시 4)			
			System.out.println(1);
			System.out.println(2);
			
			try {
				System.out.println(3);
				System.out.println(0/0); // 에러 발생
				System.out.println(4);   
			} catch (ArithmeticException ae) { //특정 에러를 거르기
				if(ae instanceof ArithmeticException) 
					System.out.println("true");		
				System.out.println("ArithmeticException");				
			} catch (Exception e) {
				System.out.println("Exception"); 
			}
			System.out.println(6);
			
			예시 5)
			try {
				//Exception e = new Exception("예외 강제 발생");
				//throw e;	-> 한 줄로 줄이면 아래처럼!
				throw new Exception("예외 강제 발생"); // 예외 객체 강제 생성? 객체니까 가능!
			} catch (Exception e) {
				System.out.println("에러 메세지 : " + e.getMessage());
			}
			System.out.println("프로그램 종료");
			
			예시 6)
			//throw new Exception(); -> 컴파일 오류를 포함한 모든 오류이기 때문에 아예 진입이 안됨
			System.out.println("예외 발생");
			throw new RuntimeException(); // 런타임 에러는 실행 중에 발생하는 에러기 때문에 진입 가능
	
	throw : 예외 강제 발생시키기
		- 매서드 예외 선언 : 예외를 매서드에 선언하여 처리		
		- 예외 처리 방법
			1) method1() 예외처리 - 예외가 발생한 해당 위치에서 바로 예외처리,
								  호출한 main은 method1()에서 에러가 발생했는지조차 알 수 없게 됨 
			2) main() 예외처리 - 예외 발생 매서드를 호출한 지점에서 예외를 받아서 처리
							    예외를 돌려받게 되면 예외를 인지할 수 있게 됨
	
			예시 7) 메인과 연결된 매서드1과 연결된 매서드2에서 오류가 발생했을 경우			
		
			public static void main(String[] args) throws Exception {//메인에서 예외 강제발생 가능
				method1(); // 같은 클래스 내에서 static이면 객체 생성없이 바로 호출 가능
			}
			static void method1() throws Exception {
				method2();
			}
			static void method2() throws Exception {
				throw new Exception();
			}
			
			<에러메세지>
			Exception in thread "main" java.lang.Exception
			at JavaClass/Java20211224.ExceptionExam.method2(ExceptionExam.java:12)
			at JavaClass/Java20211224.ExceptionExam.method1(ExceptionExam.java:9)
			at JavaClass/Java20211224.ExceptionExam.main(ExceptionExam.java:6) 
				-> 예외가 발생했을 때
				1. 3개의 매서드가 실행되었고
				2. 예외가 발생한 곳은 method2이며
				3. main매서드가 method1()을, method1()이 method2()를 호출하였음을 알 수 있음!
	
			예시 8) 메인과 연결된 매서드 내에서 오류가 발생했을 경우(매서드 내에서 예외처리)	
			
			public static void main(String[] args) throws Exception {
				method1();
			}
			static void method1() throws Exception {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("method1에서 예외가 처리되었습니다");
				}
			}	
		
			예시 9) 메인과 연결된 매서드 내에서 오류가 발생했을 경우(메인에서 예외처리)	
			
			public static void main(String[] args)  {
				try {
					method1();
				} catch (Exception e) {
					System.out.println("메인에서 예외가 처리되었습니다");
				}
			}
			static void method1() throws Exception {
				throw new Exception();
			}			
		
	
	finally 블럭 
		- 예외의 발생 여부와는 상관없이 어떤 경우에도 실행되는 코드들을 포함시킴
		- 생략 가능하지만, 자주 쓴다!!!		
		
			try {
				throw new Exception();
				//System.out.println("실행"); //에러가 안나는 케이스
			} catch (Exception e) {
				System.out.println("에러");
			} finally {
				System.out.println("항상 실행");
			}
			
	- 예외 되던지기 (Exception Re-throwing) - 절대 안씀 ㅋㅋㅋ
		 한 매서드에 발생 가능한 예외가 여러개가 있을 경우,
		 몇 개는 매서드 내에서 자체적으로 처리하고 나머지는 매서드를 호출한 부분으로 던져서 처리
		 하나의 예외도 양쪽에서 처리할 수도 있음
		 -> 예외를 처리하고 나서 그 예외를 다시 호출한 곳으로 던져서 양쪽에서 모두 처리
		 
		 	예시)
			 public static void main(String[] args)  {
			 try {
				method1(); // 3. method1에서 예외처리 후 throw한 예외 객체 인식
			}catch (Exception e) {
				System.out.println("Main에서 예외 처리"); //4. 받은 예외 다시 처리
			}		
			}	
	
			static void method1() throws Exception {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("method1에서 예외 처리"); //1. 예외 처리 완료
				throw e; //2. 예외를 다시 생성하여 메인에 던져줌
			}
			=> method(1)과 main매서드 양 쪽의 catch블럭이 모두 실행됨
		
*/
		
	}
}
