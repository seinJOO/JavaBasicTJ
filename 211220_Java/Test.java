package Java20211220;

import java.util.*;
public class Test {

    public static void main(String[] args) {
        
    
/* 화요일 시험 준비 !!!

    키워드 : 패키지, 클래스(파일), ~일때 조건을 만족하므로 ~출력 , 산술 연산, 결합 연산, 프롬프트, 콘솔

    Java20211220.Test
패키지는 여러개가 있을 수 있고 하나의 패키지 내에는 자바 클래스파일을 여러개 가질 수 있다
Java20211220패키지 아래에 Test라는 클래스가 위치하고 있다.

- 자바에서의 데이터 종류

논리형 boolean : true와 false 값을 가짐
정수형 : int long short byte
실수형 : double float
문자 : String char

- 코드 동작 설명 작성 방법

예시1) 동작 과정 설명
for (int i = 0; i <= 3 ; i++) {
    System.out.println(i);
} 
i = 0일때, i가 조건 3보다 작거나 같음을 만족하므로 i값 0을 출력
i = 1일 때, i가 조건 3보다 작거나 같음을 만족하므로 i값 1을 출력
i = 2일 때, i가 조건 3보다 작거나 같음을 만족하므로 i값 2를 출력
i = 3일 때, i가 조건 3보다 작거나 같음을 만족하므로 i값 3을 출력
i = 4일 때, i가 조건 3보다 작거나 같음을 만족하지 못하므로 for문을 종료

2. 출력값 기재
0
1
2
3

    -배열 동작 설명 작성 방법

    int[] n1 = new int[5]; 
        == n1 = {0,0,0,0,0}; // 값을 지정해주지 않으면 0으로 출력
        == length(5)

    int[][] n2 = new int[2][2];
        == n2 = {{0,0},
                {0,0}};
        == length(2); //이차원 배열은 길이 = 배열의 개수
                        int[][][] n3 = new int[2][2][2];==length(3);

    int[] n3 = {1,2,3};
        == n3 = {1,2,3};
        == length(3);
예시2)
int x = 100;
int y = 200;
int z = x + y;

메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 "산술 연산"을 하여 다시 메모리에 저장한다.
z는 x와 y의 합일 때, x는 100이고 y는 200이므로 z는 300을 출력
300

예시3)
int age = 23;
String name = "kim";
String a = name + "의 나이는" + age;

메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 "결합 연산"을 하여 다시 메모리에 저장한다

Scanner sc = new Scanner(System.in);
System.out.println("이름을 입력하세요>>");
String name = sc.next();
System.out.println("나이를 입력하세요>>");
int age = sc.nextInt();

1. 화면에 사용자로 하여금 이름을 입력하도록 "프롬프트"를 출력한다.
2. 사용자가 콘솔에서 문자열로 입력한 값을 name변수에 저장한다.
3. 화면에 사용자로 하여금 나이를 입력하도록 프롬프트를 출력한다.
4. 사용자가 콘솔에서 문자열로 입력한 값을 정수로 변경하여 age 변수에 저장한다.

String h = "안녕하세요";    //한글은 1글자가 2byte
// 10byte(String) + 10byte(char) = 20 byte

int n = Integer.parseInt("100"); // 문자열, 정수
Scanner sc = new Scanner(System.in); // 키보드, 콘솔, 생성
Random r = new Random(10); // 랜덤, 생성

1. 문자열 "100"을 정수 100으로 변환하여 변수 n에 저장한다.
2. 키보드 입력을 콘솔을 통해 받을 수 있는 Scanner객체 sc를 생성한다.
3. 시드 값 10으로 랜덤값을 생성할 수 있는 객체 r을 생성한다.

-----------------------
당신의 정보를 입력하세요
-----------------------

당신의 부서는 >>>
당신의 소속은 _____입니다.
당신의 나이는 >>> 50
당신의 작년 나이는 _49_이였습니다.
당신의 키는 >>>
당신은 키가 (크다(180이상)/보통이다(170이상)/작다(나머지)) 
*/

Scanner sc = new Scanner(System.in);
System.out.print("당신의 부서는 >>>");
String dept = sc.next();
System.out.printf("당신의 소속은 %s입니다.\n", dept);
System.out.print("당신의 나이는 >>>");
int age = sc.nextInt();
System.out.printf("당신의 작년 나이는 %d이였습니다.\n", age - 1);
System.out.print("당신의 키는 >>>");
int height = sc.nextInt();
if (height >= 180) {
    System.out.println("당신은 키가 크다");
}else if (height >= 170) {
    System.out.println("당신은 키가 보통이다");
} else System.out.println("당신은 키가 작다");


}
}