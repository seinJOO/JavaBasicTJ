package com.eightcruz.study;

public class TruckExam {
	public static void main(String[] args) {
		Truck t = new Truck(); 
		// Truck을 실행할 때 super();이 자동으로 들어가기 때문에 부모가 자동 호출됨
		//Car c = new Car(""); -> Car에 기본생성자가 없기 떄문에 오류 뜸
		Car c = new Car("트럭");
	}
}
