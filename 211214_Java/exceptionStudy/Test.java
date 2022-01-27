package exceptionStudy;

public class Test { 
/*
 
public void sayNick(String nick) {
		try {
			if ("fool".equals(nick)) {
				throw new FoolException(); // fool이 에러가 아니지만, 강제로 에러로 인식시키는 문구
											//에러는 결국 객체다!
											//객체 FoolException을 발생시켰으니 활용하려면 해당 클래스 만들기
			}
			System.out.println("당신의 별명은 " + nick + "입니다");
		} catch (FoolException e) {
			System.out.println("에러가 발생했습니다. "); //에러가 발생하면 동작을 멈추지 않고 실행시키기 위한 catch.
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
			test.sayNick("fool");
			test.sayNick("genious");
	}
 */
	
	public void sayNick(String nick) throws FoolException { 

			if ("fool".equals(nick)) {
				throw new FoolException(); 
			}
				System.out.println("당신의 별명은 " + nick + "입니다");
			}

	public static void main(String[] args) {
		Test test = new Test();
		try {		 //최종에서 오류가 나면 안되니까 여기서 예외처리 해주기
			test.sayNick("fool");
			test.sayNick("genious");
		} catch(FoolException e) {
			System.out.println("에러가 발생했습니다.");
		}
	}// throw에서는 에러가 발생해도 각각의 과정에서 예외처리를 해서 실행이 되었었는데, 
		//throws는 과정들 중에 하나에서만 에러가 나도 실행이 안됨.

}
