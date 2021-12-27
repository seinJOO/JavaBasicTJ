package Java20211227;

class Point implements Cloneable{ // clone()을 사용하려면 먼저 Cloneable 인터페이스를 구현해야 함!!!(규칙1)
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	public Object clone() { 
		Object obj = null;
			try { //clone()은 반드시 예외처리를 함!!(규칙2)
				obj = super.clone();
			} catch(CloneNotSupportedException e) {} // 명목상 클론으로 인한 예외 캐치
		return obj;
	}
}

public class CloneExam {

	public static void main(String[] args) {
/*		
	clone() 매서드는 자신을 복제하여 새로운 객체를 생성하는 일을 함
	- 어떤 객체에 대한 작업을 할 때, 원래의 객체는 보존하고 clone을 이용해서 새롭지만 동일한 객체를 생성하여 작업을 하면  원래 객체는 그대로 보존되므로,
	    원래 값들을 참조하거나 실패 시 원래 상태로 쉽게 되돌리는 데 도움이 됨.
	    
	- clone()은 단순히 객체 변수들의 값만 복사하기 때문에 일부 완전한 복제가 이루어지지 않을 수 있음.
	
	- 예시) 배열의 경우 복제된 객체도 같은 배열의 주소를 갖기 때문에, 복제된 인스턴스 작업이 원래 객체에 영향을 미치게 됨.(복제본이 변형되면 원본을 건드리게 됨)
		-> 이럴 때는 clone 매서드를 오버라이딩해서 새로운 배열을 생성하고, 배열의 내용을 복사하여 사용하면 된다!
		
	- Cloneable 인터페이스를 구현한 클래스의 인스턴스만 clone()을 통한 복제가 가능하다 -> 인스턴스의 데이터를 보호하기 위한 목적!
	- Cloneable 인터페이스가 구현되어 있다는 것은 클래스의 작성자가 복제를 허용한다는 의미가 된다 !!	
	
	얕은 복사 / 깊은 복사
	- clone()은 단순히 객체에 저장된 값을 그대로 복제할 뿐, 객체가 참조하고 있는 객체까지는 복제하지 않는다 (기본형일 경우 문제 X)
	- 기본형일 경우는 아무런 문제가 없지만 객체 배열을 clone()으로 복제하는 경우에는 원본과 복제본이 같은 객체를 공유하므로 완전한 복제라고 보기는 어렵다
	- 이러한 복제를 얕은 복사 shallow copy라고 함 - 원본을 변경하면 복사본도 영향을 받는다
	
	- 깊은 복사 deep copy는 원본이 참조하고 있는 객체까지 복제하는 것
	- 깊은 복사에서는 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다
	
	
	
	
*/
		Point ori = new Point(3,5);
		Point copy = (Point)ori.clone(); //clone()매서드는 리턴 자료형이 Object이기 때문에, 클래스로 형변환을 해줘야 함!
		System.out.println(ori);
		System.out.println(copy);
		
		
		
	}

}
