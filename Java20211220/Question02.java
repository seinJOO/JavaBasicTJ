package Java20211220;
import java.util.*;

public class Question02 {
    /*
    1)원하는 기호를 입력하세요>> @
    2) 원하는 횟수를 입력하세요 >> 5
    @@@@@

    1)증가 2)감소 3)종료 >> 1 2 3중 입력
    
    프로그램 종료   최종 카운트 : 2
    

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //콘솔로 입력받을 객체 생성

        System.out.print("원하는 기호를 입력하세요>>");
        String symbol = sc.next();
        System.out.print("원하는 횟수를 입력하세요>>");
        int cnt = sc.nextInt();
        int i = 0; //반복횟수 계산할 변수 지정
        while (i <= cnt) { //입력한 횟수만큼 반복
            System.out.print(symbol);
            i++;
        }
        System.out.println();


        int cmd = 0; //입력받을 명령값 저장
        int fin = 0; //최종 숫자 저장
        while (true) {
        System.out.print("1)증가 2)감소 3)종료 >>");
        cmd = sc.nextInt();
        if (cmd == 1) {
            fin += 1;
        }else if (cmd == 2) {
            fin -= 1;
        }else break;
    }
        System.out.println("프로그램 종료\t 최종 카운트 : "+ fin);

        
    }
    

}
