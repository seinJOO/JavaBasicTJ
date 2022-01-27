
/* -1-
// 주석comment : 코드에 대한 설명 = 컴퓨터는 읽지 않음
// (=라인 주석)  코드의 실행을 잠시 멈추고 문제점 파악하는 용도로도 사용
  모든 언어의 주석은 열심히 달기~! (블럭주석=)*/

/*-2-
// 자바는 클래스 기반, 클래스 단위로 프로그램을 구성함 - 모든게 class안에서 만들어짐 (객체를 찍어내는 게 클래스)
// 클래스 선언 - 클래스명은 파일명과 반드시 동일해야 함 !
class Main { //클래스 블록 : 소스 코드의 가장 바깥쪽 블록 - 모든 게 class 안에 있음
  
  public static void main(String[] args) { //메서드(함수) 블록 - 기능을 정의 (자바에서는 함수X 메서드라고만 씀)
    //↑자바는 main method가 프로그램 전체의 시작점
    // 접근제어자 public:모두 접근가능
    // static - 객체를 생성하지 않고도 사용가능
    // void 리턴값이 없음을 의미함. 시작이다~하고 끝남 ㅋㅋ
    // [] : 배열   String :문자열    args : 변수들
    System.out.println("Hello world !"); //ln은 출력 후 줄바꿈 기능 - 넣을 때가 더 많음
    // 명령문은 반드시 세미콜론(;)으로 구문의 끝을 나타냄. <대문자, 맨끝 세미콜론 주의~!>
  } 

} */

/* -3-
변수 : 어떤 값을 보관하는 용도
int a; a라는 변수명에 정수를 보관할 것이다.
String b; b라는 변수명에 문자열을 보관할 것이다.

변수명 선언 규칙 - 완전 중요~!
1.변수명은 숫자로 시작할 수 없다. a100(O) 100a(x)
2. _ underscore $ 는 사용가능하지만 @ ! .. 사용 못함
3. 예약어는 변수명으로 사용할 수 없다. (int, class...는 안됨)

*. 한글은 사용하지 않는다. 가급적 소문자로 만든다.

잘못된 변수명 선언 예시(자료형 변수) -> 
int 2nd; 변수명은 숫자로 시작 불가
String b#; 변수명은 특수문자 제한적 사용(#사용불가)
int main; 예약어 사용 불가

자료형 (type)
int a; 변수명 a는 int 자료형 변수임으로 a라는 변수에는 정수만 담을 수 있음 (1,2,10,100...)
String b; 변수명 b는 string 자료형 변수임으로 b라는 변수에는 문자열만 담을 수 있음 ("boy","hello world"...)

-4-
클래스 - 자바는 클래스 단위로 프로그램을 구성
        클래스명은 명서로 만든다
        여러개의 단어로 만들경우 각 단어의 첫 문자는 대문자로 구성한다. 
        예) class ImageSprite {}; Class Raster {}
매서드 - 하나의 클래스 안에는 매서드가 여러개 존재할 수 있다. 매서드명은 주로 동사로 만든다.
        여러개의 단어로 만들경우 처음 시작하는 문자는 소문자로 시작하고, 두번째 단어부터는 대문자를 사용한다
        예) run{}; runFaster{}; getBackGround{}
  * 권장 사항 : 변수명은 짧지만 의미가 있게 만들기 !!!
              (변수명을 통해 사용 의도를 파악할 수 있도록)

(***<-주로 씀)
# 숫자 자료형 (number, integer)   / 정수(1,10,50...), 실수(3.14, 7.8...)
  정수 int(***) : int age = 21;
      long() : 조 단위 이상의 큰 숫자    long countStar = 5468443543546853546847646L; (숫자 끝에 L 붙임)
  실수 float() : 엄청 긴 실수       float pi = 3.14F; (숫자 끝에 F 붙임)
      double(***) : double morePi = 3.141592;
*/ 
/*-5-
    int a = 10;
    int b = 5;
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    //나머지(구하는) 연산자 % - 홀수, 짝수, 배수 찾기 가능
    System.out.println(a%b);
    System.out.println(7%2); //출력값 1 = 홀수
    System.out.println(6%2); //출력값 0 = 짝수
    System.out.println(6%3); //출력값 0 = 6은 3의 배수 */

/*-6-
class Main {
  public static void main(String[] args) {


    // int i = 0;
    // int j = 10;

    //  i++; //++:하나 증가(자바)  i = i + 1;(기본)   i += 1;(파이썬)
    //  j--; //--:하나 감소  j = j - 1;   j -= 1;

    // System.out.println(i);
    // System.out.println(j);
    // i++;   // ++i;
    // j--;  // --j;


    int i = 0;
    // System.out.println(++i); 1   // 출력값 1 : 하나를 증가하고 출력 (선증가)
    System.out.println(i++);    // 출력값 0 : 출력을 하고 하나 증가(후증가) - 가장 많이 씀
    System.out.println(i);
  
  }
}*/

/*-7-
String 문자열, 글자들 ("Hello world";"a";"12345")
String a = new String("Hello World"); 원래는 이렇게 객체 생성 후 사용하는게 원칙 
String a = "Hello World"    자바에서 String은 특별히 객체 생성 없이 변수에 문자열 간단히 정의

문자열에서 많이 사용되는 매서드
equals (***) 두개의 문자열이 동일한지 비교하여 결과 리턴
      ex. SHA256으로 암호화되어 비밀번호가 DB에 저장되나 복호화는 안됨 - 해당 매서드로 일치 여부 확인

class Main {
  public static void main(String[] args) {
    String a = "hello";
    String b = "java";
    String c = "hello";

    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }
}
*/

