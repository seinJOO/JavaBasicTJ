package Java20211222;
//상속 필기 - 내용 없이 개념 공부하는 클래스
	class Tv {
		boolean power;	//전원
		int channel;	//채널
		
		void power() {}			//전원 기능
		void channelUp() {}		//채널 올림 기능
		void channelDown() {}	//채널 내림 기능		
	}
	
	class CaptionTv extends Tv {
		boolean caption;	//캡션
		void caption() {}	//캡션 기능
	}
	
	public class CaptionTvExam {
		
	public static void main(String[] args) {
		CaptionTv tv = new CaptionTv();			//Tv의 자손인 CaptionTv클래스로 생성한 객체
		tv.power();			//부모 매서드
		tv.channel = 11;	//부모 변수
		tv.channelUp();		//부모 매서드
		System.out.println(tv.channel);
		tv.caption = true;		//본인(자식) 매서드
		tv.caption();			//본인(자식) 매서드
		System.out.println(tv.caption);
	}

}
