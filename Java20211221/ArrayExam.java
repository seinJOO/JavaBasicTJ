package Java20211221;

public class ArrayExam {

	public static void main(String[] args) {
		
/* 1. int 배열 예제
		 4444657953
		 0의 갯수 :
		 1의 갯수 : 
		 2의 갯수 :		 

		
		int [] numArr = {4,4,4,6,5,7,9,7,5,3};
		int [] counter = new int[10];
		
		for (int i = 0 ; i < numArr.length; i++) {
			counter[numArr[i]]++;	
			//counter[numArr[i]] = counter[numArr[i]] + 1;
		}
		
		for (int i = 0 ; i < counter.length; i++) {
			System.out.println(i + "의 갯수 : " + counter[i]);
		}

	2. String 배열
	
		1) String 배열 생성 방법
	
			String[] name = new String[3]; //길이가 3인 String 배열 생성
			name[0] = "kim";
			name[1] = "Song";
			name[2] = "Park";
			
			String[] name2 = {"Kim", "Song", "Park"};
			String[] name3 = new String[]{"Kim", "Song", "Park"}; // 요게 객체 생성의 정석 !!!
		
		2) for each 구문으로 배열 전체 출력하기
		
			for (String each : name) {
				System.out.print(each + " ");
			}
		
		3) char 배열을 String 배열로 변환		
			char[] chArr = {'A','B','C'};
			
			- char배열을 스트링으로
			String str = new String(chArr);
				//System.out.println(str); - 배열의 문자들을 문자열 str에 넣음 - 요렇게 출력 가능
			
			- 스트링을 char배열로
			char[] tmp = str.toCharArray();
				// System.out.println(tmp); - 배열이기 때문에 이렇게 출력은 안됨
			
			- 스트링을 char배열로 2
			String src = "ABCDE";		
			for (int i = 0 ; i < src.length() ; i++) {
				char ch = src.charAt(i);
				System.out.println("src.charAt(" + i + ") : " + ch);
			}
			

*/	
		
	}
}
