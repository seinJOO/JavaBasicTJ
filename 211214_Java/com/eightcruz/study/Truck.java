package com.eightcruz.study;

public class Truck extends Car {

	public Truck() {
		//super(); // 부모를 자동으로 호출하는 명령 -> 자동으로 생성되지만, 기본생성자가 없으면 호출이 안됨
		//해결 1. 부모클래스에 기본생성자 만들기 2. 부모생성자를 호출할 때 키워드를 넣어주기
		super("트럭");
		System.out.println("Truck의 기본 생성자");
	}



}
