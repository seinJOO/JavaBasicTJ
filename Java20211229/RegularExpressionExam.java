package Java20211229;
import java.util.regex.*; // 정규표현식 import 해오기

public class RegularExpressionExam {

	public static void main(String[] args) {
/*	
	Regular Expression 정규식, 정규표현식
		정규표현식은 텍스트 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용
		원래는 Unix에서 사용하였는데, 현재는 다양한 대부분의 언어에서 지원하고 있음
		
		많은 양의 텍스트 데이터에서 원하는 데이터를 쉽게 뽑아낼 수도 있고 데이터가 어떤 형식에 맞는 지 체크할 수 있음
		ex) html에서 전화번호나 이메일 주소만 추출
			입력한 비밀번호가 숫자와 영문자의 조합으로 되어있는지 ...등	
		
		<정규식 + Pattern과 Matcher로 일치하는 문자열 출력하기>
		1. 정규식을 매개변수로 Pattern클래스의 static 매서드인 pattern.complie()를 호출하여
		  Pattern 객체를 얻음
		2. 정규식으로 비교할 대상을 매개변수로 pattern 클래스의 Matcher를 호출하여 객체를 얻음
		3. Matcher 객체에 matches() 호출하여 정규식에 부합하는지 확인함
		-> Pattern은 정규식을 정의하고, Matcher은 비교하는 역할을 함!!
		
		예시) 문자열 배열에 담긴 문자열들 중에서 지정한 정규식과 일치하는 문자열을 찾아서 출력		
			
			String[] data = {"bat", "body", "bonus", "cA", "ca", "co", "c.",
							"c0", "car","combat","count","date","dict"};
			
			
			Pattern p = Pattern.compile("c[a-z]*"); 		// 출력값 ca co car combat count
					-> c로 시작하는 모든 소문자 영단어 (문자열 길이에 구애받지 않고 영소문자로 존재하면 모두 출력)												
			Pattern p = Pattern.compile("c[a-z]"); 			//출력값 ca co
					-> c로 시작 + 영어 소문자 하나
			Pattern p = Pattern.compile("c[a-zA-Z]"); 		// 출력값 cA ca co
					-> c로 시작 + 영어 대소문자 하나
			Pattern p = Pattern.compile("c[a-zA-Z0-9]"); 	// 출력값 cA ca co c0
					-> c로 시작 + 영어 대소문자 혹은 숫자 하나
			Pattern p = Pattern.compile("c[0-9]"); 			// 출력값 c0 
					-> c로 시작 + 숫자 하나
			== Pattern p = Pattern.compile("c\\d"); -> c로 시작 + 숫자 하나
			
			
			Pattern p = Pattern.compile(".*"); 				// 모두 출력됨(모든 문자)
			Pattern p = Pattern.compile("c."); 				// 출력값 cA ca co c. c0 
					-> c로 시작 + 모든 문자 하나(숫자/기호 상관ㄴㄴ)
			Pattern p = Pattern.compile("c.*");				// 출력값 cA ca co c. c0 car combat count 
					-> c로 시작 + 모든 문자열
			Pattern p = Pattern.compile("c.*t");			// 출력값 combat count 
					-> c로 시작 + 모든 문자열 + t로 끝남
			Pattern p = Pattern.compile(".*a.*"); 			// 출력값 bat ca car combat date 
					-> a를 포함하는 모든 문자열("a"도 가능)
					
					
			Pattern p = Pattern.compile("[b|c].*"); 		// 출력값 bat body bonus cA ca co c. c0 car combat count 
					-> b나 c로 시작 + 모든 문자열
			== Pattern p = Pattern.compile("[bc].*"); -> or을 넣지 않아도 똑같은 기능
			Pattern p = Pattern.compile("[b-d].*");			//출력값 bat body bonus date dict 
					-> b나 c나 d로 시작 + 모든 문자열
					
					
			Pattern p = Pattern.compile("c\\."); 			// 출력값 c. 
					-> c로 시작 + 문자 . 	=> "\\_"오른쪽의 기능문자를 무효화함 (.은 모든 문자를 의미하는 기능이 있으나, \\.은 문자 "."으로만 사용됨
			Pattern p = Pattern.compile("0\\d{1,2}");
					-> 0으로 시작 + 최소 1자리 최대 2자리의 숫자
			Pattern p = Pattern.compile("\\d{3,4}");
					-> 최소 3자리 최대 4자리의 숫자
			
			
			Pattern p = Pattern.compile("[^b|c].*"); 		// 출력값 date dict 
					-> b나 c로 시작하지 않는 + 모든 문자열
			Pattern p = Pattern.compile(".*a.+");			// 출력값 bat car combat date
					-> a를 포함하는 모든 문자열 + 반드시 1개 이상의 글자가 뒤에 있는(=a를 포함하나 a로 끝나지 않는 문자열)
			Pattern p = Pattern.compile("[b|c].{2}");		// 출력값 bat car
					-> b나 c로 시작하는 + 두 자리의 모든 문자열
			
			for (String d: data) {
				Matcher m = p.matcher(d); //일치하는 걸 찾는 Matcher 클래스
				if (m.matches())
					System.out.print(d + " ");
			}				
						=> c 뒤의 문자 길이가 어떻든 영소문자로 존재하면 모두 출력함
			
			*. 전화번호 찾기
				Pattern p = Pattern.compile("(0\\d{2})-(\\d{3,4})-(\\d{4})");
				정규식의 일부를 괄호로 나누어 묶어서 그룹화 가능! 위 식은 문자열을 세 번 찾음~!
				
		
*/
		String[] data = {"bat", "body", "bonus", "cA", "ca", "co", "c.",
						"c0", "car","combat","count","date","dict","010-261-2291"};
		
		Pattern p = Pattern.compile("(0\\d{2})-(\\d{3,4})-(\\d{4})");
		
		for (String d: data) {
			Matcher m = p.matcher(d);
			if (m.matches())
				System.out.print(d + " ");
		}
	}

}
