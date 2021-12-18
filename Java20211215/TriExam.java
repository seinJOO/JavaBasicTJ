public class TriExam {
    public static void main(String[] args) {
		/* 삼항 연산자 (조건)
		 *  첫번째 피연산자가 조건식의 평가 결과에 따라 true 면 두번째 항 false면 세번째 항의 값이
		 *  결과가 된다. 조건식의 괄호는 필수는 아니다. 
		 *             (조건식) ? true : false 
		 *                      ↓↓
		 *                 if (조건식) {
		 *                   true;
		 *                  }else {
		 *                   false;
		 *                    }
		 * 여러번 중첩하면 가독성이 떨어진다. 꼭 필요한 경우에만 사용한다.                  
		 *  
		 *                    
		 *                    
		 *(조건식) ? "A" : (조건식) ? "B" : (조건식) ? "C" : "D"
		 *if (조건식) {
		 *    "A";
		 *}else if{
		 *    "B";
		 *}else if {
		 *    "C";
		 *}else {
		 *    "D"; 
		 *}
		 * 
		 * 
		 * 
		 * 
		 *  */
		
		                //Quiz 삼항 연산장를 사용하여 100점 미만 90점 이상이면 "A"
		                                       //90점 미만 80점 이상이면 "B"
		                                      // 80점 미만 70점 이상이면 "c"
//		                                      // 나머지는  "D"
//		int score = 75;
//		String a = (90 <= score )? "A" : 
//			       (80 <= score )? "B" :
//			       (70 <= score )? "C" : "D";
//		System.out.printf("당신의 학점은 %s 입니다.", a); 
//		System.out.printfln(a >=90? "A": a >=80? "B": a >= 70? "C": "D");
//	x = x + ( y < x ? 1 : 2)
			int x,y,z;
	        int absX, absY, absZ;
	        char signX,signY,signZ;
	    x= 10;
	    y= -5;
	    z= 0;
	    absX = x >= 0? x : -x;
	    absY = y >= 0? y : -y;
	    absZ = z >= 0? z : -z;
	    signX = x > 0? '+' : x== 0? ' ' : '-';
	    signY = y > 0? '+' : y== 0? ' ' : '-';
	    signZ = z > 0? '+' : z== 0? ' ' : '-';
	    
	    System.out.printf("x=%c%dc%n", signX,absX);
	    System.out.printf("y=%c%dc%n", signY,absY);
	    System.out.printf("z=%c%dc%n", signZ,absZ);
		
	}
}
