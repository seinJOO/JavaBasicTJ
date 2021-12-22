package Java20211222;

public class methodExam {
	
	int add(int x , int y) { //웹에서 클라이언트의 요청이 오면 결과값을 쏴줌!!
		int result = x + y;
		return result;		//웹페이지에 쏘는 결과값이기 때문에 리턴의 타입(int) 등이 중요함!
	}

	public static void main(String[] args) {

		int result = add(3,5);
		int result = add(3,5,7); // 에러:개수가 다름 - result에 에러표시가 뜸
		int result = add(1.0,2.0); //에러:타입이 다름
		
		
	}

}
