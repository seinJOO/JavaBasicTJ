package exceptionStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예외처리의 기본문 try {} catch(에러메세지 변수) {}
		//try {}수행에서 해당 에러가 발생하면 catch{}내에 있는 명령 실행

			int i = 10;
			int j = 0;
				try {
					int k = i/j;
					System.out.println(k);
				} catch(ArithmeticException e) { //e는 객체이기 때문에 자료형 설정해줌 = 에러명까지 출력
					System.out.println("0으로 나눌 수 없습니다.\n" + e.toString());
				} finally {
					System.out.println("에러 발생 여부와 상관없이 항상 실행");
				}
				
				//에러가 나면 try->catch->finally  에러가 안나면 try->finally
				//-->finally는 에러발생 유무와 상관없이 항상 실행함
				
				
				try {
					int k = i/j;
					System.out.println(k);
				} catch(Exception e) { //모든 에러를 출력
					System.out.println("예외가 발생했습니다.\n" + e.toString());
				} finally {
					System.out.println("에러 발생 여부와 상관없이 항상 실행");
				}
			System.out.println("main end!!");
			
			
			int [] array = new int[10];

			try {
				array[20] = 5;
			} catch(Exception s) {
				System.out.println("배열이 범위를 지나쳤어요.\n");
			} 
			
			System.out.println("성공");			
	}
}
