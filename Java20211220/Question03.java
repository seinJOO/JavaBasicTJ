package Java20211220;
import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("단수는? : ");
        String tmp = sc.next();
        int stage = Integer.parseInt(tmp);
        //int stage = tmp.charAt(0)-'0';

        for (int i = 1 ; i <= stage ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }System.out.println();
        }

        for (int i = 1 ; i <= stage ; i++) {
            for (int j = stage ; j >= i ; j--) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
