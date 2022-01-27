package java1214study;

public class CarExam extends Car {
    public static void main(String[] args) {
        Car car = new Car("포니",1234);

        System.out.println("name :" + car.name);
        System.out.println("number : " + car.number);
    }
}

//private의 경우 매서드를 통해 접근 가능

/*
추상 클래스 - 인터페이스와 그냥 클래스를 한번에 구현할 수 있는, 지시도 하면서 기능도 하는 클래스


*/