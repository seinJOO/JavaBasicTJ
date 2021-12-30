package Java20211230;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackQueExam {

	public static void main(String[] args) {
/*
		Stack & Queue 스택과 큐
		
		LIFO - Last In First Out : 마지막에 들어간 데이터가 제일 먼저 나온다
			스택은 마지막에 저장한 데이터를 가장 먼저 꺼낸다 ArrayList
			in 1 2 3	out 3 2 1
			
		FIFO - First In First Out : 처음에 들어간 데이터가 제일 먼저 나온다
			큐는 처음에 저장한 데이터를 가장 먼저 꺼낸다 LinkedList
			in 1 2 3 	out 1 2 3
			
		자바에서 Stack은 Stack 클래스로 구현하여 제공하고 있지만,
		Queue는 Queue 인터페이스로만 정의하고 별도의 클래스를 제공하지 않는다. -> Queue 인터페이스를 구현한 클래스들을 선택하여 사용(LinkedList)
		
			예시 1)
				Stack st = new Stack();
				Queue qu = new LinkedList(); // Queue 인터페이스를 구현하는 LinkedList 클래스로 객체 생성
				
				st.push("0");
				st.push("1");
				st.push("2");
				
				qu.offer("0");
				qu.offer("1");
				qu.offer("2");
				
				System.out.println("=====Stack=====");
				
				while (!st.empty()) System.out.println(st.pop()); // Stack용 값 출력 매서드
				
				System.out.println("=====Queue====="); // qu는 LinkedList기 때문에 isEmpty로 데이터 존재 유무 판단
				while (!qu.isEmpty()) System.out.println(qu.poll()); // Queue용 값 출력 매서드
				
		*. 스택과 큐를 직접 구현하기 위해서는 벡터를 상속받아야한다 (extends Vector)- 여기서는 하려면 복잡해서 그냥 안할게용~!
		
		스택(위아래로 쌓음)과 큐(옆으로 쌓음)의 활용
		스택의 활용 - 수식 계산(수식 괄호 검사) 웹브라우저의 앞으로 가기/뒤로 가기, 워드에서 undo/redo
		큐의 활용 - 인쇄 대기목록, 최근 사용문서, 은행 줄서기
			
*/
		
		
	}

}
