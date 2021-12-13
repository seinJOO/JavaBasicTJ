package Java20211213interface;
public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();        // TV(인터페이스)를 LedTV(실제 구현한 클래스)가 구현했기 때문에 이렇게 쓸 수도 있음~
        tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();
    }
}
