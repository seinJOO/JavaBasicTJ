package java20211214;
public class Car {

    // String name;
    // int number;

    // public Car(String n) {
    //     this.name = n;
    // }

    public void run() { //run매서드 만들기
        System.out.println("RUN!!!");
    }

    //생성자(Car(String n))는 클래스명과 동일해야 하며 리턴 타입과 리턴이 없다 (void도 없음)
    //생성자를 하나라도 만들지 않으면 자바가 자동으로 기본생성자를 생성하지만 
    //하나라도 만들면 계속 만들어줘야함

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        bus.ppangppang(); //부모 클래스로 만든 인스턴스 car는 부모=자신의 자원은 쓸 수 있지만
                        // 자식의 자원=bus는 쓸 수 없음.
    }

    
}