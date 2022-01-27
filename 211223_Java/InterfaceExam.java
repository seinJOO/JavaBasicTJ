package Java20211223;

public class InterfaceExam {

	public static void main(String[] args) {
/*

	인터페이스 (interface)
		- 인터페이스는 일종의 추상 클래스.
		- 추상 클래스처럼 추상 매서드를 갖지만, 추상화의 정도가 높아서 일반 매서드를 구성원으로 가질 수 없다
		- 오직 추상 매서드와 상수만을 멤버로 가질 수 있다
		- 그 외의 어떤 다른 요소도 허용하지 않는다 (추상 클래스는 일반 매서드를 구성원으로 갖기도 함)
		  (추상 클래스는 부분적으로만 완성된 '미완성 설계도')
		- 인터페이스는 구현된 것은 아무것도 없고 밑그림만 그려진 '기본 설계도'
			-> 다른 클래스에 도움을 주려는 목적으로 사용		
		- 모든 매서드는 public abstract이고, 생략할 수는 있다.
				(java8부터는 static, default 매서드 사용 가능)
		- 모든 변수는 public static final이어야 하며, 생략 가능하다
		
		interface Play {
			public static final int SPADE = 4;
			final int DIAMOND = 3;
			static int HEART = 2;
			int COLVER = 1;
			
			String getCardKind(); 
			//public abstract String getCardKind();
			원래 인터페이스의 모든 매서드는 추상매서드여야 하는데,
			java8버전부터 인터페이스에 static 매서드와 default 매서드의 추가를 허용함
		
	인터페이스 상속
		- 인터페이스는 인터페이스로부터 상속을 받을 수 있다
		- 클래스와는 다르게 다중 상속(= 여러 개의 인터페이스로부터 상속받기)이 가능하다.
		예시)	interface Fightable extends Movable, Attackable {}
		- 자식 인터페이스는 조상 인터페이스들에 정의된 모든 것을 상속받는다 (클래스 상속과 동일하게)
		- 그 자체로는 객체를 생성할 수 없다 (추상클래스와 동일하게)
		- 추상 클래스가 상속을 통해 추상매서드를 완성하는 것처럼,
		  인터페이스도 자신의 정의된 추상매서드의 몸통을 만들어주는 클래스(=명세표)를 작성해야 한다
		  
	인터페이스의 다형성
		- (클래스에서의 다형성도 자손 클래스의 객체를 조상 타입의 참조변수로 참조하는 것이 가능하듯이,)
		- 인터페이스 타입의 참조 변수로 이를 구현한 클래스의 객체를 참조할 수 있고, 형변환도 가능하다
			Fightable f = new Fighter(); //Fighter의 객체이면서 Fightable자료형인 f를 생성??
			-> Fighter 클래스는 Fightable 인터페이스를 구현하고 있기 때문에 가능함
			
		- 따라서 인터페이스는 매서드의 매개변수의 타입으로 사용될 수 있다.
			void attack(Fightable f){} //Fightable인터페이스의 자료형을 가진 f를 매개변수로 사용??
	인터페이스의 장점
		- 개발시간을 단축시킨다
		  :분업화하여 한쪽에서는 만들어야 할 것들의 목록을, 다른 쪽에서는 그 목록을 구체화하여 동시 개발 진행 가능.
		- 표준화가 가능하다
		  :인터페이스라는 기본 틀을 사용하여 여러 작업을 진행하면 기본틀에 맞는 일관되고 정형화된 개발 가능.
		- 관계 없는 클래스들에게 관계를 맺어줄 수 있다
		  :서로 상속 관계도 아니고 같은 조상 클래스도 가지지 않은 아무 관련없는 클래스들에게
		   하나의 인터페이스를 공통적으로 구현하여 관계를 만들 수 있다
		- 독립적인 프로그래밍이 가능하다
		  :인터페이스를 이용하면 선언과 구현을 분리시킬 수 있기 때문에 실제 구현에 독립적인 프로그램 작성이 가능.
		   클래스 간의 직접적인 관계를 인터페이스를 이용하여 간접적인 관계로 변경하면,
		   한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능
		  
		***. a instanceof b -> a는 b의 객체다
		  
		  (↓ 인터페이스 상속 관계 확인 코드)
*/			
		Fighter f = new Fighter();
		if (f instanceof Unit) 
			System.out.println("f는 Unit의 자손입니다"); //true
		if (f instanceof Fightable) 
			System.out.println("f는 Fightable 인터페이스를 구현했습니다");
		if (f instanceof Movable)
			System.out.println("f는 Movable 인터페이스를 구현했습니다");
		if (f instanceof Attackable)
			System.out.println("f는 Attackable 인터페이스를 구현했습니다");
		if (f instanceof Object)
			System.out.println("f는 Object와 관계가 있습니다");
		//if (f instanceof Sein) System.out.println("f는 Sein과 관계가 있습니다");
		//모든 객체는 Object라는 (기본 객체)클래스의 자손이다 !!!!!!(우리가 정의하지 않아도 성립 됨)
	}
}
	class Fighter extends Unit implements Fightable {
		public void move(int x, int y) {}
		public void attack(Unit u) {}
	} //인터페이스를 상속받으면 인터페이스 내에 명시된 객체들은 모두 자동으로 생성된다
	
	//Fighter 클래스는 Unit 클래스와 Fightable 인터페이스를 상속받았는데, 
	//Fightable은 Movable과 Attackable을 상속받았기 때문에,
	//Fighter클래스는 Movable에 있는 move매서드와 Attackable에 있는 attack매서드에 접근할 수 있다!

	interface Fightable extends Movable, Attackable {		
	}
	interface Movable{
		void move(int x, int y);
	}
	interface Attackable {
		void attack(Unit u);
	}
	class Unit {
		int currentHP; //유닛의 체력
		int x; //유닛의 x위치
		int y; //유닛의 y위치
	}		
/*	
	Movable		Attackable
		\			/
		Fightable(implement)	Unit(extends)
						  \		/
						   Fighter	
*/			
