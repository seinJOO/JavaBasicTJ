package Java20211230;
import java.util.ArrayList;

public class ArraylistExam {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
	}
	public static void main(String[] args) {		
	
/*	
	ArrayList
		- 가장 많이 보편적으로 사용되는 클래스
		- 데이터 저장 순서가 유지되고 중복을 허용한다
		- Vector보다는 ArrayList를 사용하기! - 기존의 Vector를 개선한 것으로 구현원리와 기능적인 측면에서 동일하다
		- 생성한 후에도 수정이 가능하다.
	
	
	
*/
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5)); // 래퍼클래스 활용 - 각각 정수형 객체를 만들어서 ArrayList에 넣음 -> 나중에 게시판 만들 때 활용 예정
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1의 요소들을 subList(시작인덱스, 끝인덱스)로 추출하여 새로운 객체 list2에 저장	
		System.out.println(list1.containsAll(list2)); //list1이 list2의 모든 요소를 포함하고 있는지
		print(list1, list2);
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		
		System.out.println(list1.containsAll(list2));
		
		print(list1, list2);
		
		//list2에서 list1에 있는 객체들을 삭제
		
		for (int i = list2.size() - 1 ; i >= 0 ; i--) { // ArrayList의 인덱스는 대괄호가 아닌 ()을 씀!
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
				
		
}
}