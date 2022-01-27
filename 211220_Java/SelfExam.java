package Java20211220;
import java.util.*;
public class SelfExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
/*
        for (int i = 1 ; i <= 6 ; i++) {
            for (int j = 1 ; j <= 6 ; j++) {
                if (i + j == 6) {
                    System.out.printf("i = %d, j = %d일 때 합은 6입니다\n", i, j);
                }
            }
        }
        
        
        int value = 1 + (int)Math.random()*5; // 1부터 5까지 임의의 정수

        String str = "111111";
        int sum = 0;

        for (int i = 0 ; i < str.length() ; i++) {
            sum += Integer.parseInt(str.substring(i,i+1));
        }System.out.println(sum);

        //4-11 피보나치


        int fno1 = 1;
        int fno2 = 1;
        int fno3 = 0;

        System.out.print(fno1 + "," + fno2);

        for (int i = 0; i < 8 ; i++) {
            fno3 = fno1 + fno2;
            System.out.print("," + fno3);
            fno1 = fno2;
            fno2 = fno3;
        }
        
    *다차원행렬 합계와 평균 구하기
        int[][] arr = {
            { 5, 5, 5, 5, 5},
            {10,10,10,10,10},
            {20,20,20,20,20},
            {30,30,30,30,30}
        };

        int total = 0;
        double average = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                total += arr[i][j];
            }
        }
        average = total / (double)(arr[0].length * arr.length);
        System.out.println("total = "+total);
        System.out.println("average = "+average);
        */

        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3]; //결과값 출력할 배열 ball3 지정

        for (int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        System.arraycopy(ballArr,0, ball3,0,3);
        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
            }
            
    }
}
