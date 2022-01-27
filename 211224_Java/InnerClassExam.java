package Java20211224;

public class InnerClassExam {


	public static void main(String[] args) {
/*		
	Inner Class 내부 클래스 (잘 안씀)
		- 클래스 안에 선언된 클래스, 두 클래스가 아주 긴밀한 관계에 있을 때 사용된다
		- 장점1 : 내부 클래스로 선언하면 두 클래스는 서로 쉽게 접근할 수 있다
		- 장점2 : 외부에서는 불필요한 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다.(캡슐화)	
			class A{}			class A{		//이때 클래스A 외에는 클래스B를 거의 사용하지 않음!
			class B{}				class B{}	}
	
	내부 클래스 구분
	 	- 인스턴스 클래스, static 클래스, 지역 클래스, 익명 클래스(이름 없는 1회용 클래스)
	
	내부 클래스 선언
		- 변수 선언과 비슷함(지역변수, 전역변수)
		- 변수 선언 위치에 따라 인스턴스 변수, 클래스 변수, 지역 변수로 나누듯
		     내부 클래스도 선언 위치에 따라 나뉜다.
		- 각 내부 클래스의 선언 위치에 따라 같은 선언위치의 변수와 동일한 유효범위와 접근성을 갖는다.
		- 예시 1)
			class Outer {
				int iv = 0;
				static int cv = 0;	//내부 클래스
				
				void myMethod() {
					int iv = 0; //class 안에서 선언한 변수 iv와는 전혀 다르다 !!
				}
			}
		- 예시 2)
			class Outer {
				class InstanceInner {
					static class StaticInner{}
					
					void myMethod() {
						class LocalInner{}
					}
				}
			}		
*/
		System.out.println(InstanceInner.CONST); //클래스이기 때문에 클래스 호출형태로 호출
		System.out.println(StaticInner.cv);
		//내부클래스 안에 변수가 static으로 선언되어야 호출 가능(당연. 클래스니까)
	}
	class InstanceInner {	//클래스 안에 선언된 클래스
		int iv = 100;
		//static int cv = 100;
		//이너클래스에는 static을 걸지 못한다 - 속해있는 클래스에서만 사용하기 때문
		final static int CONST = 100;
	}	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;	
		//하지만 static class를 이너클래스로 생성하면 static 사용 가능!
	}
}

