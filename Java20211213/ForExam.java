package Java20211213;

import java.util.Scanner;

public class ForExam {
    public static void main(String[] args) {
        
        //Lines? 물어봤을 때 3을 입력하면 아래처럼 출력하도록
        // *
        //**
        //***
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lines? ");

        num = scan.nextInt();
        for (int j = 0 ; j < num ; j++) {
        for (int i = 0 ; i <= j ; i++) {
            System.out.print("*");
        }System.out.println();
        }
    }
}
