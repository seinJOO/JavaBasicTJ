package Java20211220;
import java.util.*;
public class DowhileExam {
    public static void main(String[] args) {
    /*
    do~while은 while의 변형으로 기본 구조는 같지만, 반드시 한 번은 무조건 실행되도록 한다
            ** while은 경우에 따라 단 한 번도 실행되지 않는 경우도 있음
    
    예제1)
    1~100 사이의 난수를 하나 생성해서 
    "1과 100 사이의 정수를 입력하세요>>" 입력받은 후
    난수가 작으면 -> 더 작은 값으로 다시 입력하세요
    난수가 크면 -> 더 큰 값으로 입력하세요

     Scanner sc = new Scanner(System.in);   
          

        Random rand = new Random();
        int com = 1 + rand.nextInt(99);
        int me = 0;
        int cnt = 0;

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요>>");
            me = sc.nextInt();
            cnt++;

            if (com < me) {
                System.out.println("더 작은 값으로 다시 입력하세요");
            }else if (com > me) {
                System.out.println("더 큰 수로 다시 입력하세요");
            }
        }while (com != me);
        System.out.printf("정답입니다. 시도 횟수는 %d번입니다.\n", cnt);
    


        369게임 ******이해하고 넘어가기
        100 이하에서 3의 배수일때 "짝"을 출력하시오
        3에서는 짝
        36에서는 짝짝

        for (int i = 1; i <= 100 ; i++) {
                System.out.print(i);
                int temp = i;
                do {              
                    if (temp % 10 % 3 == 0 && temp % 10 != 0) {
                        System.out.print("짝");
                    }                
            } while ((temp/=10)!=0); //tmp = tmp / 10이 0이 아닐 동안 반복
                System.out.println();
        }

    break문 예시 **무한루프는 오류 발생 가능성이 높으니 지양하기
        Scanner sc = new Scanner(System.in); 
        int sum = 0;
        int i = 0;
        
        while(true) {
            if (sum > 100) {
                break;
            }
            i++;
            sum += i;
            System.out.println("i =" + i); //중간체크
            System.out.println("sum ="+ sum); //중간체크
        }
        System.out.println("최종 i =" + i);
        System.out.println("최종 sum ="+ sum);

    continue예시 : 3의 배수만 출력하시오(for, continue)
        for (int i = 1 ; i <= 100 ; i++) {
            if (i % 3 != 0) continue;
            System.out.println(i);
        }
**이름 붙은 반복문
    break문은 근접한 단 하나의 반복문만 벗어날 수 있다.
    여러개의 반복문이 중첩된 경우 break만으로는 완전히 벗어날 수 없다.
    
    여러개의 반복문의 이름을 loop1로 지정 시 - break loop1;으로 모든 반복문 벗어나기 가능
    예제) 2단까지만 출력하기
    loop1:
        for (int i = 2; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                if (j==5) break loop1;
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
            System.out.println();
        }
    */

    

        
        

}
}