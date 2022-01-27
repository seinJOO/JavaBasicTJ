package Java20211213;
public class VariableExam {
    /* 변수의 영향 범위
    
    전역변수와 지역변수
    
    */

    public void varTest(int a) { //매서드 안에서 선언된 a는 다른 클래스에서 선언된 a와는 다름 
        a++;                     //-> 매서드 안에서 선언된 a는 지역변수
    }
    public void varTest2(VariableExam testvar) { // = VariableExam 클래스에서 생성된 객체유형만 들어올 수 있다!로 제한 걸어줌
                //요렇게 해야 리턴값이 나옴
        testvar.b++;
    }

    int b; //전역변수 선언 - 전역변수의 사용은 지양해야 함!(코드가 꼬이면 찾아내기 힘듬)
    public static void main(String[] args) {
        int a = 1;
        VariableExam testvar = new VariableExam();

        testvar.varTest(a);
        System.out.println(a); //출력값 1 -> 매서드의 자료형 타입이 void이기 때문에 출력 없음!
        testvar.varTest(a); //-> varTest의 void를 int로 바꿔줬을 때 예시;;;
        System.out.println(a); // -> 매서드에서는 출력값이 나왔지만, a가 메인 안에서 선언이 되었기 때문에 값이 바뀌지 않음

        testvar.b = 1;  //객체를 이용해 리턴값 출력하기 + 전역변수 선언
        testvar.varTest2(testvar);
        System.out.println(testvar.b);
    }
}
