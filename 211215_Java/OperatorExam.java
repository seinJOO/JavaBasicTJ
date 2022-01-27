package Java20211215;

public class OperatorExam {
    public static void main(String[] args) {
		/* 연산자 - Operator
		 * 연산자는 '연산을 수행하는 기호ㅓ' + ,- , / ....
		 * 연산자 연산을 수행 하는 기호이며 피 연산자는 작업 대상
		 * 연산자는 피 연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
		 * (연산대상, 변수, 상수, 수식..) 
		 * 
		 * x + 3 식
		 * x,3 이 피연산자. 
		 * 
		 * 연산자와 피연산자를 조합하여 계산을 표현한 것을 식이라하고 그 식을 계산하여
		 *  결과를 얻는것을 '평가 evaluation'이라고 한다. 
		 * 
		 * 연산자의 종류
		 *  - 산술 연산자 : + - * %(나머지 연산자 : 홀짝배수!!!**많이 씀) /  
		 *  - 비교 연산자 : < > <= >= ==(같다) !=(같지않다)
		 *  - 대입 연산자 : = (우변의 내용을 좌변으로 저장)
         *  - 논리 연산자 : || && | &
         *  - 기타 연산자 : 삼항 연산자(if없이 조건문)... 
         *  
         *  피연산자의 갯수에 따라 
         *   단항 연산자 
         *   이항연산자
         *   삼항 연산자  (조건식)? true : false
         *  
         *  연산자의 우선순위 
         *   일반 수학 계산 순서와 동일하게 상식전인 선에서 해결된다. 
         *  
         *  
         *  단항 연산자
         *   - 증가 연산자 ++ : 피연산자의 값을 1증가 시킨다. 
         *     i++; - 값이 먼저 참조되고 나서 증가 ,후위형
         *     ++i; - 값이 증가하고 나서 참조 , 전위형(잘 안쓰임)
         *   - 증감 연산자 -- : 1감소 시킨다. 
         *     i--;
         *     --i;
         *    단항 연산자 하나만 단독으로 사용될때는 차이가 없다. 
         *     
         *  나머지 연산자 % (중요쓰!!!!!!!!!*****)
         *   - 나머지 연산자는 왼쪽엔 피연산자를 오른쪽의 피연산자로 나누고 난 그 나머지만 결과로 반환
         *     나머지 연산자는 홀수 , 짝수 , 배수 검사에 엄청 아주 많이 사용된다.
         *     
         * 등가비교 연산자 == !=
         * 
         * 두개의 피연산자의 값이 같은지== 또는 다른지!=를 비교하여  
         * ==같으면 true 다르면 false 
         * != 다르면 true 같으면 false
         * 
         * 문자열 비교 .equals()
         * 문자열을 비교할 때는 ==을 쓰지 말고, 반드시 .equals()를 사용.
         * 
		 * */
		//.equals는 같은 글자(값)니?
		//==는 같은 메모리에 있니?		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc"; //값이 같으면 같은 위치
		
	System.out.printf("\"abc\"==\"abc\"? %b%n","abc"=="abc");
	System.out.printf("str1==\"abc\"? %b%n",str1=="abc");
	System.out.printf("str2==\"abc\"? %b%n",str2=="abc");
	
		
		 
	
	System.out.println();
	
	System.out.printf("\"abc\".equals\"abc\"? %b%n","abc".equals("abc"));
	System.out.printf("str1.equals\"abc\"? %b%n",str1.equals("abc"));
	System.out.printf("str2.equals\"abc\"? %b%n",str2.equals("abc"));
	
	System.out.println();
	
	System.out.printf("str1==str3? %b%n",str1==str3);
	System.out.printf("str2==str3? %b%n",str2==str3);
	System.out.printf("str2==str3? %b%n",str1.equals(str3));
	System.out.printf("str2==str3? %b%n",str2.equals(str3));
	
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	
            
//	    	System.out.println(1 == 0);
//	    	System.out.println(1 != 0);
//	    	
	    
		

//		int x = 11, y = 7;
//		System.out.printf("x를 2로 나눈 나머지는 %d입니다%n", x%2 );
//		System.out.printf("y를 2로 나누 나머지는 %d입니다%n", y%2 );
//		System.out.printf("x를 5의 나눈 나머지는 %d입니다%n", x%5 );
//		
		
//		int x = 11, y = 8;
//		
//		System.out.printf("%d을 %d로 나누면%n", x,y );
//		System.out.printf("몫은 %d, 나머지는 %d입니다.%n", x/y,x%y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = 5, j =5;
//		System.out.println(i++);
//		System.out.println(++j);
//		
//		System.out.println("i =" +i+ "j =" + j);
//		
		
		
		
//		int i = 5; j = 0;
//		j = i++;
//		
//		System.out.println("j=i++ 실행 후 , i=" + i +" , j=" + j);
//		
//		i =5;
//		j = 0;
//		j = ++i;
		
		
		//단항 연산자를 단독으롤 사용할때는 전위 후위가 없다.		
//		int i = 5;
//		i++;
//		System.out.println(i);
//		
//		i = 5;
//		++i;
//		System.out.println(i);
		
		
		
		
		
		
	}
}
