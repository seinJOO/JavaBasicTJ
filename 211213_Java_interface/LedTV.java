package Java20211213interface;
public class LedTV implements TV { 
    // LedTV 클래스는 TV인터페이스를 구현한다 = TV 인터페이스에 정의된 모든 매서드를 구현해야만 한다

    // @____ : annotation - 자바에게 확인을 요청함(필수는 아닌 선택) => implements로 받은 인터페이스를 아래 매서드로 덮어쓴 거 확인 좀 해줘~!란 의미
    //                      기본 의미는 자바에게 확인 요청하는건데, 웹개발에서는 필수로 씀 - 생성, 실행 등등의 기능도 해줌
    @Override
    public void turnOn(){
        System.out.println("TV on");
    }

    @Override
    public void turnOff(){
        System.out.println("TV off");
    }

    @Override
    public void changeVolume(int volume){
        System.out.println("Volume change ");
    }

    @Override
    public void changeChannel(int channel){
        System.out.println("Channel change");
    }
    
}
