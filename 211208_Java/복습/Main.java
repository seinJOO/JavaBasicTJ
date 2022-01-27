

/* -> 블럭주석

1. 주석
  주석(commet) : 1)코드에 대한 설명
  //라인주석     2)코드의 실행을 잠시 멈추고 문제점 파악하는 용도


2. 클래스 선언 - 클래스명은 파일명과 반드시 동일해야 함!

  public class Main {
              -클래스 블록 : 소스코드의 가장 바깥쪽 블록
    public static void main(String[] args) {    <-메인 메서드
              -메서드 블록 - 기능을 정의

        -자바는 main method가 프로그램 전체의 시작점
        
        1. 접근제어자 public : 모두 접근가능
        2. static : 객체를 생성하지 않고도 사용가능
        3. void : 리턴값이 없음을 의미함 (시작이다~하고 끝남-출력값없어도됨)
        4. [] : 배열
        5. String : 문자열
        6. args : 변수들

    System.out.println("hello");
        1. ln은 출력 후 줄바꿈 기능 - 주로 넣어서 사용
        2. 명령문은 반드시 세미콜론(;)으로 구문의 끝을 나타냄
    }
  }

3. 변수

  변수 : 어떤 값을 보관하는 용도
  int a; a라는 변수명에 정수를 보관할 것이다.
  String b; b라는 변수명에 문자열을 보관할 것이다.

  - 변수명 선언 규칙 - 완전 중요~!
    1. 변수명은 숫자로 시작할 수 없음   ex.a100(O) 100a(x)
    2. _ underscore $ : 사용가능 /  @ ! .. : 사용불가
    3. 예약어는 변수명으로 사용할 수 없음. ex. int, class...
    *. 가급적 영문 소문자 사용, 한글 사용금지
    *. 변수명은 짧게, 사용 의도를 파악할 수 있도록 의미를 담아 만들기

  - 잘못된 변수명 선언 예시(자료형 변수) -> 
    1. int 2nd; 변수명은 숫자로 시작 불가
    2. String b#; 변수명은 특수문자 제한적 사용(#사용불가)
    3. int main; 예약어 사용 불가

  자료형 (type)
  int a; 변수명 a는 int 자료형 변수 - 정수만 담을 수 있음 (1,2,10,100...)
  String b; 변수명 b는 string 자료형 변수 - 문자열만 담을 수 있음 ("boy","hello world"...)

4. 숫자 자료형 (number, integer)

  - 정수 (1,10,50...)
    1. int() : 주로 사용    ex. int age = 21;
    2. long() : 조 단위 이상의 큰 숫자    
        ex. long countStar = 546656565L; -> 숫자 끝에 L을 붙임
  - 실수 (3.14, 7.8, ...)
    1. double() : 주로 사용   ex. double morePi = 3.141592;
    2. float() : 엄청 긴 실수   ex. float pi = 3.14F; -> 숫자 끝에 F를 붙임

5. 사칙연산자 + 나머지구하기

        int a = 10;
        int b = 5;
        System.out.println(a+b); //출력값 15
        System.out.println(a-b); //출력값 5
        System.out.println(a*b); //출력값 50
        System.out.println(a/b); //출력값 2
    - 나머지(구하는) 연산자 % - 홀수, 짝수, 배수 찾기 가능
        System.out.println(a%b); //출력값 0
        System.out.println(7%2); //출력값 1 = 홀수
        System.out.println(6%2); //출력값 0 = 짝수
        System.out.println(6%3); //출력값 0 = 6은 3의 배수 

6. i++, ++i

    1) ++ : 하나 증가
      i++ ; (자바) / i = i + 1 ;(기본) / i += 1; (파이썬)
      
    2) -- : 하나 감소
      j--; (자바) / j = j - 1;(기본) / j -= 1; (파이썬)

    int i = 0;
    int j = 10;

    i++;
    j--;

    System.out.println(i); //출력값 1
    System.out.println(j); //출력값 9
   
   3) i++, ++i 차이점

   int i = 0;
   System.out.println(i++); // 출력값 0 : 출력을 하고 하나 증가(후증가) - 주로 씀
   System.out.println(++i); // 출력값 1 : 하나를 증가하고 출력 (선증가)   

7. 클래스/매서드

  - 클래스
    1. 자바는 클래스 기반, 클래스 단위로 프로그램 구성
    2. 클래스는 객체를 찍어내는 용도
    3. 클래스명은 명사로 만듬
    4. 여러개의 단어로 만들경우 각 단어의 첫 문자는 대문자로 구성
        ex. class ImageSprite {}; Class Raster {}
    
  - 매서드 (함수와 같은 기능, 함수라고는 안함ㅋㅋ)
    1. 하나의 클래스 안에는 매서드가 여러개 존재
    2. 매서드명은 주로 동사로 만듬
    3. 여러개의 단어로 만들경우 처음 시작하는 문자는 소문자로 시작하고, 
       두번째 단어부터는 대문자를 사용 ex. run{}; runFaster{}; getBackGround{}
    *. 매서드도 짧게, 의미를 담아서 만들기


8. String 문자열

    1. 원칙은 객체 생성 후 사용 - 생성자 new
      String a = new String("Hello");         
    2. 자바에서의 String은 특별히 객체 생성 없이 변수에 문자열 간단히 정의
      String a = "Hello";

9. 문자열에서 많이 사용되는 매서드

    1) equals() : 두개의 문자열이 동일한지 비교하여 결과 리턴
                  ex. SHA256으로 암호화되어 비밀번호가 DB에 저장되나 복호화는 안됨
                       -> equals() 매서드로 일치 여부 확인
          class Main {
            public static void main(String[] args) {
              String a = "hello";
              String b = "java";
              String c = "hello";

              System.out.println(a.equals(b));
              System.out.println(a.equals(c));
            }
          }

    2) indexOf() : 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
                  0에서 시작, 빈칸도 글자로 인식, 이하보다는 "미만" 표현을 많이 씀
                  ex. 서울시 강남구, 서울시 서초구, 서울시 송파구...에서 활용가능
          class Main {
            public static void main(String[] args) {
            String a = "Hello World";

            System.out.println(a.indexOf("World"));
            }
          }

    3) replaceAll : 문자열 중 특정 문자열을 다른 문자열로 치환
          class Main {
            public static void main(String[] args) {
              String a = "Hello World !";    
              System.out.println(a.replaceAll("World","Java"));  
            }
          }
    4) substring : 문자열 중 특정 부분을 뽑아낼 경우 사용
          string(n,m) - n부터(?) m미만 -> 끝 위치는 포함하지 않음

            class Main {
              public static void main(String[] args) {
                String a = "Hello World";
                System.out.println(a.substring(1,4));
              }
            } // 출력값 ell
    5) toUpperCase : 모든 문자열을 대문자로 변경 / toLowerCase : 소문자로 변경
            class Main {
            public static void main(String[] args) {
              String a = "Hello World";
              System.out.println(a.toUpperCase());

            }
          }  
    6) Bool (불 Boolean) 
        - true(1 / 0이 아닌 모든 것), false(0) 밖에 없지만 아주 중요해서 자주 쓰임
            class Main {
              public static void main(String[] args) {
                int base = 100;
                int height = 95;
                boolean isTall = height > base; //=true

                if (isTall) { //true면 실행
                  System.out.println("키가 큽니다");
                }
              }
            }
    7) char : 문자(한 글자 - String으로 대체 가능)
            class Main {
              public static void main(String[] args) {
                char a= 'a';   //따옴표 한개!!!
                char b= 122;   //ascII코드로 나옴 (97 = a)

                System.out.println(a);
                System.out.println(b); //숫자지만 코드값으로 자동 변환되어 출력됨
              }
            }

10. 실제로 많이 쓰이는 자료형
    1) 배열 array : 여러개의 원소를 한번에 담는 자료형 - 자료의 집합
                    배열은 한번 생성하면 길이가 고정되어 수정 불가
      - 배열 선언
      1. 1개만 저장
        int engScoreKim = 90;
      2. 한번에 여러개 저장
        int[] engScore = {80,90,70,65,100};
        String[] names = {"kim","park","son","lee"}
      - 배열 선언 예시
          class Main {
            public static void main(String[] args) {
              String[] weeks = new String[7]; 
                    -> 배열 정의 - 배열 이름, 길이 지정해주기
              
              weeks[0] = "월";
              weeks[1] = "화";
              weeks[2] = "수";
              weeks[3] = "목";
              weeks[4] = "금";
              weeks[5] = "토";
              weeks[6] = "일";    -> 배열 길이 먼저 지정해주고 하나씩 값 넣기
           -------------------------------------------------------------------             
           String[] weeks = {"월","화","수","목","금","토","일"}; 
                    -> 배열 길이와 값 함께 넣기

              System.out.println(weeks[3]); 
                    -> 인덱스로 접근! weeks배열값 중 인덱스 3인 값 출력하기

              System.out.println(weeks[7]); 
              -> ArrayIndex(인덱스)OutOfBoundsException(예외) 
                    - 인덱스가 없는 위치를 지정했을 때 발생하는 오류
            }
          }
11. 반복문 (굳이 구분하자면)
    1) for - 정확히 n번 반복할 때 씀
          for (int i = 0; i < weeks.length; i++) {
          System.out.println(weeks[i]);
        } //출력값 월화수목금토일
    2) while - 조건에 부합할 때까지 n번 반복
    3) do~while
    
12. 리스트 List : 배열과 비슷한 자료형이나, 크기가 정해지지 않고 동적으로 변함

    - ArrayList : 배열을 무리없이 재할당, 추가 삭제시 요소 이동 구현 없이 사용 가능
                객체 배열을 좀 더 효율적으로 관리할 수 있도록 자바에서 제공하는 클래스

  
      import java.util.ArrayList; // -> 자바에서 제공하는 ArrayList 클래스 불러오기

      public class Main {
        public static void main(String[] args) {

          ArrayList pitches = new ArrayList(); //= pitches라는 객체를 새로 생성!

          pitches.add("123");
          pitches.add("234");
          pitches.add("789");

          pitches.add(0,"133");
      0) .add() 메소드를 이용하여 순차적 혹은 특정 인덱스에 값 입력
      1) System.out.println(pitches.get(1));
          .get()메소드를 이용하여 특정 인덱스 값을 추출

      2) System.out.println(pitches.size());
          .size()메소드를 이용하여 리스트의 개수를 확인

      3) System.out.println(pitches.contains("234"));
          .contains()메소드를 이용하여 포함 여부 확인

      4) System.out.println(pitches.remove("789"));
          .remove()메소드를 이용하여 해당 객체 삭제하고 결과를 리턴(실행했으면 true)

      5)  System.out.println(pitches.remove(0));
          .remove()메소드를 이용하여 특정 인덱스의 객체를 삭제
        }
      }

13. Generics : 입력되는 객체의 자료형을 강제함 - 자료형 불일치로 인한 오류 방지
                실제로는 경고창때문에 억지로 씀 ㅋㅋ 큰 의미 없음

      ArrayList<String> pitches = new ArrayList<String>();
      ↑ pitches라는 ArrayList에 담을 수 있는 자료형을 String 으로 제한


      import java.util.ArrayList;

      public class Main {
        public static void main(String[] args) {

          Generics를 안쓸 때
          ArrayList aList = new ArrayList();
          aList.add("hello"); //문자가 아닌 객체로 들어감
          aList.add("java");

          String hello = (String)aList.get(0); 
          String java = (String)aList.get(1);
          //String hello는 자료형이 String
            -> Casting = 강제 형변환
              객체를 문자로 넣을수 없기 때문에 객체를 String으로 변환해서 강제로 넣음
              

          System.out.println(hello);
          System.out.println(java);
          

          ArrayList<String> aList = new ArrayList<String>();
          aList.add("hello");
          aList.add("java");

          String hello = aList.get(0);
          String java = aList.get(1);
          제네릭스를 사용하여 자료형을 선언하면
          그 이후로는 자료형에 대한 형변화 casting이 필요 없음 !
          이미 자바가 aList에는 반드시 String자료형만 추가된다는 것을 알고 있기 때문.
          제네릭스를 사용하면 형변환에 대한 불필요한 코딩과 잘못된 형변환등의 예외를 방지할 수 있다.

          System.out.println(hello);
          System.out.println(java);



        }
      }


연습문제

1. 클래스를 선언하시오
2. a라는 문자열 객체를 생성하시오 (1. 원칙 2.간단히)
3. a객체("hello")와 b객체("world")의 문자열이 동일한지 비교하여 결과를 출력하시오
4. a객체에서 "e"가 시작되는 위치를 출력하시오
5. b객체 중 world를 java로 치환하시오
6. a객체에서 두번째부터 네번째 위치의 문자열을 출력하시오
7. b객체의 문자열을 대문자로 변환하여 출력하시오
8. 정수형 객체 height가 base보다 큰 경우를 isTall 클래스로 두어 참일 경우 "키가 큽니다"를 출력하시오 (if문, boolean 사용)
9. 아스키코드 97을 입력하여 c를 출력하시오(char사용)
10. 김씨의 영어점수를 정수배열에 저장하시오
11. 반 전체 5명의 영어점수를 engScore배열에 저장하시오
12. 해당 점수를 가진 사람의 성을 names배열에 차례로 저장하시오
13. weeks배열의 길이를 지정 후 하나씩 요일값을 넣으시오
14. weeks배열의 길이와 값을 함께 넣고, "목"을 출력하시오
15. weeks배열의 값을 모두 출력하시오 (for문, i++ 사용)
16. ArrayList로 pitches객체 리스트를 생성하고, 임의로 3가지 객체를 넣으시오("123","234","789")
17. pitches 리스트의 첫번째에 "133"을 추가하시오
18. pitches 리스트 중 두번째 객체를 추출하시오
19. pitches 리스트의 개수를 출력하시오
20. pitches 리스트 내에 "234"가 포함되었는지 확인하시오
21. pitches 리스트의 "789"를 삭제하고 결과를 출력하시오
22. pitches 리스트의 첫번째 객체를 삭제하시오
23. ArrayList로 aList 객체 리스트를 생성하고(hello/java), 각 객체를 문자열 자료형으로 Casting 하시오
24. Generics를 활용하여 ArrayList로 문자열 자료형 aList를 생성하고(hello/java), 각 객체를 문자열 자료형으로 선언하시오
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    String a = new String("hello");
    String b = "world";

    System.out.println(a.equals(b));
    System.out.println(a.indexOf("e"));
    System.out.println(b.replaceAll("world", "java"));
    System.out.println(b.toUpperCase());

    int base = 100;
    int height = 180;
    boolean isTall = height > base;
    if (isTall) {
      System.out.println("키가 큽니다");
    }

    char c = 97;
    System.out.println(c);

    int engScoreKim = 85;
    int[] engScore = {85, 95, 70, 100};
    String[] names = {"kim", "lee", "yoon", "joo"};

    // String[] weeks = new String[7];
    // weeks[0] = "월"; weeks[1] = "화"; weeks[2] = "수" ; weeks[3] = "목" ; weeks[4]="금";weeks[5]="토";weeks[6]="일";
    // System.out.println(weeks[3]);

    String[] weeks = {"월","화","수","목","금","토","일"};
    System.out.println(weeks[3]);

    for (int i=0; i < weeks.length; i++) {
      System.out.print(weeks[i]);
    }

    ArrayList pitches = new ArrayList();
    pitches.add("123"); pitches.add("234"); pitches.add("789");

    pitches.add(0,"133");
    System.out.println(pitches.get(1));
    System.out.println(pitches.size());
    System.out.println(pitches.contains("234"));
    System.out.println(pitches.remove("789"));
    System.out.println(pitches.remove(0));

    // ArrayList aList = new ArrayList();
    // aList.add("hello");
    // aList.add("java");

    // String hello = (String)aList.get(0);
    // String java = (String)aList.get(1);
    // System.out.println(hello);

    ArrayList<String> aList = new ArrayList<String>();  //요거 왜 오류가 생기는쥐?
    aList.add(999) ; 
    aList.add("java");
    String hello = aList.get(0);
    System.out.println(hello);

  }
}




















/*
1. 알쥬??
2. String a = new String("") / String a = ""
3. a.equals(b)
4. a.indexOf("e")
5. a.replaceAll("world","java")
6. a.substring(1,4)
7. a.toUpperCase()
8.
int base = 100;
int height = 95;
boolean isTall = height > base; 
if (isTall) {
System.out.println("키가 큽니다");
}
9. char b = 97; pringln(b)
10. int engScoreKim = 90;
11. int[] engScore = {80,90,70,65,100};
12. String[] names = {"kim","park","son","lee"}
13.
String[] weeks = new String[7]; 
weeks[0] = "월";
weeks[1] = "화";
weeks[2] = "수";
weeks[3] = "목";
weeks[4] = "금";
weeks[5] = "토";
weeks[6] = "일";
14.
String[] weeks = {"월","화","수","목","금","토","일"}; 
System.out.println(weeks[3]); 
15.
for (int i = 0; i < weeks.length; i++) {
System.out.println(weeks[i]);
}
16.import java.util.ArrayList;(클래스 밖에)
ArrayList pitches = new ArrayList();
pitches.add("123"); ...
17. pitches.add(0,"133");
18. pitches.get(1)
19. pitches.size()
20. pitches.contains("234")
21. pitches.remove("789")
22. pitches.remove(0)
23.
ArrayList aList = new ArrayList();
aList.add("hello");
aList.add("java");
String hello = (String)aList.get(0); 
String java = (String)aList.get(1);
System.out.println(hello);
System.out.println(java);
24.
ArrayList<String> aList = new ArrayList<String>();
aList.add("hello");
aList.add("java");
String hello = aList.get(0);
String java = aList.get(1);




*/

