package Java20211222;
//생성자 두번째 필기 - 생성자에서 다른 생성자 호출

class Car2 {		
	String color;
	String gear;
	int door;
	
	//생성자 오버로딩1 
	Car2() {
		this("white", "auto", 4);	// 자동차의 기본형을 만들어줌 ㅋㅋ
	} //자기자신을 다시 호출해서 생성하는 방법임 !!! (매개변수가 3개인 오버로딩2 생성자를 호출함)
	
	//생성자 오버로딩2
	Car2(String color, String gear, int door) { 
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		//값을 입력하지 않았음에도 Car2()생성자에 있는 this자리에 Car2가 들어감 -> 오버로딩2 생성자 호출됨
		System.out.println("c1의 색상은 "+ c1.color);
		
		Car2 c2 = new Car2("Black", "auto", 4); 
		System.out.println("c2의 색상은 "+ c2.color);

	}

}
