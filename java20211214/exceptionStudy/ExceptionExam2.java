package exceptionStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int k = divide(i,j); //divide 매서드로 던져버리기 -> 리턴값이 예외(오류)로 나옴
		System.out.println(k); //예외처리덕분에 에러가 발생했음에도 리턴값을 0으로 얻음
		System.out.println("종료");
		
	}
	public static int divide(int i, int j) { //int자료형의 divide매서드를 만듬 - return값은 k
		try { //여기서 에러가 발생하니까 try를 넣어주기
		int k = i/j;
		return k; 
		} catch(Exception e) {
			System.out.println("ERROR!!!");
			return 0;
		}		
		//예외처리는 에러가 발생하는 곳에서 해주기 !!!
	}
}

/*
 주문->포장->영수증 출력-> 배송시작 코딩을 위한 흐름을 대략적으로 나타낼 때 psuedo code를 사용함
 			psuedo code 수도 코드 - 컴퓨터는 이해하지 못하지만 사람은 알아보는 코드
 
  transaction
	  상품 배송() {
	  주문(),
	  포장(),
	  영수증(),
	  배송시작(),
	 }
 ********throw 활용 : 한 과정에서 에러가 발생해도 다른 과정이 처리될 수도 있음**********
	 주문() {
	 try{throw}catch{}
	 }
	 포장() {
	 try{throw}catch{}
	 }
	 영수증() {
	 try{throw}catch{}
	 }
	 배송시작() {
	 try{throw}catch{}
	 }
	 
***********throws 활용 : 한 과정에서만 에러가 발생해도 작업이 멈춤************
	  상품 배송() {
	  try {
	  주문(),
	  포장(),
	  영수증(),
	  배송시작(),
	  } catch(Exception e) "에러가 발생했습니다"
	 }
 
	 주문() throws Exception{
	 }
	 포장() {
	 }
	 영수증() {
	 }
	 배송시작() {
	 }
 */