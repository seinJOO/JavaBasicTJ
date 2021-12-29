package Java20211229;
import java.util.*; //구버전 8 이전
import java.time.*; //신버전 8 이후
import java.time.format.DateTimeFormatter;

public class DateExam {
/*		
	Calendar는 추상클래스 - 객체를 생성할 수 없고 매서드를 통해서만 사용
	
	Calendar cal = new Calendar(); -> 에러 !!
	Calendar cal = Calendar.getInstance(); -> O
	
	
*/
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해의 연도는 : "+ today.get(Calendar.YEAR));
		System.out.println("현재의 월은 : "+ (int)(today.get(Calendar.MONTH) + 1));
		//MONTH는 0에서 시작함
		System.out.println("올해 중 몇 번째 주 : "+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 중 몇 번째 주 : "+ today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달 중 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이달 중 몇 일 : "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해 중 몇 일 : "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 : "+ today.get(Calendar.DAY_OF_WEEK));
		//요일은 일요일(1)부터 시작
		
		String[] days = {"","일","월","화","수","목","금","토"};
		System.out.println("요일 : " + days[today.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2000,1,1); // 날짜 세팅
		//System.out.println("date1은 " + date1.toString()); ?????????
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000; //초의 차이를 계산 (기본 단위:1000분의 1초)
		System.out.println("date1부터 date2까지 " + diff + "초 지났습니다.");		
		System.out.println("date1부터 date2까지 " + diff/60/60/24 + "일 지났습니다.");
		
//			신버전 - java.time.*; 기능 사용
		System.out.println("----------신버전-----------");
		LocalDate now = LocalDate.now(); 
		System.out.println(now); 	//현재 컴퓨터의 날짜
		
		LocalDate paris = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(paris);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd"); //포맷 지정하는 객체 생성
		String formatedNow = now.format(formatter); // 지정해준 포맷을 새로운 문자열에 넣기
		System.out.println(formatedNow);
		
		int year = now.getYear(); //연도를 뽑을 때
		System.out.println("현재의 연도는 : "+year+"입니다.");
		
		String mon = now.getMonth().toString(); //월을 문자로 뽑을 때
		System.out.println("현재의 월은 " + mon + "입니다.");
		
		int monVal = now.getMonthValue(); // 월을 숫자로 뽑을 때
		System.out.println("현재의 월은 " + monVal + "입니다.");
		
		String dofw = now.getDayOfWeek().toString(); // 요일을 문자로 뽑을 때
		System.out.println("오늘은 "+dofw+"입니다.");
		
		int dofwVal = now.getDayOfWeek().getValue(); // 요일을 숫자로 뽑을 때 - 월요일이 1, 일요일이 7
		System.out.println("오늘은 "+dofwVal+"입니다.");
		
		LocalTime ntime = LocalTime.now();		
		System.out.println(ntime);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH시 mm분 ss초"); //포맷 지정하는 객체 생성
		String formatedTime = ntime.format(form);
		System.out.println(formatedTime);
		//잘라서 뽑아보기
		int hour = ntime.getHour();
		int minute = ntime.getMinute();
		int second = ntime.getSecond();
		System.out.println("현재 시각은 "+ hour + "입니다.");
		System.out.println("현재 분은 "+ minute + "입니다.");
		System.out.println("현재 초는 "+ second + "입니다.");
		
		//------날짜와 시간 함께 처리------//
		
		LocalDateTime curr = LocalDateTime.now();
		
		System.out.println(curr);
		System.out.println(curr.getYear() + "년 " + curr.getMonthValue() + "월 " + curr.getDayOfMonth() + "일 " 
							+ curr.getHour() + "시" + curr.getMinute() + "분" + curr.getSecond()+ "초");
		
		String[] dayko = {"","월","화","수","목","금","토","일"};
		System.out.println("올해 연도는 : " + curr.getYear() + "년 입니다.");
		System.out.println("현재 월은 : " + curr.getMonthValue() + "월 입니다.");
		System.out.println("현재 일은 : " + curr.getDayOfMonth() + "일 입니다.");
		System.out.println("오늘의 요일은 : " + dayko[curr.getDayOfWeek().getValue()] + "요일 입니다.");
		System.out.println("현재 시각은 "+ curr.getHour() + "시 입니다.");
		System.out.println("현재 분은 "+ curr.getMinute() + "분 입니다.");
		System.out.println("현재 초는 "+ curr.getSecond() + "초 입니다.");
		
		
	}

}
