package Java20211221;
import java.util.*;

public class Homework {

	public static void main(String[] args) {

	    // # 4 - 30

	    Scanner sc = new Scanner(System.in);
	    Random rand = new Random();
	    int com = rand.nextInt(99);

	    System.out.println("숫자 맞추기 게임 시작!");
	    System.out.print("0부터 99사이의 숫자를 맞추세요.");

	    int count = 6;
	    int me = 0;

	    while (count != 0) {
	      System.out.printf("남은 횟수 %d회, 어떤 숫자일까? : ", count);
	      me = sc.nextInt(); 
	      count--;
	        if(count == 0) {
	        System.out.println("정답은 "+com+"입니다. 게임을 종료합니다.");
	      } else if (com > me) {
	        System.out.print("더 큰 숫자입니다.");
	      } else if (com < me) {
	        System.out.println("더 작은 숫자입니다.");
	      } else {
	        System.out.println(count + "회만에 맞추었습니다.");
	        break;
	      }     
	    }

	    //# 6 - 1

	    double[] a = new double[5];
	    for (int i = 0 ; i < a.length ; i++) {
	        a[i] = 0;
	        System.out.println("a["+ i +"] = "+a[i]);
	    }

	    //# 6 - 2

	    int arr[] = new int[5];

	    for (int i = 0 ; i < arr.length; i++) {
	      arr[i] = 5 - i;      
	      System.out.println("arr["+ i +"] = "+arr[i]);
	    }

	    //# 6 - 3

	    double[] array = new double[5];

	    for (int i = 0 ; i < array.length; i++) {
	      array[i] = (i+1) * 1.1;
	      System.out.println("array["+ i +"] = " + array[i]);
	    }

	    //# 6 - 6

	    System.out.print("요소 수 : ");
	    int pcs = sc.nextInt();

	    int[] nums = new int[pcs];
	    for (int i = 0 ; i < nums.length ; i++) {
	        System.out.print("a[" + i + "] = ");
	        nums[i] = sc.nextInt();
	    }

	    System.out.print("a = {");
	    for (int i = 0 ; i < nums.length - 1 ; i++) {      
	      System.out.print(nums[i] + ", ");
	    } System.out.print(nums[(nums.length - 1)] + "}");
	    




	}

}
