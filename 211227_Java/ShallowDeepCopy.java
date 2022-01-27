package Java20211227;
/*
- clone()은 단순히 객체에 저장된 값을 그대로 복제할 뿐, 객체가 참조하고 있는 객체까지는 복제하지 않는다 (기본형일 경우 문제 X)	
->	얕은 복사 shallow copy
	- 객체 배열을 clone()으로 복제하는 경우에는 원본과 복제본이 같은 객체를 공유하므로 완전한 복제라고 보기는 어렵다
	- 원본을 변경하면 복사본도 영향을 받는다
	
	깊은 복사 deep copy
	- 원본이 참조하고 있는 객체까지 복제하는 것
	- 깊은 복사에서는 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다
*/
class Circle implements Cloneable {
	Points p;	//원점
	double r;	//반지름
	
	Circle(Points p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() { //얕은 복사 shallow copy
		Object obj = null;		
		try {
			obj = super.clone();
		}catch (CloneNotSupportedException e) {}
		return (Circle) obj;
	}
	
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		Circle c = (Circle) obj;
		c.p = new Points(this.p.x, this.p.y);
		return c;
	}
	public String toString() {
		return "[p = " + p + ", r = " + r + "]";
	}
}

class Points {
	int x, y;
	Points (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + ", "+ y + ")";
 	}
}

public class ShallowDeepCopy {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Points(1,1),2.0); // Points 클래스의 1,1값 = Circle의 p값, r값 2.0
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1 = "+ c1);
		System.out.println("c2 = "+ c2);
		System.out.println("c3 = "+ c3);
		
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("====c1 변경 후====");
		System.out.println("c1 = "+ c1);
		System.out.println("c2 = "+ c2);
		System.out.println("c3 = "+ c3); // 원본 c1의 변동이 일어나도 deep copy한 c3의 값은 변하지 않았음!!
/*		
		ShallowCopy()의 내용을 보면 단순히 원본 객체가 가지고 있는 값만 그대로 복사함
		deepCopy()는 shallowCop()에 아래 두 줄을 추가하여
				Circle c = (Circle) obj;
				c.p = new Points(this.p.x, this.p.y);
		복제된 객체가 새로운 Point객체를 참조하도록 함 -> 원본이 참조하고 있는 객체까지 복사한 것.
*/
	}
}
