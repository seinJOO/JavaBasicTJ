
/*    1) 가운데 요소를 선택하는 처리 = 평균
    이진 탐색법 - 범위를 절반씩 줄여가면서 찾기  
    예제) 매서드 호출 활용하기  
*/
public class BinaryMethodExam {
    
    static int[] arr = {1,10,11,17,21,25}; // static 매서드 - 객체를 찍지 않아도 호출 가능
    
    static int binarySearch(int key, int head, int tail) {
    int center = 0;

    while (head <= tail) {
      center = (head + tail) / 2 ;
       if (arr[center] == key) {
          return arr[center];
        } else if (arr[center] > key) {
            tail = center - 1;
        } else {
            head = center + 1;
        }
    } 
    return -1;

  }
    public static void main(String[] args) {

        int result = binarySearch(17,0,arr.length - 1);

        if (result == -1) {
            System.out.println("찾지 못했습니다.");
        } else {
            System.out.println(result);
        }
        
    }
}
