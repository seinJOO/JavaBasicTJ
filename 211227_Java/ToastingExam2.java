package Java20211227;

class Card2 {
	String kind;
	int number;
	
	Card2() { //생성자 오버로딩 - 아무것도 입력하지 않으면 여기를 입력 후 아래로 떨어짐
		this("SPADE", 1);
	}
	Card2(String kind, int number) {//값을 받으면 여기로, 값을 받지 못하면 Card()로부터 값을 받아서 리턴함.
		this.kind = kind;
		this.number = number;
	}	
	@Override	//: 오버라이딩 했으니 확인 좀 해줘~(Annotation(@)) -> 웹개발에서는 애너테이션 안 쓰면 에러가 생기고, 활성화되지 않음.
	public String toString() { //toString 매서드의 기본 설정을 쓰지 않고, 내가 설정한 기능을 적용해 사용하겠다 = 오버라이딩(매서드가 포함된 클래스의 객체에서만 적용됨)
		return "Kind : " + kind + ", Number : " + number;
	//Card 클래스의 인스턴스인 c1,c2의 toString()을 호출하면 객체가 갖고 있는 변수 kind와 number의 값을 문자열로 변환하여 반환하도록 toString()을 오버라이딩함
	//접근제어자를 public으로 선언하여 Card클래스의 toString()과 동일하게 설정하였음
	}
}

public class ToastingExam2 {

	public static void main(String[] args) {
		
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("Heart", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1);

	}

}