/* -8-
indexOf : 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
            0에서 시작, 빈칸도 글자로 인식, 이하보다는 "미만" 표현을 많이 씀
            ex. 서울시 강남구, 서울시 서초구, 서울시 송파구...에서 활용가능

class Main {
  public static void main(String[] args) {
    String a = "Hello World";

    System.out.println(a.indexOf("World"));
  }
}

replaceAll : 문자열 중 특정 문자열을 다른 문자열로 치환


class Main {
  public static void main(String[] args) {
    String a = "Hello World !";    
    System.out.println(a.replaceAll("World","Java"));  
  }
}

substring : 문자열 중 특정 부분을 뽑아낼 경우 사용
          string(n,m) - n부터(?) m미만 -> 끝 위치는 포함하지 않는다.

class Main {
  public static void main(String[] args) {
    String a = "Hello World";
    System.out.println(a.substring(1,4));
  }
}

toUpperCase : 모든 문자열을 대문자로 변경
toLowerCase : 모든 문자열을 소문자로 변경

class Main {
  public static void main(String[] args) {
    String a = "Hello World";
    System.out.println(a.toUpperCase());

  }
}
*/

/*-9-
  Bool (불 Boolean) - true(1 / 0이 아닌 모든 것), false(0) 밖에 없는데 디게 중요함 ㅋㅋ

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
  char : 문자(한 글자 - String으로 대체 가능)

class Main {
  public static void main(String[] args) {
    char a= 'a';   //따옴표 한개!!!
    char b= 122;   //ascII코드로 나옴 (97 = a)

    System.out.println(a);
    System.out.println(b); //숫자지만 코드값으로 자동 변환되어 출력됨
  }

}
*/

/*-10-
실제로 많이 쓰는 자료형
  배열 array : 여러개의 원소를 한번에 담는 자료형 - 자료의 집합
              배열은 그 길이가 고정된다. 즉, 한번 생성하면 길이를 수정할 수 없다

  int engScoreKim = 90; //1개만 저장

  int[] engScore = {80,90,70,65,100};  <-배열 선언! 여러 사람의 영어점수가 한번에 들어감
  String[] names = {"kim","park","son","lee"}

class Main {
  public static void main(String[] args) {
    String[] weeks = new String[7]; //배열 정의 - 배열 이름, 길이 지정해주기
    //배열 길이 먼저 지정해주고 하나씩 값 넣기
    weeks[0] = "월";
    weeks[1] = "화";
    weeks[2] = "수";
    weeks[3] = "목";
    weeks[4] = "금";
    weeks[5] = "토";
    weeks[6] = "일";
    
    String[] weeks = {"월","화","수","목","금","토","일"}; - 배열 길이 면서 값도 같이 넣기

    System.out.println(weeks[3]); 인덱스로 접근! weeks배열값 중 인덱스 3인 값 출력하기
    
    반복문 (for - 정확히 n번 반복할 때 씀, while - 조건에 부합할 때까지 n번 반복, do~while) - 굳이 구분을 하자면~

      for (int i = 0; i < weeks.length; i++) {
        System.out.println(weeks[i]);
      }

      System.out.println(weeks[7]); //ArrayIndex(인덱스)OutOfBoundsException(예외) - 인덱스가 없는 위치를 지정

  }
}
*/
/*-11-
  리스트 List : 배열과 비슷한 자료형이나, 크기가 정해지지 않고 동적으로 변함
              배열은 크기가 생성 시에 정해지지만, 리스트는 크기가 정해지지 않아 원하는 만큼 자유롭게 담을 수 있음
  
  ArrayList : 

  
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList pitches = new ArrayList(); //new자는 무조건ㅋㅋ 객체 생성!

    pitches.add("123");
    pitches.add("234");
    pitches.add("789");

    pitches.add(0,"133");

    System.out.println(pitches.get(1));
    //get()메소드를 이용하여 특정 인덱스 값을 추출

    System.out.println(pitches.size());
    //size()메소드를 이용하여 리스트의 개수를 확인

    System.out.println(pitches.contains("234"));
    //contains()메소드를 이용하여 포함 여부 확인

    System.out.println(pitches.remove("789"));
    //remove()메소드를 이용하여 해당 객체 삭제하고 결과를 리턴(실행했으면 true)

    System.out.println(pitches.remove(0));
    //remove()메소드를 이용하여 해당 인덱스의 객체를 삭제
  }
}
*/
/*-12-
Generics : 입력되는 객체의 자료형을 강제함.

      ArrayList<String> pitches = new ArrayList<String>();
      ↑ pitches라는 ArrayList에 담을 수 있는 자료형은 String 뿐 - 으로 제한
      실수로 값을 숫자로 넣어도 오류 없이 포함이 안됨

*/
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    /*Generics를 안쓸 때
    ArrayList aList = new ArrayList();
    aList.add("hello"); //문자가 아닌 객체로 들어감
    aList.add("java");

    String hello = (String)aList.get(0); 
    String java = (String)aList.get(1);
    //String hello는 자료형이 String
      -> 객체를 문자로 넣을수 없기 때문에 객체를 String으로 변환해서 강제로 넣음
        Casting = 강제 형변환

    System.out.println(hello);
    System.out.println(java);
    */

    ArrayList<String> aList = new ArrayList<String>();
    aList.add("hello");
    aList.add("java");

    String hello = aList.get(0);
    String java = aList.get(1);
    /*제네릭스를 사용하여 자료형을 선언하면
    그 이후로는 자료형에 대한 형변화 casting이 필요 없음 !
    이미 자바가 aList에는 반드시 String자료형만 추가된다는 것을 알고 있기 때문.
    제네릭스를 사용하면 형변환에 대한 불필요한 코딩과 잘못된 형변환등의 예외를 방지할 수 있다.*/

    System.out.println(hello);
    System.out.println(java);



  }
}













