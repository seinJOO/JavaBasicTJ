package Java20211228;

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
				
		8) equalsIgnoreCase()     
     			String r = "Hello";
      			System.out.println(r.equalsIgnoreCase("HELLO"));
  			
  		9) indexOf() 주어진 문자가 문자열에 존재하는지 확인 없으면 -1
  				System.out.println(r.indexOf('o'));
  				System.out.println(r.indexOf('a'));
  			
  		10) lastIndexOf() 지정된 문자가 오른쪽 부터 찾아서 index를 알려준다.
  				System.out.println(r.lastIndexOf('1'));
  			
  		11) length() 문자열의 갯수 길이를 리턴한다.
  				System.out.println(r.length());
  			
  		12) replace() 글자(char)를 바꿔서 보여준다. (문자열은 immutable)
			    System.out.println(r.replace('e', 'a'));
			    System.out.println(r);
  		13) replaceAll() 문자열 바꿔서 보여준다. (문자열은 immutable)
  				System.out.println(r.replaceAll("ll","rr"));
  		14) split() 문자열을 지정된 분리자로 나누어 배열로 변환
			    String animals = "dog, cat, bear";
			    String[] arr = animals.split(", ");
  
		      
		      for (String each : arr) {
		      System.out.print(each + ", ");
		      
		      System.out.print("[");
		       for(int j = 0; j < arr.length; j++) {
		   
		         System.out.println(arr[j]+",");       
		          }
		       System.out.println(arr[arr.length-1] + "]");
   
   		15) substring() 문자열(몇 글자) 잘라내기
		       System.out.println(r.substring(2));
		       System.out.println(r.substring(2,4)); //미만
   
   		16) toLowerCase()전부 소문자로 보여주기
   			toUpperCase()전부 대문자로 보여주기
		       System.out.println(r.toLowerCase());
		       System.out.println(r.toUpperCase());
		       System.out.println(r); //원 문자열은  바뀌지 않는다 immutable
   
   		17) trim() 문자열 앞 뒤에 있는 불필요한 여백 제거
		       String rr= "     Hello    ";
		       System.out.println(rr.trim());
   
   		18) join()문자열들을 결합한다. split()과 반대 
		       String animals2 ="dog,car,bear";
		       String[]arrs = animals2.split(",");    
		       System.out.print("[");    
		       System.out.print(String.join(",", arrs));
		       System.out.print("]");
   
	 	19) StringJoiner(중간문자, 첫문자, 끝문자) : import java.util.StringJoiner 필수!
		       System.out.println();
		       StringJoiner sj = new StringJoiner(",","[","]");
		       for (String ani:arrs)
		          sj.add(ani);
		       System.out.println(sj.toString());
		       
       	20) String.valueOf() - int를 String으로 변환
		       int iVal = 100;
		       String strVal = String.valueOf(iVal);
		       
		21) Integer.parseInt()	- String을 기본형(여기선 정수형)으로 변환
			Integer.valueOf()	- 이것도 많이 씀
   
		       int ii = Integer.parseInt("100");
		       int jj = Integer.valueOf("100");
   		
   		22) 메서드 없이 숫자-> 문자열 변환 : 마지막에 공백 추가하기       
		       double dVal = 200.0;
		       String strVal2 = dVal + "";
			       
			예제) String을 정수형으로 변환 + String을 실수형으로 변환       
		       double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		       double sum2 = Integer.valueOf(strVal) +Double.valueOf(strVal2);

       		 *) 에러가 발생하는 경우 (문자열을 숫자로 변환 하는 과정에서 예외가 발생할 확률이 아주 높음)
       			int val = Integer.parseInt("  123  "); 
       			-> 에러 발생 : 숫자에 문자(빈칸) 포함
       			int val = Integer.parseInt("  123  ".trim()); 
				-> 여백도 문자에 포함이 되어서 여백을 날린다음에 출력해야 함
       
       		예제) 문자열을 잘라서 출력하기
			String fullName = "Hello.java"; - 확장자를 제외한 이름은 Hello, 확장자는 java
		       1. .의 위치 찾기
		       		int idx = fullName.indexOf('.');
		       2. 첫 글자부터 .까지 추출
		       		String fName = fullName.substring(0,idx);
		       3. .다음부터 끝까지 추출
		       		String eName = fullName.substring(idx + 1,fullName.length());
		       4. 각각 출력
		       		System.out.println("확장자를 제외한 이름은 "+fName);
					System.out.println("확장자는 "+ eName);
					
		23) 
              
*/
		
		

	}

}
