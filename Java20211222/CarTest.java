package Java20211222;
//생성자 첫번째 필기 - 기본 생성자 & 매개 변수가 있는 생성자

class Car {		//한 파일에 여러 클래스 생성은 좋은 방법이 아니지만~~~~
	String color;
	String gear;
	int door;
	
	Car() {								//생성자 오버로딩1	
	}
	
	Car(String c, String g, int d) {	//생성자 오버로딩2
		color = c;
		gear = g;
		door = d;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();		//Car클래스의 객체 c1 생성 -> 오버로딩1로 들어감
		c1.color = "white";
		c1.gear = "Auto";
		c1.door = 2;		//각각 입력하면 번거로우므로 오버로딩을 통해 생성과 동시에 값 입력!		
		
		Car c2 = new Car("Black", "auto", 4); // Car클래스의 객체 c2 생성 -> 오버로딩2로 들어감
		
		System.out.println("c1의 색상은 "+ c1.color);
		System.out.println("c2의 색상은 "+ c2.color);

	}

}
