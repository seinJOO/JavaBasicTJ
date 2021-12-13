package Java20211213interface;
public interface TV {   //인터페이스는 이름만 정의해주는 게 특징!
    public int MIN_VOLUME = 0;  //변수를 대문자로 설정하면 상수의 의미로 사용(숫자를 변화시키지 않고 그대로 일정하게 쓰겠다는 의미!)
    public int MAX_VOLUME = 100;
    
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);

    //인터페이스는 허브의 역할을 함 -> 매서드를 통해 객체를 연결만 시키면 그대로 쓸 수 있음!
}
