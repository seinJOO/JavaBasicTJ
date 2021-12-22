package Java20211222;

public class SuperConstructorExam {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);
		System.out.println(p3.getLoc());
	}
}

class Point {
	int x, y;	
	
	//해결1)
	Point() { // -> 기본생성자는 아무 기능을 하지 않지만, 만들지 않으면 에러가 발생함
	}			// 자손 생성자가 부모 생성자를 자동으로 호출하게 되면 기본생성자가 있어야 하기 때문임 !!

	Point(int x, int y) {	//생성자 Point : 객체 생성
		this.x = x;
		this.y = y;
	}
	
	String getLoc() {
		return "x : "+x+", y = "+y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) { //에러 발생
		//super(x,y); -> 해결2)
		this.x = x;
		this.y = y;
		this.z = z;
	}
	String getLoc() {
		return "x : "+x+", y = "+y + ", z = "+z;
	}	
}

/*
	Point3D클래스의 생성자에서 조상 클래스의 생성자인 Point()를 찾을 수 없다는 내용의 에러가 발생
		-> Point3D클래스의 생성자의 첫 줄에 생성자(부모)를 호출하는 문장이 없기 때문에
		   자바가 자동으로 super();를 생성자의 첫 줄에 넣어준다.
		   -> 부모생성자를 자동으로 호출하였으나 부모클래스에 기본생성자가 없어서 오류 발생!
		해결1) Point 클래스에 기본생성자 Point(){} 만들어주기
		해결2) Point3D클래스의 생성자에 super(x,y);를 입력하여 해당하는 부모생성자를 특정하여 호출하기


*/