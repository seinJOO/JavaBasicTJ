package com.eightcruz.study;
//https://thebook.io/006889/ch07/39/01/
public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		if (car instanceof Machine) {
			System.out.println("Car가 Machine을 상속받았습니다.");
		} else System.out.println("Car가 Machine을 상속받지 않았습니다.");
	}
}
