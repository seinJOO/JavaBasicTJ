package Java20211230;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExam2 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq);
		
		Object obj = null;
		
		while ((obj = pq.poll())!= null) // PriorityQueue는 null을 저장할 수 없음 
			System.out.println(obj);
		
/*		PriorityQueue() : 저장한 순서에 관게없이 우선순위가 높은 것부터 꺼낸다
		저장순서가 3,1,5,2,4 인데 출력 최종 결과는 1,2,3,4,5 -> 우선순위는 숫자가 작을수록 높다
		객체로 Integer 오토박싱(포장) 해주었음 -> Integer와 같은 Number의 자손들을 자체적으로 숫자를 비교하는 방법을 이미 알고 있음!
		내부적으로 저장 공간은 배열을 사용함
		
		
*/
	}

}
