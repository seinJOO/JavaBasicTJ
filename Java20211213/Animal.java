package Java20211213;

public class Animal {
    
    String name; //클래스 변수 설정

    public void setName(String n) { //3. n의 메서드 setName 추가하기
        this.name = n; //5.  n에 boby가 들어옴 -> cat.name의 출력값은 boby가 됨
        //this는 호출한 객체이름 !!!! -> 클래스마다 객체를 따로 만들 필요 없이, 각 객체를 자유롭게 활용할 수 있게 됨.
    }
    /*
    public static void main(String[] args) {
        Animal cat = new Animal();      //1. 객체 cat을 찍어내기 -> 그 객체를 통해 접근할 수 있도록!
        cat.setName("boby");            //4. 객체 cat에 setName 메서드를 추가하여 "boby"를 메서드의 n에 넣음
        System.out.println(cat.name);  // 2. Animal이라는 클래스로 cat이라는 객체를 찍고, cat을 통해 클래스를 끌어다 쓸 수 있음

        Animal dog = new Animal(); //    1)객체 생성
        dog.setName("happy"); //         2)setName매서드의 n에 "happy" 인풋
        System.out.println(dog.name); // 3)dog.name의 출력값은 happy가 됨
    }
    */
}
