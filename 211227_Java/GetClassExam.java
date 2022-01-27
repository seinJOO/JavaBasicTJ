package Java20211227;

final class Cards { 
	String kind;
	int num;
	
	Cards() {
		this("SPADE", 1);
	}
	Cards(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	@Override
	public String toString() {
		return kind + ":" + num;
	}
}

public class GetClassExam {	
	

	public static void main(String[] args) throws Exception {
/*		
		getClass() - 자신이 속한 클래스의 class 객체를 반환하는 매서드
		class객체는 클래스의 모든 정보를 담고 있음 - 클래스파일이 메모리에 올라갈 때 자동으로 생성됨.		
*/
		Cards c = new Cards("HEART",3); // 값 넣어서 객체 생성
		Cards c2 = Cards.class.newInstance(); //Card 클래스의 새로운 인스턴스(객체)를 만든다~!
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	
	}
}
