package Java20211227;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}	
	public String toString() { //toString 매서드의 기본 설정을 쓰지 않고, 내가 설정한 기능을 적용해 사용하겠다 = 오버라이딩(매서드가 포함된 클래스의 객체에서만 적용됨)
		return "Kind : " + kind + ", Number : " + number;
	}
}

public class ToastingExam {
	public static void main(String[] args) {
		
	//String() 객체에 대한 정보(객체 변수에 저장된 값들)를 문자열로 반환하는 매서드

		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString()); //Java20211227.Card@e580929
		System.out.println(c2.toString()); //Java20211227.Card@1d251891
		
		//Card 객체 2개 생성 후 각 객체에 toString을 호출하였고, 그 결과로 클래스 이름과 해시코드가 출력됨.
		//클래스 이름은 같아도 객체는 해시코드 값이 다르다 !!!		
		
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		
		System.out.println(today);
		System.out.println(today.toString());
		
		// String클래스와 Date클래스의 toString()을 호출하였더니 클래스 이름과 해시코드 대신 다른 결과가 출력
		// String클래스의 toString()은 String 객체가 가진 문자열을 반환하도록 오버라이딩 되어있음 !!
		// Date클래스의 경우 date객체가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어있음!!
		
		// 일반적으로 toString()매서드는 객체나 클래스에 대한 정보 또는 객체 변수들의 값을 문자열로 변환하여 반환하도록 오버라이딩 되는 것이 보통임

	}

}
