package com.eightcruz.study;

public class DuckExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck();
		duck.sing(); //Duck 클래스에 구현되어 있음
		duck.fly(); //Bird 클래스에 구현되어 있음
		
		Bird b = new Bird();
		//추상 클래스는 부모 클래스로는 사용할 수 있지만(=클래스 특징)
					//객체를 생성 할 수는 없다(=인터페이스 특징)
		//추상 클래스는 abstract 키워드를 클래스 앞에 사용한다
		//추상 클래스는 추상 매서드(인터페이스처럼)를 포함할 수 있다.
		//추상 매서드는 객체 생성이 불가능하다.
		
	}

}
