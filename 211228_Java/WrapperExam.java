package Java20211228;

public class WrapperExam {

	public static void main(String[] args) {
/*
	포장 클래스 wrapper class
	
	- 매개변수로 객체를 요구할 때, 기본형 값이 아닌 객체를 저장해야 할 때, 객체 간의 비교가 필요할 때 등등
		-> 8개의 기본형을 대표하는 8개의 Wrapper 클래스를 이용하면 기본형 값을 객체 형태로 다룰 수 있음!
		기본형	     래퍼클래스		예시
		boolean   Boolean		Boolean b = new Boolean(true);
		char	  Character		Character c = new Character('a');
		byte	  Byte
		short	  Short
		int		  Integer		Integer i = new Integer(100);
		long	  Long
		float	  Float
		double	  Double		Double d = new Double(3.14); Double d = new Double("3.14");
		
	- 예시)
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);		//주소를 비교
		System.out.println(i1.equals(i2)); //값 자체만 비교함
		System.out.println(i1.toString() == i2.toString()); //값의 주소값이 다른곳에 있음
		
		-> 래퍼클래스들은 모두 equals()가 오버라이드 되어 있어서 주소 값이 아닌 객체가 가지고 있는 값을 비교함!
		   ** toString()도 equals()가 오버라이드 되어있어서 객체가 가지고 있는 값을 문자열로 변환하여 반환함
		
	- 예시 *) 문자를 숫자로 바꿔주는 매서드의 차이점 !
			반환값이 기본형인 경우
			int i1 = new Integer("100").intValue();
			
			반환값이 래퍼클래스 타입인 경우
			int i2 = Integer.parseInt("100"); //주로 사용되는 방법
			int i3 = Integer.valueOf("100");
			하지만 상관없음 !JDK1.5부터 도입된 오토박싱 기능 때문에 반환값이 기본형일때와 래퍼클래스일때 차이가 없어짐
			성능은 valueOf가 좀 느림
*/	
		
		 
		
	}

}
