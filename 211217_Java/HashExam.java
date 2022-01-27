/*
    해시 탐색법- 데이터를 저장할 때 미리 데이터의 내용과 저장소의 요소를 연계하여
                짧은 시간 안에 탐색할 수 있도록 고안된 알고리즘.
                ex. 15번 공-> 15번방에 저장 ... => 즉각적으로 찾기 가능
                데이터 보관 단계에서 사전 준비를 함!

   예시1) 칸이 7개가 있다 -> 어떤 숫자든 7로 나누면 나머지가 0부터 6까지 발생 가능
            => 각각의 번호를 7로 나누었을 때 나머지값과 같은 번호의 방에 넣기
    
        - 7개의 요소가 있는 배열 A를 정렬하기
        1. 11개 크기(index 0 ~ 11)의 별도의 배열 B를 생성하기 
            (ㄴ약 1.5 ~ 2배 크기- 나머지 계산으로 흩어져서 들어갈 수 있게)
        2. B의 모든 배열의 요소를 0으로 초기화하기
        3. 해시값(나머지)을 계산하여 변수 k에 대입
        4. 저장할 요소(B[k])에 먼저 저장된 값이 없는지(=0인지) 확인
        5. 먼저 저장된 값이 없으면 해당 요소에 데이터 대입
        6. 이미 저장되어 있으면(=충돌) 그 옆 요소에 저장
        7. 요소값k가 10을 넘으면 0으로 다시 돌아와 빈 요소 찾기
*/
import java.util.*;
public class HashExam {

    public static void main(String[] args) {
        int[] arrA = {7,2,11,18,27,13,15};
        int[] arrB = new int[10];

        for (int i = 0; i < arrB.length ; i++ ) {
            arrB[i] = 0;
        }
        
        int t = 0;

        while (t < arrA.length) {
            int k = arrA[t] % 11 ;         
            if (arrB[k] == 0) {
                arrB[k] = arrA[t];
                t++;
            }else if (arrB[t] != 0) {
                k = (k + 1) % 11;
            }else
        } 
        
        for (int j = 0; j < arrB.length ; j++){
        System.out.println(arrB[j]);
        }
        
    }
    
}
