package Java20211215;
/*******세번째 정리******/
public class IntExam {

    public static void main(String[] args) {
        
   
    /*
    정수형 byte < short < * int * < long
            1       2       4       8   ->각각 2배씩 증가

    오버플로우(overflow)
    작은 자료형의 값을 큰 자료형으로는 넣을 수 있지만, 큰 자료형 값을 작은 자료형에는 넣을 수 없음

    
    */

    short sMin =  -32768;
    short sMax = 32767;

    System.out.println("sMin : "+ sMin);
    System.out.println("sMax :"+ sMax);
}
}
