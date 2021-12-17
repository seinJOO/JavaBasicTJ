


/* -1-

Map 맵 - 데이터를 key값과 value값의 쌍으로 저장하는 구조 (파이썬의 딕셔너리, JS의 JSON, ...)
        순서(인덱스)가 없이 key값으로만 value값을 얻음
        map의 가장 큰 특징은 순서에 의존하지 않고 key값으로 value값을 가져오는 데 있음.
        하지만 순서로 데이터를 가져올 필요가 있으면 LinkedHashMap TreeMap 등을 사용한다.
        ex. key     value
            name    홍길동
            age       16

import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("people","사람");
    map.put("baseball","야구"); //put으로 key-value 삽입
    System.out.println(map.get("people")); //key값으로 value값 추출
    System.out.println(map.containsKey("people")); //key값 존재 유무 확인
    System.out.println(map.size()); //크기, map의 개수 확인
    System.out.println(map.remove("people")); //map의 항목을 삭제
    System.out.println(map.size()); //"people"항목이 삭제됨을 확인
  }
}
*/

/*-2- 제어문 - 조건문(if, switch) & 반복문(for, while)

if (조건) {
  true일 경우 명령어
} else {
  false일 경우 명령어
}

class Main {
  public static void main(String[] args) {
    boolean money = true;

    if (money) {
      System.out.println("택시타기");
    } else {
      System.out.println("걸어가기");
    }
  }
}

class Main {
  public static void main(String[] args) {

    int money1 = 3000;

    if (money1 >= 5000 ) {
      System.out.println("택시타기");
    } else {
      System.out.println("걸어가기");
    }

  }
}

-3-
or = 둘 중 하나만 만족해도 ture
  | : 앞에가 true여도 조건들 모두 체크 (shift+\)
  || : 앞에가 true면 뒤에꺼는 보지 않기 -> 작동시간을 줄임

&& and = 둘 다 만족해야만 true
  & : 앞에가 true여도 조건들 모두 체크
  && : 앞에가 true면 뒤 조건은 고려안함 -> 작동시간을 줄임

class Main {
  public static void main(String[] args) {

    int money = 10000;
    boolean card = true;

    if (money >= 5000 || card ) {
      System.out.println("택시타기");
    } else {
      System.out.println("걸어가기");
    }


    if (money >= 5000 && card ) { 
      System.out.println("택시타기");
    } else {
      System.out.println("걸어가기");
    }
  }
}
-4- if문 - ArrayList 활용
if 혼자 활용

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    ArrayList<String> pocket = new ArrayList<String>();

    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if (pocket.contains("card")) {
      System.out.println("택시탄다");
    } else {
      System.out.println("걸어간다");
    }    
  }
}

-5- 
경우의 수를 늘려보기 ex. 카드는 없어도 돈이 있으면 택시타기

경우의 수가 여러개일때 if안에 if사용 - 가독성이 저하되니 지양하기

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    ArrayList<String> pocket = new ArrayList<String>();

    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if (pocket.contains("card")) {
      System.out.println("택시탄다");
    } else {
      if (pocket.contains("money")) {
        System.out.println("택시탄다");
      } else {
        System.out.println("걸어간다");
      }      
    }       
  }
}
elseif를 활용해 경우의 수 늘려보기**
  - if를 만족하지 못한 모든 게 else로 내려옴

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    ArrayList<String> pocket = new ArrayList<String>();

    pocket.add("paper");
    pocket.add("handphone");
    pocket.add("money");

    if(pocket.contains("card")) {
      System.out.println("택시탄다");
    } else if (pocket.contains("money")) {
      System.out.println("택시탄다");
    } else {
      System.out.println("걸어간다");
    }   
  }
}
-6-
중괄호를 누락했을 때

class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if (x > y) {
      System.out.println("x는 y보다 작습니다");
      System.out.println("test 1");
    }
    if (x > y) 
      System.out.println("x는 y보다 큽니다");
      System.out.println("test2"); 
      
  // 출력값 "test2" -> {}중괄호가 없어서 if문과 관계없는 코드로 인식
  }
}

-7- else활용
= : 오른쪽 값을 왼쪽에 넣기
== : 양쪽 값이 같음
!= : 양쪽 값이 같지않음

class Main {
  public static void main(String[] args) {
    int x = 50;
    int y = 60;

    if (x == y) {
      System.out.println("x는 y와 같습니다");
    }else {
      System.out.println("x는 y와 다릅니다");
    }
    
  }
}

*클래스 2개 생성하여 다른 클래스의 매서드 활용하기


public class Main {
  public int IfTest(int value) {
    
    int ret=0;
    if (value % 3 == 0) {
      ret = 3;
    } else if (value % 4 == 0) {
      ret = 4;
    }
    return ret; //if문이 끝나면 ret값을 출력함
  }

  public static void main(String[] args) {
    Main exam = new Main(); //Main 클래스의 객체 exam을 찍어냄 -> exam을 찍어내서 Main클래스의 IfTest매서드를 쓸 수 있음
    System.out.println(exam.IfTest(6)); 
    System.out.println(exam.IfTest(8)); // = IfTest 메서드를 호출 -> 호출하면서 값을 value에 넣음 -> 리턴값 ret 출력
    System.out.println(exam.IfTest(12)); // if문의 3배수 구문에서 걸리니까 else if 구문까지 안감 -> 3 출력
  }
}


-8-
switch-case 구문 : if문과 비슷하지만 절차를 단순화하는 구문

        int month = 12;
        String monthString="";

        switch (month) {
          case 1: monthString = "jan";
                  break; //break에 오면 switch 구문에서 벗어남
          case 2: monthString = "feb";
                  break;
          case 3: monthString = "mar";
                  break;
          case 4: monthString = "apr";
                  break;
          case 5: monthString = "may";
                  break;
          case 6: monthString = "jun";
                  break;
          case 7: monthString = "jul";
                  break;
          case 8: monthString = "aug";
                  break;
          case 9: monthString = "sep";
                  break;
          case 10: monthString = "oct";
                  break;
          case 11: monthString = "nov";
                  break;
          case 12: monthString = "dec";
                  break;
        }
        System.out.println(monthString);

오류 - break구문이 없으면 value값에 해당하는 case부터 전부 실행됨
      아래 구문 출력값 apr -> break가 없어서 case1에서 빠져나오지 못하고 break구문이 있는 case4까지 내려갔음

public class Main {
  public static void main(String[] args) {

    int month = 1;
    String monthString="";

    switch (month) {
      case 1: monthString = "jan";
              //break; //break에 오면 switch 구문에서 벗어남
      case 2: monthString = "feb";
              //break;
      case 3: monthString = "mar";
              //break;
      case 4: monthString = "apr";
              break;
      case 5: monthString = "may";
              break;
      case 6: monthString = "jun";
              break;
      case 7: monthString = "jul";
              break;
      case 8: monthString = "aug";
              break;
      case 9: monthString = "sep";
              break;
      case 10: monthString = "oct";
              break;
      case 11: monthString = "nov";
              break;
      case 12: monthString = "dec";
              break;
    }
    System.out.println(monthString);
  }
}

위 문제를 else if로 구현하기

    int mon = 7;

    if (mon == 1) {
      System.out.println("jan");
    }else if (mon == 2) {
      System.out.println("feb");
    }else if (mon == 3) {
      System.out.println("mar");
    }else if (mon == 4) {
      System.out.println("apr");
    }else if (mon == 5) {
      System.out.println("may");
    }else if (mon == 6) {
      System.out.println("jun");
    }else if (mon == 7) {
      System.out.println("jul");
    }else if (mon == 8) {
      System.out.println("aug");
    }else if (mon == 9) {
      System.out.println("sep");
    }else if (mon == 10) {
      System.out.println("oct");
    }else if (mon == 11) {
      System.out.println("nov");
    }else if (mon == 12) {
      System.out.println("dec");
    }


겹치는 결과값끼리는 break, 조건을 단일화하여 가독성있게!

-현재 월을 입력하여 봄 여름 가을 겨울 중 하나의 값만 출력하기
switch 구문 사용하기
import java.util.Calendar;
public class Main{
  public static void main(String[] args) {
    
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1 ; //month도 0부터 시작함
    String season = "";

    switch (month) { 
      case 12: case 1: case 2: 
      season = "겨울";
        break;
      case 3: case 4: case 5: 
      season = "봄";
        break;
      case 6: case 7: case 8: 
      season = "여름";
        break;
      case 9: case 10: case 11: 
      season = "가을";
        break;
    }
    System.out.println(season);
  }
}
if구문 사용하기
import java.util.Calendar;
public class Main{
  public static void main(String[] args) {
    
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1 ; //month도 0부터 시작함
    String season = "";

    if (month <= 2) {
      season = "겨울";
    }else if (month <= 5) {
      season="봄";
    }else if (month <= 8) {
      season="여름";
    }else if (month <= 11) {
      season="가을";
    }else {
      season="겨울";
    }
    System.out.println(season);
  }
}

반복문 - while (+for, do while)
    while은 조건이 참일 동안 계속 반복실행한다.
    무한루프가 되지 않게 탈출조건을 잘 설정해줘야 함!
간단 예제1
public class Main {
  public static void main(String[] args) {
    int i = 0 ;

    while (i < 10) {
      System.out.println(i + " hi~");
      i++;
    }
  }
}
예제2
public class Main {
  public static void main(String[] args) {
    int i = 0;

    while(i < 10) {
      i++; // i = i + 1 ; i += 1 ;
      System.out.println("나무를 " + i + " 번 찍었습니다.");
      if (i == 10) { // 10일 때 한번 더 while문으로 올라갔다가 내려옴..?
        System.out.println("나무 넘어간다~");
      }
    }
  }
}
break활용
public class Main {
  public static void main(String[] args) {
    int i = 0;

    while(true) {
      i++; 
      System.out.println("나무를 " + i + " 번 찍었습니다.");
      if (i == 10) { 
        System.out.println("나무 넘어간다~");
        break;
      }
    }
  }
}
반복문을 실행하다가 break를 만나면 구문을 빠져나간다
public class Main {
  public static void main(String[] args) {
    int coffee = 10 ;
    int money = 300 ;

    while(money > 0) {
      System.out.println("커피를 드립니다");
      coffee --;    //한 잔 팔때마다 하나씩 감소
      System.out.println("남은 커피는 " + coffee + "잔입니다");
      if (coffee == 0) { 
        System.out.println("커피가 다 떨어졌습니다. 판매를 종료합니다.");
        break;
      }
    }
  }
}

continue : 조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아가도록 함 (break랑 세트로 알아놓기)

break와 continue는 for랑도 쓰이나 while이랑 더 많이 쓰임 (while은 무한루프가 가능하기 때문에 break/continue로 제어해줌)

public class Main {
  public static void main(String[] args) {
    int i = 0 ;

    while (i < 10) {
      i++;
      if (i % 2 == 0) {
        //System.out.println("skip "+i); <- **Tip : 이해가 안가면 변수를 출력해서 변수의 변화를 확인하기 !
        continue; //짝수면 아래 구문을 실행하지 않고 while로 돌아감
      }
      System.out.println(i); //홀수만 출력
    }
  }
}
1부터 100까지의 합 + 과정 체크
public class Main {
  public static void main(String[] args) {
    int i = 1 ;
    int total = 0;

    while (i <= 100) {
      total = total + i;      
      //System.out.println("i = "+ i + " total = "+ total); //-> 과정 체크
      i++;
    }
    System.out.println(total);
  }
}


do~while문 : do~while은 조건이 참일 동안 계속 반복실행한다 =while
            무조건 한 번은 반드시 실행된다. (while은 한번도 실행이 안될 수 있음)
            잘 안씀
기본 모양
    do {
    }while()

예문1 + 숫자 직접 입력하는 기능 활용
import java.util.Scanner; //키보드로 입력받은 값을 사용하는 기능 불러오기

public class Main {
  public static void main(String[] args) {    

    int i = 0;
    Scanner scan = new Scanner(System.in); //키보드로 입력받은 값을 scan에 넣기

    do {
      i = scan.nextInt();
      System.out.println("입력받은값: " + i);
      
    }while(i != 0);
    System.out.println("종료");
  }
}
예문2
입력값을 계속 누적하되, 입력값이 100이상일 때 sum출력하여 종료시키기
import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {    

    Scanner scan = new Scanner(System.in);
    int value = 0;
    int sum = 0;

    do {
      value = scan.nextInt();
      sum += value;
      
    }while(value < 100); //()조건에 부합할 때 반복하기 !!!!
    System.out.println(sum);
    
  }
}


for문
1. 기본적으로 인수가 3개 - start초기문 ; stop조건문 ; step증강문
                          (어디부터 ; 어디까지 ; 얼마씩)
    ㄴ 정확하게 몇 번 실행할지 알고 있을 때

예문1 (1~100까지 모두 합하기)
public class Main {
  public static void main(String[] args) {    

    int sum = 0 ;

    for (int i = 1; i <= 100; i++) {
      sum += i;
      //System.out.println("i= " + i + " sum = " + sum); ->중간체크
     }
     System.out.println(sum);
    
  }
}
예문2 1~100까지의 수 중 홀수들의 누적합계를 구하시오(for, if, continue 활용)
public class Main {
  public static void main(String[] args) {    

    int sum = 0 ;

    for (int i = 1; i <= 100; i++) {

      if (i % 2 == 0) {
        continue;
      }
      sum += i;
     }
    System.out.println(sum);    
  }
}

예문3 break로 for문 빠져나가기 (1~50까지의 합)
      (굳이 조건문을 100으로 건게 좀 그렇긴 하다만 ...)
public class Main {
  public static void main(String[] args) {
    int sum = 0 ;
    for (int i = 1; i <= 100; i++) {
      sum += i;
      if (i == 50) {
        break;
      }      
     }
    System.out.println(sum);    
  }
}

for each : for문을 조금 다른 형태로 쓰는 것 (for와 같은 것으로 봄)

public class Main {
  public static void main(String[] args) {    

    String[] number = {"one","two","three"};
    //for(int i = 0; i < number.length ; i++) {System.out.println(number[i]);}
    //for구문 버전
    
    //for each 구문 버전
    for(String num: number){//number 배열로부터 하나씩 꺼냄 - 개수 셀 필요 x 증강문 필요 x
      System.out.println(num);  
    }
  }
}

삼항연산자 : if구문 없이 조건문을 만듬

if구문 버전
public class Main {
  public static void main(String[] args) {

    if (5 > 4) {
      System.out.println(50);
    }else {
      System.out.println(40);
    }    
  }
}
if구문 없이 조건문 -> 삼항연산자 
( (조건) ? true일때출력값 : false일때출력값);

*/
public class Main {
  public static void main(String[] args) {

    System.out.println( (5>4) ? 50 : 40);
  }
}