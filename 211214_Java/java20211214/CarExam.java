package java20211214;
public class CarExam {
    public static void main(String[] args) {
        //Car c1 = new Car();
        //Car c2 = new Car(); //carexam으로 만든 c2객체
        //carexam로 만든 c2인스턴스다 - 클래스와의 관계

        //c1.print(); //c1으로 프린트 매서드 호출

        //생성자는 반드시 1개 이상 존재해야만 함
        //개발자가 만들지 않으면 자동으로 기본생성자
        //default constructor을 자바가 만들어줌

        //Car c1 = new Car(); //이미 Car에서 생성자를 만들었기 때문에 이제 기본생성자는 없음 ㅜㅜ
        Car c2 = new Car("Grandeur"); 
        System.out.println(c2.name);
    }
}