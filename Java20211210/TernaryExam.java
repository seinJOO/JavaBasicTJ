package Java20211210;
public class TernaryExam {
    public static void main(String[] args) {
        
        // int b1 = (5 > 4) ? 50 : 40;
        // System.out.println(b1);

        int b1 = 0; //전역변수 선언

        if (5 > 4) {
            b1 = 50;
        }else {
            b1 = 40;
        }
        System.out.println(b1);

        if (3 > 4) { //지역변수 선언
            int a = 50;
            System.out.println(a);
        }else {
            int a = 40;
            System.out.println(a);
        }
    }

    /* Variable 
    1) local variable : 지역변수 - 해당 지역의 코드에서만 영향을 미치는 변수 -> 중괄호 안에서 선언한 경우
    2) global variable : 전역변수 - 전체 모든 코드에서 사용할 수 있음

    */
}
