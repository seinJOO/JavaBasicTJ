package Java20211222;

// ***super와 this는 static에서는 사용할 수 없다.***
class Parent {
	int x = 10;
}

class Child extends Parent {
	//int x = 20;
	void method() {
		System.out.println("x= " + x);				//자신의 x값이 없으니 부모의 x값을 가져옴
		System.out.println("this.x = " + this.x);	//자신의 x값이 없으니 부모의 x값을 가져옴
		System.out.println("super.x = "+ super.x);	//부모의 x값을 직접 가져옴
	}
}
public class SuperExam {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
	}

}
