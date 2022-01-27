package java1214class;

public class Study {
    /*클래스의 형변환
    
    Van이 Car을 상속받는 경우(작은그릇(자식) -> 큰그릇(부모) = 묵시적 변형)

    부모 Car클래스가 run매소드를 가짐
    자식 Van클래스가 Car클래스를 상속받으며, ppangppang매서드를 가지고 있음

    Car c = new Van();  으로 간단히 형변환해도 문제가 없음
                        (Car의 자료형인 car 객체는 Van의 자료형이 됨)
    c.run(); -> 문제없이 실행됨
    c.ppangppang(); -> 나오지 않음, 에러가 남 
    부모 타입인 Car로 자식생성자 Van을 만들었을 때는 부모가 가진 메서드만 사용할 수 있다.
    Van van = c; ->오류남. Car의 객체인 c는 Car보다 작은 Van에는 넣을 수 없다.
    --> Van van = (Van)c;


    강제 형변환 (큰그릇 -> 작은그릇 (명시적 변형))
    Van van = (Van) c;
    Van의 부모클래스인 Car에서 생성된 c를 Van이 담을 수 있도록 형변환

    예외처리 - 에러 방지를 위한 처리
    중간에 System.out.println("@")을 넣어주면 위에 에러가 발생 시 출력이 안되는 걸 알 수 있음

    */
    
}
