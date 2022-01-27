package com.eightcruz.study;

public class Duck extends Bird {

	@Override //자동으로 Bird의 sing이 오버라이드 됨 - 인터페이스와 비슷
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Duck Duck !!");

	}

}
