package Java20211222;
import java.util.*;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Random rand = new Random();

	    //# 6 - 8

	    System.out.print("요소 수 : ");
	    int index = sc.nextInt();
	    int[] arrNum = new int[index];

	    for (int i = 0 ; i < arrNum.length ; i++) {
	      System.out.printf("a[%d] = ", i);      
	      arrNum[i] = sc.nextInt();
	    }

	    System.out.print("찾을 숫자 : ");
	    int search = sc.nextInt();
	    int answer = 0;

	    for (int i = 0 ; i < arrNum.length ; i++) {
	      if (arrNum[i] == search) {
	        answer = i;
	        break;
	      }
	    }
	    System.out.printf("그 값은 a[%d]에 있습니다.%n", answer);

	    for (int i = arrNum.length - 1 ; i >= 0 ; i--) {
	      if (arrNum[i] == search) {
	        answer = i;
	        break;
	      }
	    }
	    System.out.printf("그 값은 a[%d]에 있습니다.%n", answer);

	    // # 6 - 11

	    System.out.print("요소 수 : ");
	    int index2 = sc.nextInt();
	    int[] arrNum2 = new int[index2];
	    
	    
	    for (int i = 0 ; i < arrNum2.length ; i++) {
	    System.out.printf("a[%d] = ", i);
	    boolean chk = true;
	      while (chk) {
	        arrNum2[i] = 1 + rand.nextInt(10);
	        if (i > 0) {        
	        chk = arrNum2[i] == arrNum2[i-1];
	        } else break;
	      }
	      System.out.println(arrNum2[i]);
	    }
	      
	    
	    
	    

	    // # 6 - 12

	    System.out.print("요소 수 : ");
	    int index3 = sc.nextInt();
	    int[] arrNum3 = new int[index3];
	    int[] temp = arrNum3;

	    for (int i = 0 ; i < arrNum3.length ; i++) {
	    int check = 1;
	    System.out.printf("a[%d] = ", i);
	      while (check > 0) {
	        check--;
	        arrNum3[i] = 1 + rand.nextInt(10);
	        for (int j = 0 ; j < i ; j++) {
	          if (arrNum3[i] == temp[j]) {
	            check++;
	        }
	      }
	    }
	    System.out.println(arrNum3[i]);
	    temp[i] = arrNum3[i];      
	    }

	    // # 6 - 13

	    System.out.print("요소 수 : ");
	    int a = sc.nextInt();
	    int[] mix = new int[a];
	    int[] test = new int[a];
	  
	      for (int i = 0 ; i < mix.length ; i++) {
	      System.out.printf("a[%d] = ", i);      
	      mix[i] = sc.nextInt();
	      test[i] = mix[i];
	    }    

	    System.out.println("요소를 섞었습니다.");

	    for (int i = 0 ; i < mix.length ; i++) {
	      
	      mixloop: while (true) {
	      int ranNum = rand.nextInt(mix.length);
	        if (test[ranNum] != 0) {
	          mix[i] = test[ranNum];
	          test[ranNum] = 0;
	          break mixloop;
	        }
	      }

	    }

	    for (int i = 0 ; i < mix.length ; i++) {
	      System.out.printf("a[%d] = %d%n", i, mix[i]);
	    }


	    // # 6 - 14

	    System.out.print("요소 수 : ");
	    int pcs = sc.nextInt();
	    int[] numArr = new int[pcs];
	    int[] copy = new int[pcs];
	    for (int i = 0 ; i < pcs ; i++) {
	      System.out.print("a["+i+"] = ");
	      numArr[i] = sc.nextInt();
	      copy[(pcs - 1 - i)] = numArr[i];
	    }

	    System.out.println("a의 모든 요소를 역순으로 복사했습니다.");

	    for (int i = 0 ; i < copy.length ; i++) {
	      System.out.print("b["+i+"] = ");
	      System.out.println(copy[i]);
	    }
	    

	}

}
