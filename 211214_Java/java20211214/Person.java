package java20211214;
class Person {
    int age;
    String name;

    public Person(int a) { //숫자 하나만 떨어지면 여기로
        age = a;
    }

    public Person(String n, int a) { //문자, 숫자 하나씩 떨어지면 여기로
        this.age = a; //this. 호출할 객체이름이 오는 자리 - 생략가능하지만 웬만하면 다 넣기
        name =  n;
    }
}