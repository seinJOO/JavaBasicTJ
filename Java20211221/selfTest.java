package Java20211221;
import java.util.*;

public class selfTest {

	public static void main(String[] args) {
		
		// # 5 - 6
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] result = new int[coinUnit.length];
		
		
		
		int money = 2680;
		System.out.println("money =" + money);
		
		for (int i = 0 ; i < coinUnit.length ; i++) {
			result[i] = money / coinUnit[i];
			money = money % coinUnit[i];
		}
		System.out.println("500원 : " + coinUnit[i]);
		
		
				
	}

}
