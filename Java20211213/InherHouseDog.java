package Java20211213;
//할아버지 Animal, 부모 InherDog, 손자 InherHouseDog

public class InherHouseDog extends InherDog {

    public void sleep() { // 1) 부모인 InherDog의 sleep의 이름은 동일하게, 기능을 바꿈 - method overriding
        System.out.println(this.name+" zZZ in house");
    }    

    public void sleep(int hour) { // 2) 동일한 sleep이지만 매개변수가 있는 sleep - method overloading
        System.out.println(this.name+" zZZ in house for "+hour+" hours");
    }
    /*
    public static void main(String[] args) {

        InherHouseDog houseDog = new InherHouseDog();
        
        houseDog.setName("happy");  // 객체에 이름 넣기
        houseDog.sleep();           //1) Dog의 sleep매서드가 아닌, HouseDog에서 기능을 새롭게 추가한 sleep이 쓰임
        houseDog.sleep(3);          //2) 인수를 넣었을 때 매개변수가 있는 sleep 매서드에 들어감
        
        System.out.println(houseDog.name);// 3)이름을 부여하지 않게 되면 ? -> null로 출력 됨 -->두 개를 한 번에 하자면?
    }
    */

    // 3.객체를 이름을 부여하면서 찍어내기

    public InherHouseDog(String name) { //생성자오버로딩1 : 문자열로 들어오면 여기에 들어감
        this.setName(name); //생성자2: 호출된 이름생성자(return타입 없음, 클래스명과 동일한 이름)
    }
    public InherHouseDog(int type) { //생성자오버로딩2 : 정수로 들어오면 여기에 떨어짐
        if (type == 1) {
            this.setName("york");
        }else if (type==2) {
            this.setName("bulldog");
        }
    }
    public static void main(String[] args) {

        InherHouseDog houseDog = new InherHouseDog("happy"); //생성자1: 객체 생성하면서 이름을 바로 이름생성자에 던져넣기
        System.out.println(houseDog.name);                     //생성자오버로딩3 : 문자열로 생성자 호출

        InherHouseDog housedog1 = new InherHouseDog(1);     //생성자오버로딩4 : 숫자로 생성자 호출
        System.out.println(housedog1.name);

        
    }
}
