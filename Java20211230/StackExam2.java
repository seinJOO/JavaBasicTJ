package Java20211230;

import java.util.*;

public class StackExam2 {

	public static void main(String[] args) {
/*		
		Stack을 활용하여 입력한 수식의 괄호가 올바른지 확인하기
			- "("를 만나면 스택에 넣고, ")"를 만나면 스택에서 "("를 꺼낸다.
			- 스택이 비어있거나 마지막에 남아있는 게 있으면 오류
			ex. ((2+3)*1)+3	
*/
		Stack st = new Stack();
		String expression = "((2+3)*2)+3";
		
		try {
			for (int i = 0 ; i < expression.length() ; i++) {
				char ch = expression.charAt(i);
				
				if (ch == '(') {
					st.push(ch + "");
				}else if (ch == ')') {
					st.pop();
				}
				System.out.println(st); // 잘 되는지 체크해보기
			}	
				if (st.isEmpty()) System.out.println("괄호가 일치합니다.");
				else System.out.println("괄호가 일치하지 않습니다.");
			
		} catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
		
	}

}
