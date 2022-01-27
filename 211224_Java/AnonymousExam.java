package Java20211224;

public class AnonymousExam {

	public static void main(String[] args) {
/*		
	익명 클래스 Anonymous Class (내부클래스 중 하나)
		- 익명 클래스는 이름이 없음 -> 생성자도 가질 수 없음
		- 클래스 선언과 동시에 객체를 생성함 -> 단 한번만 사용됨
		- 단 하나의 객체만 생성할 수 있는 일회용 클래스
		- 오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만을 구현할 수 있음
		
		- 보통 아래 형태와 같음
		     마치 객체를 생성하듯이 씀!(Object는 시스템 상 모든 객체가 속한 기본클래스)		
*/
	}		
	class InnerExam {
		Object iv = new Object() {void method() {}}; //익명 클래스
		static Object cv = new Object() {void method(){}}; //익명 클래스
		
		void myMethod() {
			Object lv = new Object() {void method(){}}; //익명 클래스
		}
	}
}		
		
