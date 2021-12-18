package com.eightcruz.study;

public abstract class Bird {
	public abstract void sing(); //추상 매서드 - 인터페이스와 유사한 형태
								//인터페이스 기능(이거 만들어라~!) + 실제 매서드의 기능
	
	public void fly() { //실제 매서드 
		System.out.println("FLY");
	}
}
