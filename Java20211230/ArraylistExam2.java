package Java20211230;
import java.util.*;

public class ArraylistExam2 {
	public static void main(String[] args) {

		//긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담아서 출력하자 !
		
		final int LIMIT = 10; //상수 지정
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		System.out.println(length);
		
		List list = new ArrayList(length/LIMIT + 10); // list의 크기를 여유있게 설정
		
		for (int i = 0 ; i < length ; i+=LIMIT) { // 증강문 -> LIMIT 개수만큼씩 잘라내기 위한 조건
			if(i+LIMIT < length) {
				list.add(source.substring(i,i+LIMIT)); //LIMIT 개수만큼씩 list에 넣기
			}else list.add(source.substring(i));
		}
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 단순히 문자열을 특정 크기로 잘라서 출력하려면 charAt(int i)와 for문을 이용하면 됨
		// 다만 문자열을 잘라서 List배열에 담아놓으면 다양한 작업을 간단하게 처리할 수 있음
		
		// 저장할 요소의 개수를 고려해서 실제 저장할 개수보다 약간 여유있는 크기로 하는 것이 좋음
		// 물론 생성할 때 지정한 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 늘어나긴 하지만, 이 과정에서 많은 처리시간이 소요됨		
		

	}
}
