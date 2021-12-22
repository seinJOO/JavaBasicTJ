package Java20211222;

//import java.util.Calendar;
//import java.util.Date;
//import java.util.ArrayList;
//import java.util.*;
//import java.text.*;
//import java.*; (X) -> *은 특정 패키지 내의 모든 클래스들을 의미함
import java.util.Date;
import java.text.SimpleDateFormat;

public class PackageExam {

	public static void main(String[] args) {
		Date today = new Date(); //import한 Date 클래스로 객체 생성
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		//대부분 month는 대문자 MM을 씀 - 시간을 나타내는 mm과 혼동을 피하기 위함
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("오늘의 날짜는 " + date.format(today));
		System.out.println("지금의 시간은 " + time.format(today));
		
/*		
		패키지 package
		- 패키지는 클래스들의 모음이다.
		
		- 패키지에는 클래스와 인터페이스를 포함할 수 있고,
		  연관이 있는 클래스들을 모아서 그룹으로 묶어 놓아 효율적으로 관리할 수 있다.
		  
		- 같은 이름의 클래스라도 패키지명이 다르면 서로 다른 패키지 내에서 존재할 수 있다.
		
		- 클래스가 물리적으로 하나의 클래스파일.class인 것과 같이,
		  패키지는 물리적으로 하나의 디렉토리이다.
		
		- 패키지는 . 점을 구분자로 하여 계층 구조를 구성한다
		- 패키지 선언은 반드시 클래스의 제일 첫 줄에서 선언한다. (주석 제외)
		- 패키지 선언을 안하면 자동으로 '이름없는 패키지'에 속한다.
				-> 패키지 선언을 안한 클래스들은 모두 같은 패키지에 속하게 됨
		- 패키지는 대소문자를 모두 허용하지만 관용적으로 클래스명과의 구분을 위해 소문자로 사용
		
			* 패키지 선언 
			  package 패키지명;
		
		import
		- 다른 패키지에 있는 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다
		- 매번 패키지명까지 붙여서 사용하기엔 너무 불편함
		  -> 클래스의 처음 부분에서 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면
		  	 패키지명을 쓰지 않고 바로 사용할 수 있음
		- 이클립스에서는 ctrl+shift+o / ctrl+space를 통해 쉽게 import 구문을 완성한다.
		
		
*/
	}

}
