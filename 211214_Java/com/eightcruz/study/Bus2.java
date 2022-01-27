package com.eightcruz.study;

public class Bus2 extends Car2 {

	int fee;
	public Bus2(String name, int number, int fee) {
		super(name, number); //부모의 매서드 호출 = super.매서드명();
		this.fee = fee;
	}
}
