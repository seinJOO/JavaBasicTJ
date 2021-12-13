package Java20211213;
public class InherDog extends Animal { // 상속!! Animal 클래스의 자원을 모두 가져옴 -> 같은 기능은 일일히 클래스를 따로 만들 필요 없음

    public InherDog() { //->기본생성자. default constructor

    }

    public void sleep() { // Animal의 기능을 가지고 있으면서 + sleep을 추가하여 기능을 확장시킬 수 있음!
        System.out.println(this.name+" zZZ");
    }
        
        public static void main(String[] args) {
            InherDog dog = new InherDog(); // dog객체 생성
            dog.setName("poppy");
            System.out.println(dog.name);
            dog.sleep();
        }

}

