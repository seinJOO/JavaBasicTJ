package com.eightcruz.study;

public class BusExam {
	public static void main(String[] args) {
		Bus2 bus = new Bus2("뛰뛰", 3000, 1050);
		if(bus.name != "뛰뛰") {
			  System.out.println("bus의 name이 다릅니다.");
        }
        else if(bus.number != 3000) {
            System.out.println("bus의 number가 다릅니다.");
        }
        else if(bus.fee != 1050) {
            System.out.println("bus의 fee가 다릅니다.");
        }
        else{
            System.out.println("정답입니다.");
        }            
    }
}
