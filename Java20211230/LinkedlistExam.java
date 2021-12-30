package Java20211230;

import java.util.*;

public class LinkedlistExam {

	public static void main(String[] args) {
/*		
	배열 : 가장 기본적인 형태의 자료구조
		장점 - 구조가 간단하다, 사용하기 쉽다, 처리시간이 가장 빠르다
		단점 1. 크기를 변경할 수 없다
				- 크기를 변경하려면 새로운 배열을 생성하여 데이터를 복사한다
				- 충분히 큰 크기의 배열을 생성해야 하므로 메모리가 낭비된다
		   2. 데이터의 추가 또는 삭제에 시간이 많이 걸린다 
		    	- 배열에 데이터를 추가하려면 빈자리를 만들기 위해 데이터들을 복사하여 이동해야 한다
		
		=> 이러한 배열의 단점을 보완하기 위해 링크드 리스트 linked list라는 자료구조가 고안됨
			배열은 모든 데이터가 연속적으로 존재해야 하지만,
			링크드 리스트는 불연속적으로 존재하는 데이터를 서로 연결(linked)한 형태로 구성됨
			
		array		0 1 2 3 4
		linked list 0   1    2		3
					->  ->   ->		->
					링크드 리스트의 각 요소들은 자신과 연결된 다음 요소에 대한 참조(주소값)와 데이터로 구성됨
					삭제하고자 하는 요소의 이전 요소가 - 삭제하고자 하는 요소의 다음 요소를 참조하도록 변경하면 - 삭제가 이루어짐
					배열처럼 복사하는 과정이 필요없어 처리속도가 매우 빠름
					새로운 데이터를 추가할 때는 - 새로운 요소를 생성한 다음 - 추가하고자 하는 위치의 이전 요소의 참조를 새로운 요소에 대한 참조로 변경해주고
					- 새로운 요소가 그 다음 요소를 참조하도록 변경하기만 하면 되므로 - 처리속도가 매우 빠르다
					단점 : 링크드 리스트는 이동방향이 단방향이기 때문에 다음 요소에 대한 접근은 쉽지만 이전 요소에 대한 접근은 어렵다 
						-> 이 단점을 보완한 더블 링크드 리스트도 있음!(이전요소와 다음요소의 참조를 모두 가진 리스트)
						
						
									읽기		추가/삭제
					ArrayList		빠르다	 느리다	-> 순차적인 작업은 더 빠르지만, 비효율적인 메모리 사용
					LinkedList		느리다	 빠르다	-> 데이터가 많을수록 접근성이 떨어짐		
					
			=> 다루고자 하는 데이터의 개수가 변하지 않는 경우라면 ArrayList가 최상의 선택이 되겠지만,
				데이터의 개수 변경이 잦다면 LinkedList를 사용하는 것이 더 나은 선택이 된다
			두 클래스의 장점을 모두 이용해서 조합하여 사용하는 방법도 가능 
			-> 처음에 작업하기 전에 데이터를 저장할 때는 ArrayList를 사용한 다음,
			      작업할 때는 LinkedList로 데이터를 옮겨서 작업하면 더 나은 효율을 얻을수 있음
					
									
		예시) ArrayList와 LinkedList의 처리속도 비교				
			순차적으로 데이터를 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다
			중간에 데이터를 추가/삭제하는 경우에는 LinkedList가 월등히 빠르다!
			
			<main>
				ArrayList al = ne	w ArrayList(2000000);
				LinkedList ll = new LinkedList();
				
				System.out.println("=====순차적으로 추가하기=====");
				System.out.println("ArrayList : "+ add1(al));
				System.out.println("LinkedList : "+ add1(ll));
				System.out.println();		
				
				System.out.println("=====중간에 추가하기=====");
				System.out.println("ArrayList : "+ add2(al));
				System.out.println("LinkedList : "+ add2(ll));
				System.out.println();
				
				System.out.println("=====중간에서 삭제하기=====");
				System.out.println("ArrayList : "+ remove2(al));
				System.out.println("LinkedList : "+ remove2(ll));
				System.out.println();			
				
				System.out.println("=====순차적으로 삭제하기=====");
				System.out.println("ArrayList : "+ remove1(al));
				System.out.println("LinkedList : "+ remove1(ll));
				System.out.println();
				
			<method>
				public static long add1(List list) {
				long start = System.currentTimeMillis();
				for (int i = 0 ; i < 1000000 ; i++) list.add(i+"");
				long end = System.currentTimeMillis();
				return end - start;
				}
				public static long add2(List list) {
					long start = System.currentTimeMillis();
					for (int i = 0 ; i < 10000 ; i++) list.add(500,"X");
					long end = System.currentTimeMillis();
					return end - start;
				}
				public static long remove1(List list) {
					long start = System.currentTimeMillis();
					for (int i = list.size()-1 ; i >= 0 ; i--) list.remove(i);
					long end = System.currentTimeMillis();
					return end - start;
				}
				public static long remove2(List list) {
					long start = System.currentTimeMillis();
					for (int i = 0 ; i < 10000 ; i++) list.remove(i);
					long end = System.currentTimeMillis();
					return end - start;
				}
		예시) ArrayList와 LinkedList의 접근시간 비교 (비교를 위해 데이터의 개수를 크게 잡았으나, 사실 데이터의 개수가 크지 않다면 어느 것을 사용해도 큰 차이는 없다)
			 -> ArrayList의 접근시간이 월등히 빠르다!
			 ArrayList와 LinkedList의 장단점을 잘 이해하고 상황에 따라 적합한 것을 선택해서 사용하기! (하지만 ArrayList 추천)
			 
			 		<main>
				 	ArrayList al = new ArrayList(1000000);
					LinkedList ll = new LinkedList();
					
					add(al);
					add(ll);
					
					System.out.println("====접근시간 테스트====");
					System.out.println("ArrayList : " + access(al));
					System.out.println("LinkedList : " + access(ll));
					
					<method>
					public static void add(List list) {
						for (int i = 0 ; i < 100000 ; i++) list.add(i+"");
					}
					public static long access(List list) {
						long start = System.currentTimeMillis();
						for (int i = 0 ; i < 10000 ; i++) list.get(i);
						long end = System.currentTimeMillis();
						return end - start;
					}
					

*/
		
	}
		

}
