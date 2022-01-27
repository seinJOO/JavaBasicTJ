package Java20211228;

public class StringBufferExam {

	public static void main(String[] args) {
/*		
	String은 immutable이기에 변경이 불가능하지만,
	StringBuffer은 변경이 가능함
	
	StringBuffer
		- 객체를 생성할 때 적절한 길이의 char형 배열이 생성되고, 이 배열은 문자열을 저장하고 편집하기 위한 공간으로 사용됨
		- 예시 1) 
				StringBuffer sb = new StringBuffer("abc");
				System.out.println(sb); // 출력값 abc
				sb.append("123"); 
				System.out.println(sb); //출력값 abc123
				-> sb에 새로운 문자열이 추가되고, sb 자신의 주소를 반환하여 다시 생성하는 개념
				   (기존 객체에 문자열을 추가하여 같은 이름의 객체를 다시 만드는 것!)
		
		- 예시 2)
				StringBuffer sb2 = sb.append("zzz");
				System.out.println(sb2); // 출력값 abc123zzz
				System.out.println(sb); // 출력값 abc123zzz
		
		- 예시 3)
				StringBuffer sb3 = new StringBuffer("abc");
				System.out.println(sb3);
				sb3.append("123").append("zzz");
				System.out.println(sb3); // 출력값 abc123zzz 한번에 다중 추가 가능!
		- 예시 4)
				StringBuffer sbr1 = new StringBuffer("abc");
				StringBuffer sbr2 = new StringBuffer("abc");
				
				System.out.println(sbr1 == sbr2);		//false 
				System.out.println(sbr1.equals(sbr2));	//false -> 그냥 String일 땐 True
				
				-> String에서는 equals를 오버라이딩해서 문자열의 내용만 비교하도록 구현되어 있음 (true)
				   StringBuffer에서는 equals를 오버라이딩하지 않아서 .equals가 ==(주소비교)와 같은 기능을 함
				   	
		- 예시 5) toString()은 equals가 오버라이드 되어 있기 때문에, StringBuffer에서 문자열 비교 시 활용할 수 있다!!
				StringBuffer str1 = new StringBuffer("abc");
				String str2 = str1.toString();
				
				System.out.println(str1.toString().equals(str2));	
		
*/
		
		
		
	}

}
