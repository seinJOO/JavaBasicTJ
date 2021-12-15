package Java20211215;
/*******네번째 정리******/
public class CastingExam {
    public static void main(String[] args) {
        /*
    Casting 형변환 - 자료형의 타입을 일치시킨다 -> '형변환이란 변수 또는 상수의 타입을 다른 타입으로 변환하는 것'
        예) int 값과 double 값을 계산하려면 먼저 두 값을 같은 타입으로 변환한 후 계산한다.
                (타입)피연산자
            괄호()는 '캐스트 연산자''형변환 연산자''바꾸려는 연산자'
                double d = 85.4;
            (x) int score = d;
            (o) int score = (int)d; -> int score = 85

        boolean을 제외한 나머지 타입들은 서로 형변환이 가능하다.
        기본형과 참조형 간의 형변환은 불가능하다.

    정수형 간의 형변환
        1) 큰 타입에서 작은 타입으로 변환 : 값 손실 loss of data이 발생할 수 있음 (크기의 차이만큼 잘려나감)  (ex. int -> byte)
        2) 작은 타입에서 큰 타입으로 변환 : 값 손실이 발생하지 않음 (ex. byte 00001010 -> int 0000....00001010 : 빈 공간들은 0 또는 1로 채워짐)

        예1. 큰 타입을 작은 타입으로 형변환
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int]->[byte] i =%d -> b=%d%n", i, b);

        예2. 큰 타입의 큰 수를 작은 타입으로 형변환
        i = 300;
        b = (byte)i;
        System.out.printf("[int]->[byte] i =%d -> b=%d%n", i, b);

        예3. 작은 타입을 큰 타입으로 형변환
        b = 10;
        i = b; //byte가 int보다 작아서 형변환을 해주지 않아도 들어감 (i = (int)b;)
        System.out.printf("[int]->[byte] b =%d -> i=%d%n", b, i);

    실수의 형변환        

        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = f; // => double d2 = (double)f;

        System.out.println(d2); // double > float -> 형변환 없이도 들어감
        System.out.printf("d=%f%n", d2); //
        System.out.printf("d=%.2f%n", d2);
        System.out.printf("d=%10.2f%n", d2);
        System.out.printf("d=%-10.2f입니다.", d2); // 자리수 10자리로 정함

    정수와 실수 형 간의 형변환
        정수형과 실수형은 완전히 다르기 때문에 정수형간의 변환처럼 간단히 처리할 수 없음

        정수를 실수형으로 형변환 - 형변환 없이도 들어감 / 실수를 정수형으로 형변환 - 실수형이 정수형보다 크기 때문에 형변환 필수
        예1.
        int i = 91234567;
        float f = i; // float > int -> 형변환 없이도 들어감
        //int i2 = f; -> int < float -> 에러 발생
        int i2 = (int)f;

        예2.
        double d = i; // double > int
        // int i3 = d; -> int < double -> 에러 발생
        int i3 = (int)d;

    자동 형변환 : 
        1) 서로 다른 타입간에 대입이나 연산을 할 때는 형변환을 통해 일치시키는 것이 원칙
        2) 하지만, 경우에 따라 생략 가능함 - 자바가 형변환을 직접 해주는 것
            예) 소수점을 넣지 않았는데 자동으로 소수점(.0)이 출력됨 (입력한 정수를 실수로 자동 형변환)
            float f = 1234;
            System.out.println(f); // 출력값 1234.0
            
            byte b = 1234; -> 에러 발생. byte가 작아서 자동 형변환 안됨.
        3) 특히 계산식에서 자동 형변환이 많이 일어남 - 연산과정에서 자동으로 형변환이 이루어지는 것을 '산술변환'이라고 함.
            예) 산술변환 (int i가 연산과정에서 자동으로 double로 변환됨)
            int i = 3;
            double d = 1.0;
            double s = i + d;
            System.out.println(s);

        */

        

        

    }
}
