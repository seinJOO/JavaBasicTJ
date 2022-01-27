package Java20211221;

public class VariableExam {

	public static void main(String[] args) {		
		
		Card c1 = new Card(); //객체 c1 생성
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card(); //객체 c2 생성
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+ c1.kind +","+ c1.number);
		System.out.println("c2는 "+ c2.kind +","+ c2.number);
		
		//↑ 인스턴스 변수 = 객체 변수는 객체가 생성될 때마다 함께 생성되므로 객체마다 각기 다른 값을 유지할 수 있다.
		
		//↓ 클래스 변수는 모든 객체들이 하나의 저장공간을 공유한다. 따라서 항상 같은 공통된 값을 갖는다.
		
		System.out.println("Card.width = " + Card.width); //클래스변수 불러오기
		System.out.println("Card.height = " + Card.height);
		
		c1.width = 50; 			//클래스변수에 c1으로 접근해서 값을 수정했더니 
		c1.height = 150;		//Card 클래스변수가 수정한 값으로 유지됨 -> 클래스 변수는 값을 공유함
		
		System.out.println("Card.width = " + Card.width); //출력값 50
		System.out.println("Card.height = " + Card.height); //출력값 150		
		System.out.println("c1.width = " + c1.width); 
		System.out.println("c1.height = " + c1.height);
		System.out.println("c2.width = " + c2.width); //클래스변수의 값이 변경되면서 Card클래스의 객체 c2도 수정된 값 출력
		System.out.println("c2.height = " + c2.height);
		
		
	}
}

class Card {
	String kind;	//객체변수
	int number;		//객체변수
	static int width = 100;		//클래스변수
	static int height = 250;	//클래스변수
	
}
		
/*
	선언 위치에 따른 변수의 종류 
	- 클래스변수(class variable), 인스턴스(객체)변수(instance variable), 지역변수(local variable)
	- static 붙은 변수는 클래스 변수(객체 없이도 사용 가능)
	- static이 붙지 않으면 객체 변수
	
		ex) 				// 클래스 안에서 선언하면 전역변수
		class x {
		 		 int iv; -> 객체변수(객체 생성 시 생성)
		  static int cv; -> 클래스 변수(공유변수 - 클래스가 메모리에 올라갈 때 생성 -> 모든 클래스가 공유)
			
			 void methodY() {
					int iy = 0; -> 지역변수(매서드 블록 안에서 선언)
			}
		}


*/
	
