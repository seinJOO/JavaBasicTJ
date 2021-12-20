package Java20211220;
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        //크기 판별
        Scanner sc = new Scanner(System.in); // 입력 객체 생성
        int count = 0; //시도 횟수
        int front = 0; //앞 숫자가 큰 경우 횟수
        int back = 0; //뒷 숫자가 큰 경우 횟수        
        

        while (true) {         //반복 구문 기재
        System.out.print("숫자를 입력하세요 >>");
        int a = sc.nextInt();
        System.out.print("숫자를 입력하세요 >>");
        int b = sc.nextInt();
        count++;            
            if (a > b) {
                System.out.println("앞 숫자가 큽니다.");
                front++;                
            } else {
                System.out.println("뒤 숫자가 큽니다.");  
                back++;                        
            }
            System.out.print("계속 할까요?(계속:o, 중단:x) : ");
            String ox = sc.next();
            if (ox.equals("x")) break;
            }        
        System.out.printf("프로그램을 종료합니다.\n시도 횟수 : %d\t앞숫자가 큰 경우 : %d\t뒷 숫자가 큰 경우 : %d", count, front, back); 
}
}
