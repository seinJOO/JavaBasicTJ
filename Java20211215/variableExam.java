package Java20211215;
/*****첫번째 정리*****/
public class variableExam{

public static void main(String[] args) {
    
    /*   Variable(변수)란?
      *       : 단 하나의 값을 저장 할 수 있는 메모리 공간
      *       : 변수를 사용하기 위해서는 초기화를 해야 한다.
      *          ex) int age; (변수타입 변수이름;)  -> age라는 이름의 변수를 선언
      *       : 변수이름 - 메모리공간에 이름을 붙임. 같은 이름은 존재 할 수 없다.
      *       : 변수타입 - 변수에 저장 된  값의 종류를 저장하는 것. 정수int/실수double/문자String/....
      *          
      *          ex) int age = 25;      //변수 age를 선언하고 25로 초기화 한다.
      *             
      *             int a;
      *             int b;      -> int a,b;   //같은 변수는 같이 선언 할 수 있다.
      * 
      *             int x = 0;
      *             int y = 0;   -> int x =0 , y = 0;
      *       : 변수를 사용하기 전에 적절한 값(0, 1, "")로 초기화를 한다.
      *    변수의 초기화란?
      *       : 변수를 사용하기 전에 처음으로 값을 정하는 것을 말한다.
      
     
     두 변수의 값 교환 - 불행 편
     int x = 10;
     int y = 20;
	      
	      System.out.println("x = "+x);
	      System.out.println("y = "+y);
	      
	      x= y;//x20 y20
	      y= x;//x20 y20 
	      System.out.println(x);
	      System.out.println(y);

    두 변수의 값 교환 - 임시로 값을 담을 변수를 선언해서 바꿔주기
     
     int x = 10; int y = 20;
     int temp;//임시변수
     temp = x;   //temp 10    x10      y20
     x = y;      //temp 10    x20      y20
     y = temp;   //temp 10    x20    y10
     
     System.out.println("x = "+x);
     System.out.println("y = "+y);
     
     파이썬에서의 두변수 값 교환  x,y = y,x
     
     
     
     
      * int year = 0; int age = 15; 
      * System.out.println(year);
      * System.out.println(age);
      * 
      * year = age + 2000; //15 + 2000 -> 2015 year 
      * age = age + 1; //15 + 1 -> 16 age
      * 
      * System.out.println(year); System.out.println(age);
     


변수 선언 규칙 :

1. 대소문자를 구분하며 길이에는 제한이 없다.
2. 예약어를 사용할 수 없다.
3. 숫자로 시작할 수 없다. (top10 가능, 10top 불가능)
4. 특수문자 '_', '$'만 허용한다. (@!#%^& 불가능)
*. 클래스명의 첫글자는 항상 대문자로 시작을 권장
*. 변수명과 매서드명의 첫글자는 항상 소문자로 시작을 권장
*. 여러 단어를 사용할 때는 단어의 첫글자는 대문자 사용 권장
*. 상수 이름은 전부 대문자 사용을 권장
*. 변수명은 의미를 담아서 만드는 걸 권장
int curPos = 0; -> 현재위치 current position
int lastPos = -1; -> 마지막위치 last position

변수 타입 :
주로 사용하는 값은 크게 문자와 숫자. 숫자에는 정수 실수...
값(data)의 종류(type)에 따라 저장될 공간의 크기와 형식을 정하는 것이 자료형

자료형에는 크게 기본형, 참조형

기본형(primitive type) - 실제 값을 저장, 총 8개
    -> 논리 boolean, 문자 char, 정수 int (long byte short) 실수 double float
참조형(reference type) - 실제 값이 저장되어 있는 주소값을 갖는다.
    -> 기본형을 제외한 모든 나머지

기본형(primitive type)
    1) 논리형 boolean : true or false -> 조건식, 논리 계산 등에 사용
    2) 문자형 char : 변수 하나에 한 글자만 저장, 실제로는 숫자 정수로 값을 저장하여 아스키코드로 변환하여 보여줌
    3) 정수형 int long (+byte short) : 정수, 주로 int가 사용됨
    4) 실수형 double float : 실수를 저장. 주로 double이 사용됨

    int -2,147,483,648 ~ 2,147,483,647 / long -9,223,372,036,845,775,808 ~ 9,223,372,036,845,775,808

    *상수
    1) 변수와 마찬가지로 값을 저장할 수 있는 공간 변수와는 달리, 한번 값을 저장하면 변경하지 않고 사용함.
    2) 선언하는 방법도 변수와 동일하지만 final을 붙여서 상수로 사용함
        final int MAX_SPEED = 100; // MAX_SPEED는 상수로 선언되어 값 변경 불가함
    3) 관습적으로 상수는 *대문자*로 모든 상수명을 표기함
    4) 상수 선언은 반드시 선언과 동시에 초기화해야만 함
        final int MIN_SPEED; (X)
        MIN_SPEED = 30; (X) 상수의 값은 변경할 수 없음 - final붙여야함

    자료형이 다른 경우 에러 발생 예시
    1. 에러X
    int i = 'A'; -> 문자 A의 코드값이 저장됨
    long l = 123; -> int의 크기보다 long의 크기가 더 큼
    double d = 3.14f; -> double의 크기는 float보다 큼
    2. 에러O
    float f = 3.14; -> 에러 발생 ! 무조건 double은 float에 넣을 수 없음(크기와 상관 없이)
    int i = 432656322665674645467865468786L; -> 에러 발생! long이 int보다 큼

    변수와 함께 자주 사용되는 printf() - f=form : 출력 형태를 잡아줄 수 있음(자동 줄바꿈 안됨)
        %d : decimal(10진수=숫자 출력) / %s : String(문자열 출력) / %f : 실수 출력 / %c = 문자 출력 / %n = 줄바꿈 (\n도 사용 가능)
        println() : 변수값을 그대로 출력하므로 다른 형태로 출력하기가 힘듬 (ex. 소수 2자리까지만 출력 -> 처리 후 그대로 출력해야함)    

    1)
    int age = 14;
    int year = 2021;
    System.out.printf("age:%d", age);
    System.out.printf("age:%d%n year:%d", age, year); -> 한줄에 처리 가능, age:%d 출력 후 줄바꿈
    2)

    String url = "www.naver.com";
    float f1 = .10f;
    float f2 = 3.14e3f; // e = extension
    double d = 1.23456789;

    System.out.printf("f1 : %f ", f1);
    System.out.printf("f2 : %f ", f2);
    System.out.printf("d : %10.2f ", d); //소수점을 기준으로 "전체 자리수 지정.소수점 뒷자리수 지정" -> 총 14자리, 소수점 뒤에는 2자리까지 출력, 자동 오른쪽 정렬
    System.out.printf("Address : %s%n", url);
    System.out.printf("%10.8s%n", url); //".글자수지정"
    System.out.printf("%-10.8s%n", url); // 기본은 오른쪽정렬, -를 앞에 붙이면 왼쪽정렬
 */

    }
}