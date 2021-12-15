package Java20211215;
/*****두번째 정리*****/
import java.util.Scanner;

public class ScannerExam {
    
    public static void main(String[] args) {
        /*
        Scanner() 사용자로부터 입력 받아 변수로 활용

        import java.util.Scanner; -> Scanner 클래스 사용을 위해 추가하기

        Scanner sc = new Scanner(System.in); -> 객체 sc 생성 - 한 번만 생성하면 됨~!
        String input = sc.nextLine(); -> 문자열을 입력받을 때
        int num = sc.nextInt(); -> 정수를 입력받을 때

        예시 : 문자열로 입력 받아 숫자로 변경하기 
        String input = sc.nextLine();
        int num = Integer.parseInt(input); -> 숫자를 여러개 입력받을 때 용이함.

        */
        Scanner sc = new Scanner(System.in);
        System.out.print("두 자리 정수 하나만 입력하세요 >>>");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("입력 내용 : "+ input);
        System.out.printf("숫자로 : %d%n", num);


    }
}
