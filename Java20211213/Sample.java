package Java20211213;
//원래는 클래스 당 각자 파일을 만드는 게 훨씬 나음!
public class Sample {

    public static void main(String[] args) {
        System.out.println(CalExam.add(3)); //객체를 안 찍고 class명으로 접근해서 add메서드를 호출함 -> 3이 add매서드의 num으로 들어감
        System.out.println(CalExam.add(4));

        System.out.println();

        System.out.println(CalExam2.add(2));
        System.out.println(CalExam2.add(3)); // 계산기class들이 따로따로 그 값을 유지해줘야 함! 꼬이면 안됨~~
    }

}
