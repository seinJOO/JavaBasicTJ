package Java20211220;

public class ArrayExam {
    public static void main(String[] args) {
  /* 
array배열 - 같은 타입의 여러 변수들을 하나의 묶음으로 다루는 방식
            배열은 생성 시 정한 갯수를 수정할 수 없다

            //list의 경우 파이썬에서 가장 많이 사용하며, 여러 자료형을 모두 담을 수 있음
            //=> 오류 발생 확률이 높아짐
    
    int[] score = new int[5]; -> 각 방의 초기값은 0
    String[] name = new String[5]; -> 각 방의 초기값은 null

        int[] math = new int[5];
        for (int i = 0 ; i < math.length ; i++) {
            math[i] = i * 10 + 50 ;
            System.out.println(math[i]);
        }

        for (int i = 0 ; i < score.length ; i++) { //for each 구문 -> for(int i:score) 로 써도됨
        System.out.println(score[i]);
        }

배열의 길이를 수정하는 법
    1. 더 큰 배열을 새로 생성한다.
    2. 기존 배열의 데이터들을 새로 생성한 배열로 복사한다.
    3. 기존의 배열에 새로 생성한 배열을 그대로 넣어준다.
    
    배열 수정 예제 1) 더 넓은 배열 생성하여 집어넣기
        int[] arr = new int[5];

            System.out.println("배열 수정 전");
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = i + 1;
                System.out.println("arr[" + i + "] : " + arr[i]);
            }

            System.out.println("배열 수정 후");
            int[] temp = new int[arr.length*2];     //기존 배열 개수의 2배로 만들기

            for (int i = 0; i < arr.length ; i++) {
                temp[i] = arr[i];
            }
            for (int i = 0; i < temp.length ; i++) {
                System.out.println("temp[" + i + "] : " + temp[i]);
            }
            System.out.println("arr배열 수정 후");
            arr = temp;
            for (int i = 0; i < arr.length ; i++) {
                System.out.println("arr[" + i + "] : " + arr[i]);
            }
    배열 수정 예제 2) 2개의 배열을 붙여서 하나의 배열로 만들기
    System.arraycopy 사용 !!! System.arraycopy(값이 있는 배열의, 인덱스x부터, 넣게 될 배열의, 인덱스y부터, 몇개를 넣기) ~~!!

        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9',};
        System.out.println(abc);    // 출력값 ABCD
        System.out.println(num);    // 출력값 0123456789

        char[] result = new char[abc.length + num.length];

        System.arraycopy(abc, 0, result, 0, abc.length);
        System.out.println(result); // 출력값 ABCD

        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result); // 출력값 ABCD0123456789

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num); // 출력값 012345ABC9

    예제 3) 학생 5명의 총 합계 점수와 평균을 구하시오
        int[] score = {100,88,98,90,96};
        int total = 0;
        for (int item: score) {     //for each 구문 -> 배열 요소를 하나씩 item에 담기
            total += item;
        }
        double avg = total / (double)score.length;      //**형변환 해주기
        System.out.println("총점 : "+ total);
        System.out.println("평균 : "+ avg);
    
    예제 4) 배열 내에서 최대값 최소값 구하기
        int[] scores = {78,88,98,90,96,67,65,87};
        int max = scores[0];
        int min = scores[0];

        for (int item : scores) {
            if (item > max) {
                max = item;
            }else if (item < min) {
                min = item;
            }
        }
        System.out.println("최대값 : "+ max);
        System.out.println("최소값 : "+ min);
        
    예제 5) 배열 뒤집기 
     
        int[] score = {78,88,98,90,96,67,65,87};
        int[] temp = new int[score.length];           

        for (int i = 0 ; i < score.length ; i++) {
            temp[i] = score[score.length -1 - i];
        }
        score = temp;       //강제로 넣어버리기~~

        for (int item : score) {        //강제로 넣어서 score 바로 출력하면 이상해짐
            System.out.print(item + " ");
        }
        */ 
    }
}
