package Java20211223;
import java.util.*;

public class Homework {

	public static void main(String[] args) {

	    //# 6 - 15 

	    Scanner sc = new Scanner(System.in);
	    Random rand = new Random();

	    int chk = 1;
	    int temp = 0;
	   
	    String[] month = {"January", "February","March","April","May","June","July","August","September","October","November","December"};

	    System.out.println("해당 월의 영어 단어를 입력하시오.");
	    System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

	    while (chk > 0) {    
	    int mon = 1 + rand.nextInt(12);
	    if (temp == mon) continue;
	      while (true) {
	      System.out.print(mon + "월 : ");
	      String myMonth = sc.next();
	        if (month[mon-1].equals(myMonth)) {
	          System.out.print("정답입니다. ");
	          break;
	        }else {
	          System.out.println("틀렸습니다.");          
	        }
	      }
	    temp = mon;
	    System.out.print("다시 한번? 1...Yes/0...No :");
	    chk = sc.nextInt();
	    }


	    // # 6 - 16

	    String[] daysKo = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
	    String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
	    int close = 1;
	    int tmp = 0;    

	    System.out.println("요일명을 영어 소문자로 입력하시오.");
	    while (close > 0) {   
	    int n = rand.nextInt(7);
	    if (tmp == n) continue;    

	    while (true) {
	    System.out.print(daysKo[n] + " : ");
	    String myDays = sc.next();
	      if (myDays.equals(days[n])) {
	        System.out.print("정답입니다.");
	        break;
	      }else System.out.println("틀렸습니다.");
	    }
	    tmp = n;
	    System.out.print("다시 한번? 1...Yes/0...No :");
	    close = sc.nextInt();
	    }


	    // # 6 - 18 
	    System.out.println("행렬 a의 요소를 입력하세요.");
	    int[][] a = new int[4][3];
	    for (int i = 0 ; i < 4 ; i++) {
	      for (int j = 0 ; j < 3; j++ ) {
	        System.out.printf("a[%d][%d] : ", i, j);
	        a[i][j] = sc.nextInt();
	      }
	    }

	    System.out.println("행렬 b의 요소를 입력하세요.");
	    int[][] b = new int[3][4];
	    for (int i = 0 ; i < 3 ; i++) {
	      for (int j = 0 ; j < 4; j++ ) {
	        System.out.printf("b[%d][%d] : ", i, j);
	        b[i][j] = sc.nextInt();
	      }
	    }

	    int[][] result = new int[4][4];
	    for (int rx = 0 ; rx < 4 ; rx++) {
	      for (int ry = 0 ; ry < 4 ; ry++) {
	        for (int i = 0 ; i < 3 ; i++) {
	        result[rx][ry] += a[rx][i] * b[i][ry]; 
	        }
	      System.out.print(result[rx][ry]+" ");
	      }
	      System.out.println();
	    }
	    

	    // # 7 - 1
	    System.out.print("정수 x : ");
	    int n = sc.nextInt();
	    System.out.println("signOf(x)는" + signOf(n) + "입니다.");
	   
	  }
	   static int signOf(int a) {
	    int result = 0;
	    if (a < 0) result = -1;
	    else if (a == 0 ) result = 0;
	    else if (a > 0) result = 1;
	    return result;

	}

}
