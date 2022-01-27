package Java20211210;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class SelfTest {   
    public static void main(String[] args) {
        
        /*
        1. 맵 기능을 활용해 key와 value값 삽입, 추출, 키값 확인, 개수 확인, 항목 삭제
        2. pocket에 card가 있으면 택시탄다, 아니면 걸어간다 (ArrayList, if사용)
        3. pocket에 card가 없어도 money가 있으면 택시탄다(ArrayList, if, else if 활용)
        4. 예시 : main클래스의 객체 exam 사용, IfTest 매서드의 value가 3의 배수면 3이, 4의 배수면 4가 출력되도록 하기
        5. month값에 알맞는 영문을 출력(switch-case/if)
        6. 현재 월을 입력하여 봄 여름 가을 겨울 중 하나의 값만 출력하기(switch/if)
        7. 나무를 n번 찍었습니다 출력하고, 10번째일 때 나무 넘어간다~ 출력하기(while/while+break)
        8. 커피를 줄 때는 "커피를 드립니다", 남은 커피 잔수 출력, 다 떨어지면 판매 종료 (while+break)
        9. 1~10 중 홀수만 출력(while+continue사용)
        10. 키보드 입력값을 출력하고, 0이 입력되면 종료하기(scanner+do~while)
        11. 입력값을 계속 누적하되, 입력값이 100이상일 때 sum출력하여 종료시키기(Scanner+do~while)
        12. 1~100까지의 수 중 홀수들의 누적합계를 구하시오(for, if, continue)
        13. 문자열의 모든 내용 출력하기 (for / for each)
        14. 삼항연산자 써보기 */

        ArrayList<String> pocket = new ArrayList<String>();

        pocket.add("card");
        pocket.add("phone");
        pocket.add("money");

        if (pocket.contains("card")) {
            System.out.println("taxi");
        }else if (pocket.contains("money")) {
            System.out.println("taxi");
        }else System.out.println("walk");

        int month = 7 ;
        String monthString = "";
        switch (month) {
            case 12: case 1: case 2: monthString = "winter";
            break;
            case 3: case 4: case 5: monthString="spring";
            break;
            case 6: case 7: case 8: monthString="summer";
            break;
            case 9: case 10: case 11: monthString="autumn";
            break;
        }
        System.out.println(monthString);

        if (month <= 2) {
            monthString = "winter";
        }else if(month <=5) {
            monthString = "spring";
        }else if(month <=8) {
            monthString = "summer";
        }else if(month <=11) {
            monthString = "autumn";
        }else monthString = "winter";
        System.out.println(monthString);

        int tree = 0;

        while (tree < 10) {
            tree++;
            System.out.println(tree+"th attack!");
            if (tree==10) {
                System.out.println("success!!!");
                break;
            }
        }

        int coffee = 10;
        int money = 200;

        while (money > 0) {
            System.out.println("here");
            coffee--;
            money = money - 30;
            System.out.println("coffee "+coffee+" left");
            System.out.println("money "+money+" left");
            if (money < 30) {
                System.out.println("No money");
                break;
            }else if (coffee == 0) {
                System.out.println("No coffee");
                break;
            }
        }

        int odd = 0;
        int oddsum = 0 ;
        while (odd < 10) {
            odd++;
            if (odd%2 == 0) {
                continue;
            }else {                
                oddsum = oddsum + odd;
            }
        }System.out.println(oddsum);


        int input = 0;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            input = scan.nextInt();
            System.out.println("input "+input);
            total += input;
            System.out.println("now "+total);
        }while (input != 0);
        System.out.println("total "+total);
        System.out.println("The End");        
    }
    
}
