

/*
= : 오른쪽 값을 왼쪽에 넣기
== : 양쪽 값이 같음
!= : 양쪽 값이 같지않음


1. 맵 Map - 데이터를 key값과 value값의 쌍으로 저장하는 구조 
            (파이썬의 딕셔너리, JS의 JSON, ...)
  1) 순서(인덱스)에 의존하지 않고, 순서(인덱스) 없이 key값으로만 value값을 얻음
  2) 순서로 데이터를 가져올 필요가 있으면 LinkedHashMap TreeMap 등을 사용
    ex. key     value
        name    홍길동
        age       16
    
    import java.util.HashMap;     **Map기능 불러오기
    class Main {
      public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>(); **Map 자료형 설정

        map.put("people","사람");
        map.put("baseball","야구"); 
          1) .put(key, value) : key, value값 삽입

        System.out.println(map.get("people")); 
          2) .get(key) : key값으로 value값 추출

        System.out.println(map.containsKey("people")); 
          3) .containsKey : key값 존재 유무 확인

        System.out.println(map.size()); 
          4) .size() : map의 크기/개수 확인

        System.out.println(map.remove("people")); 
          5) .remove() : map의 항목을 삭제
      }
    }


**제어문에는 조건문(if, switch) & 반복문(for, while)이 있음**

2. 조건문 if

      if (조건) {
        true일 경우 실행
      } else {
        false일 경우 실행
      }

    예문1
      boolean money = true;

      if (money) {
        System.out.println("택시타기");
      } else {
        System.out.println("걸어가기");
      }



      or : 둘 중 하나만 만족해도 true
        | : 앞에가 true여도 조건들 모두 체크 (shift+\)
        || : 앞에가 true면 뒤에꺼는 보지 않기 -> 작동시간을 줄임
      and : 둘 다 만족해야만 true
        & : 앞에가 true여도 조건들 모두 체크
        && : 앞에가 true면 뒤 조건은 고려안함 -> 작동시간을 줄임

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

    1) if문 혼자 활용 +ArrayList
      예시 : pocket에 card가 있으면 택시탄다, 아니면 걸어간다
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

    2) 경우의 수 늘려보기 (if구문 반복 사용 - 지양하기ㅡㅡ)
      예시 : 카드는 없어도 돈이 있으면 택시탄다

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
      
      3) 경우의 수 늘려보기 (elseif를 활용) -> if를 만족하지 못한 모든 게 else로 내려옴
        예시 : 카드는 없어도 돈이 있으면 택시탄다      

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

      4) 구문의 중괄호를 누락하면 한 줄만 관계성 인식

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

      5)** 클래스 2개 생성하여 다른 클래스의 매서드 활용하기
        예시 : IfTest 매서드의 value가 3의 배수면 3이, 4의 배수면 4가 출력되도록 하기

          public class Main {
            public int IfTest(int value) {
              ->IfTest 매서드로 value값에 따른 출력값 조건 설정          
              
              int ret=0;
              if (value % 3 == 0) {
                ret = 3;
              } else if (value % 4 == 0) {
                ret = 4;
              }
              return ret;     -> if문이 끝나면 ret값을 출력함
            }

          public static void main(String[] args) {
            Main exam = new Main(); 
                -> Main 클래스의 객체 exam을 찍어내서 - Main클래스의 IfTest매서드를 쓸 수 있음

            System.out.println(exam.IfTest(6)); //출력값 3
            System.out.println(exam.IfTest(8)); // 
                -> IfTest(int value) 메서드를 호출 -> 호출하면서 값을 value에 넣음 -> 리턴값 ret 출력
            System.out.println(exam.IfTest(12)); //출력값 3
                -> if문의 3배수 구문에서 true로 판단 -> else if 구문까지 안감 -> 3 출력
          }

3. switch-case 구문 : if문과 비슷하지만 절차를 단순화하는 구문
    *break에 오면 switch 구문에서 벗어남

        예시 : month값에 알맞는 영문을 출력
        int month = 12;
        String monthString="";

        switch (month) {
          case 1: monthString = "jan";
                  break; 
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

        예시 - else if로 구현하기
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
    
    1) break 구문 오류 예시
      -break구문이 없으면 value값에 해당하는 case부터 전부 실행됨
      아래 구문 출력값 apr -> break가 없어서 case1에서 빠져나오지 못하고 break구문이 있는 case4까지 내려갔음

        public class Main {
          public static void main(String[] args) {

            int month = 1;
            String monthString="";

            switch (month) {
              case 1: monthString = "jan";
              case 2: monthString = "feb";
              case 3: monthString = "mar";
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
            System.out.println(monthString); // 출력값 apr
          }
        }

    2) 겹치는 조건과 break 단일화 - 가독성 상승
        예시 : 현재 월을 입력하여 봄 여름 가을 겨울 중 하나의 값만 출력하기

        - switch 구문 사용하기

        import java.util.Calendar;      -> 캘린더 기능 불러오기
        public class Main{
          public static void main(String[] args) {
            
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1 ; 
                                -> //month도 0부터 시작함
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

        - if구문 사용하기

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

4. 반복문 while - 조건이 참일 동안 계속 반복실행 (무한루프가 되지 않게 탈출 조건 잘 설정하기!)

        예제1 : hi 10번 출력하기

            int i = 0 ;

            while (i < 10) {
              System.out.println(i + " hi~");
              i++;
            }

        예제2 : 나무를 n번 찍었습니다 출력하고, 10번째일 때 나무 넘어간다~ 출력하기

            int i = 0;

            while(i < 10) {
              i++; // i = i + 1 ; i += 1 ;
              System.out.println("나무를 " + i + " 번 찍었습니다.");
              if (i == 10) { // 10일 때 한번 더 while문으로 올라갔다가 내려옴..?
                System.out.println("나무 넘어간다~");
              }
            }
5. break; : 반복문을 실행하다가 break를 만나면 반복문을 빠져나감

        예제2 break 활용 -> i=10일 때 출력 후 구문 탈출!

            int i = 0;

            while(true) {
              i++; 
              System.out.println("나무를 " + i + " 번 찍었습니다.");
              if (i == 10) { 
                System.out.println("나무 넘어간다~");
                break;
              }
            }
        
        예제3 : 커피를 주다가 다 떨어지면 판매 종료        

            int coffee = 10 ;
            int money = 300 ;

            while(money > 0) {
              System.out.println("커피를 드립니다");
              coffee --;        -> 한 잔 팔때마다 하나씩 감소
              System.out.println("남은 커피는 " + coffee + "잔입니다");
              if (coffee == 0) { 
                System.out.println("커피가 다 떨어졌습니다. 판매를 종료합니다.");
                break;
              }
            }

6. continue : 조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아가도록 함 
              break와 continue는 for랑도 쓰이나 while이랑 더 많이 쓰임 (while은 무한루프가 가능하기 때문에 break/continue로 제어해줌)
          
          예시1 : 1~10 중 홀수만 출력 + 과정 체크

          int i = 0 ;

          while (i < 10) {
            i++;
            if (i % 2 == 0) {
              //System.out.println("skip "+i); 
                          ↑**Tip : 이해가 안가면 변수를 출력해서 변수의 변화를 확인하기 !
              continue;       //짝수면 아래 구문을 실행하지 않고 while로 돌아감
            }
            System.out.println(i); 
          }

          예시2 : 1부터 100까지의 합 출력 + 과정 체크

              int i = 1 ;
              int total = 0;

              while (i <= 100) {
                total = total + i;      
                //System.out.println("i = "+ i + " total = "+ total); //-> 과정 체크
                i++;
              }
              System.out.println(total);

7. do~while문 : while 조건이 참일 동안 계속 반복실행함 (=while)
                무조건 한 번은 반드시 실행된다. (while은 한번도 실행이 안될 수 있음) - 잘 안씀
            do {
            }while(실행조건)

          예시1 : 키보드 입력값을 출력하고, 0이 입력되면 종료하기

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

          예시2 : 입력값을 계속 누적하되, 입력값이 100이상일 때 sum출력하여 종료시키기

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

8. for문 - 정확하게 몇 번 실행할 지 알고 있을 때 사용하는 반복문
          기본적으로 인수가 3개
               -> for(start초기문 ; stop조건문 ; step증강문) = (어디부터 ; 어디까지 ; 얼마씩)

            예시1 (1~100까지 모두 합하기) + 중간 체크

                int sum = 0 ;

                for (int i = 1; i <= 100; i++) {
                  sum += i;
                  //System.out.println("i= " + i + " sum = " + sum); ->중간체크
                }
                System.out.println(sum);

            예시2 1~100까지의 수 중 홀수들의 누적합계를 구하시오(for, if, continue 활용)
            
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

          예시3 break로 for문 빠져나가기 (1~50까지의 합)  (굳이 조건문을 100으로 건게 좀 그렇긴 하다만 ...)

              int sum = 0 ;
              for (int i = 1; i <= 100; i++) {
                sum += i;
                if (i == 50) {
                  break;
                }      
              }
              System.out.println(sum);    

9. for each : for문을 조금 다른 형태로 쓰는 것 (for와 같은 것으로 봄)


            public static void main(String[] args) {    

              String[] number = {"one","two","three"};
              
              <for구문 버전>
              for(int i = 0; i < number.length ; i++) {
                System.out.println(number[i]);
                }

              <for each 구문 버전>
              for(String num: number){
              System.out.println(num);  
              }
              -> number 배열로부터 하나씩 꺼냄 - 개수 셀 필요 x 증강문 필요 x

10. 삼항연산자 : if구문 없이 조건문을 만듬

      if구문 버전(예시)
      public class Main {
        public static void main(String[] args) {

          if (5 > 4) {
            System.out.println(50);
          }else {
            System.out.println(40);
          }    
        }
      }

      if구문 없이 조건문 -> 삼항연산자 ( (조건) ? true일때출력값 : false일때출력값);

      public class Main {
        public static void main(String[] args) {

          System.out.println( (5>4) ? 50 : 40);
        }
      }






1. 맵 기능을 활용해 key와 value값 삽입, 추출, 키값 확인, 개수 확인, 항목 삭제
2. pocket에 card가 있으면 택시탄다, 아니면 걸어간다 (ArrayList, if사용)
3. pocket에 card가 없어도 money가 있으면 택시탄다(ArrayList, if, else if 활용)
4. 예시 : main클래스의 객체 exam 사용, IfTest 매서드의 value가 3의 배수면 3이, 4의 배수면 4가 출력되도록 하기
5. month값에 알맞는 영문을 출력(switch-case/if)
6. 현재 월을 입력하여 봄 여름 가을 겨울 중 하나의 값만 출력하기(switch/if)
7. 나무를 n번 찍었습니다 출력하고, 10번째일 때 나무 넘어간다~ 출력하기(while/while+break)
8. 커피를 줄 때는 "커피를 드립니다", 남은 커피 잔수 출력, 다 떨어지면 판매 종료 (while+break)
9. 1~10 중 홀수만 출력(while+continue사용)
10. 키보드 입력값을 출력하고, 0이 입력되면 종료하기(scanner+do~while)
11. 입력값을 계속 누적하되, 입력값이 100이상일 때 sum출력하여 종료시키기(Scanner+do~while)
12. 1~100까지의 수 중 홀수들의 누적합계를 구하시오(for, if, continue)
13. 문자열의 모든 내용 출력하기 (for / for each)
14. 삼항연산자 써보기


*/

import java.util.HashMap;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<String,String>();

    map.put("people","사람");
    map.put("key","열쇠");
    map.put("korea", "한국");

    System.out.println(map.get("people"));
    System.out.println(map.containsKey("key"));
    System.out.println(map.size());
    System.out.println(map.remove("korea"));
    System.out.println(map.size());

    ArrayList<String> pocket = new ArrayList<String>();
    pocket.add("card");
    pocket.add("money");
    pocket.add("mobile phone");

    if (pocket.contains("card")) {
      
    }


  }
}

