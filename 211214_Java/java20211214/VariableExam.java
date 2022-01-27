package java20211214;
public class VariableExam {
    static int globalScope = 10 ;
    //전역변수(global variable) 클래스 블록 안에서 선언, 변수의 사용 범위는 클래스 전체
    static int staticVal = 7;

    public void scopeTest(int value) {
        int localScope = 20;
        //지역변수(local variable) - 매서드 안에서 선언, 변수의 사용 범위는 그 매서드로 제한
    
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
        //static 변수는 static을 선언하지 않은 매서드 내에서는 사용해도 문제가 되지 않음.

    }
    public static void main(String[] args) {
        
        

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
        System.out.println(StaticVal);
    }
}