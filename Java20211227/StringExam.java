package Java20211227;

public class StringExam {

	public static void main(String[] args) {
/*		
		다른 언어에서는 문자열을 char형의 배열로 다루었으나, 자바에서는 문자열 클래스를 별도로 제공한다
		String 클래스는 문자열을 다루는 데 필요한 매서드들을 함께 제공한다 <-(String은 자료형이 아니다!!!)
		
		1. immutable 클래스 (변경 불가능한)
			- 한 번 생성한 String은 읽어올 수만 있고 변경할 수 없다.
			- 만약 +연산자를 이용해서 문자열을 결합하는 경우 결합된 새로운 문자열이 생성되는 것이다(문자열 자체가 바뀌는 게 아님)
				String a = "a";
				String b = "b";
				String a = a + b;
				연산할 때마다 새로운 문자열을 가진 String 객체가 생성되어 메모리 공간을 차지하게 된다
				-> 가능한 한 결합 횟수를 줄이는 것이 좋다 !
				
				문자열 간의 결합, 추출 등 문자열 작업이 많은 경우에는 String 대신 StringBuffer를 사용하는 것이 좋은데 굳이 안씀 ㅋㅋ				
			1) .equals() : String 문자열의 비교는 항상 .equals() 매서드를 활용한다~!
				
			2) 빈 문자열 String s = ""; 
				-> 참조변수 s가 참조하고 있는 String 객체는 
				       내부에 new char[0]과 같이 길이가 0인 char형 배열을 저장한 것과 같음 (char[] chArr = new char[0]; //길이가 0인 char배열)
				       												(참고: char c = ''; (X) -> char형 변수에는 반드시 하나의 문자를 지정해야만 함)
				   	char[] cArr = new char[0];
					String s = new String(cArr); //String s = new String("");
					System.out.println(cArr.length); // 출력값 0
					System.out.println("@"+s+"@"); // 출력값 @@
					
			3) charAt() 지정된 위치index에 있는 문자를 반환 (0부터 시작)
					String a = new String("Hello"); //주어진 문자열로 객체 생성
					char[] b = {'H','e','l','l','o'};
					String c = new String(b);
					System.out.println(c); // 출력값 Hello
					
					String d = "Hello";
					String e = "012345";
					char f = d.charAt(2);
					char g = e.charAt(2);
					System.out.println(f);
					System.out.println(g);
					
			4) compareTo() 비교해서 같으면 0, 이전이면 -1, 이후면 1로 반환
					int i = "a".compareTo("a"); // 출력값 0
					int i2 = "a".compareTo("b"); // 출력값 1
					int i3 = "b".compareTo("a"); // 출력값 2
					System.out.println(i + "," +  i2 + "," + i3);
					
			5) concat() 문자열들을 붙인다.
					String h = "Hello";
					String k = "World";
					String l = h.concat(k);
					System.out.println(l);
					
			6) contains() 문자열이 포함되었는지 검사			
					String z = "abcdefg";
					boolean y = z.contains("bc");
					System.out.println(y);	
					
			7) endsWith() 지정된 문자열로 끝나는지 검사
					String ab = "Hello.txt";
					boolean aa = ab.endsWith("txt");
					System.out.println(aa);
*/
	}

}
