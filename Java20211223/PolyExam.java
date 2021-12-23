package Java20211223;

public class PolyExam {

	public static void main(String[] args) {
/*		
	다형성 Polymorphism
		
		상속과 함께 객체지향개념의 중요한 특징 중 하나.
		상속과 깊은 관계가 있기 때문에 상속을 완전히 이해하고 접근하는 것이 좋다.
		
		다형성은 '여러가지 형태를 가질 수 있는 능력'을 의미
		자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 하여 다형성을 구현한다!
		
	*. 각 클래스의 객체 생성 예시
		Tv class(부모)  <-  CaptionTv class(자식)
		Tv t = new Tv();
		CaptionTv c = new CaptionTv
		(CaptionTv 타입 c = CaptionTv 타입)
		
		위와 같이 새로운 객체 t, c의 타입과 우측의 타입이 일치하는 것이 보통이지만,
		상속관계에 있을 경우 *부모 타입의 참조 변수로 자식 클래스의 객체를 참조하도록 하는 것도 가능*하다
		
	*. 상속 관계에서 부모 타입의 참조 변수로 자식 클래스의 객체를 참조	
	
		(Tv타입 참조변수 t = CaptionTv 타입)
		Tv t = new CaptionTv(); //조상 타입의 참조 변수로 자식 객체를 생성
		-> 실제 객체가 CaptionTv 타입이라 하더라도,
		   참조 변수 t로는 CaptionTv객체의 모든 멤버변수를 사용할 수는 없다.
		   Tv 타입의 참조 변수로는 CaptionTv 객체 중에서 *Tv 클래스의 멤버들(상속 포함)만 사용할 수 있다*.
		   따라서 생성된 CaptionTv 객체의 멤버 중에서 Tv클래스에 정의되지 않은 멤버는 사용 불가!
		   
		=> 둘 다 같은 타입의 객체지만, 참조 변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
		   참조 변수가 사용할 수 있는 멤버의 개수는 객체의 멤버 개수보다 같거나 적어야 한다
		*. 객체 타입이 일치하지 않게 사용하는 이유는 ? 생각해보기
		
		CaptionTv x = new Tv(); (X)
		자식 타입의 참조변수로 조상 타입의 객체를 참조할 수는 없다 -> 자식만 부모를 알아보고, 부모는 자식을 모름
		
	참조 변수의 형변환
		기본형 변수와 같이 참조변수도 형변환이 가능하다.
		단, 상속관계에 있는 클래스 사이에서만 가능하며
			자손 타입의 참조변수를 조상 타입의 참조변수로,
			조상 타입의 참조변수를 자손 타입의 참조변수로 형변환이 가능하다
			조상의 조상으로도 형변환은 가능하다.
			
		기본형 변수의 형변환에서 작은 자료형에서 큰 자료형의 형변환은 생략이 가능하듯,
		자손타입의 참조변수를 조상타입으로 형변환하는 경우는 생략 가능하다.
		참조변수 간의 형변환도 캐스트 연산자를 사용 - ()안에 변환하고자 하는 타입의 이름을 적는다
		
		자손 타입 -> 조상 타입 : 형변환 생략 가능 (Up casting)
		조상 타입 -> 자손 타입 : 형변환 생략 불가 (Down casting)
				
		*. 예시
		Class Car {}
		Class FireCar extends Car{}
		Class AmbuCar extends Car{}	
			
		FireCar f; AmbuCar a; 		
		a = (AmbuCar) f; (X) -> 상속관계가 아닌 클래스 간의 형변환은 불가하다 !!
		
		*. Up casting / Down casting
		Car car; FireCar fe;		
		car = fe; (O) 업캐스팅 : 형변환 생략이 가능 => car = (Car)fe;
		fe = car; (X) 다운캐스팅 : 형변환 생략 불가 => fe2 = (FireCar)car;		
*/
		
		
		Car car = null; //객체 car 선언만 함
		FireCar fe = new FireCar(); //객체 fe 생성함
		FireCar fe2 = null;
		
		fe.water();
		car = fe; //car = (Car)fe; 형변환 생략 가능
		//car.water(); -> 에러 발생 : Car타입의 참조변수 car로는 water()를 호출할 수 없다.
						//자식은 부모를 호출 가능, 부모는 자식을 호출 불가 !!!!!
		fe2 = (FireCar) car; //부모 타입의 참조변수를 자식 타입으로 형변환하여 fe2에 넣기
		fe2.water();
		
	}
}

	class Car {
		String color;
		int door;
		
		void drive() { //기능
			System.out.println("drive !!!");
		}
		void stop() {
			System.out.println("stop !!!");
		}
	}
	
	class FireCar extends Car {
		void water() {
			System.out.println("water !!!");
		}
	}
