package Java20211210;
import java.util.ArrayList;

public class GenericsExam {
    public static void main(String[] args) {
        
        //제네릭스는 입력되는 자료형을 강제한다 = 진짜 많이 씀!

        ArrayList<String> alist = new ArrayList<String>();

        alist.add("Hello");
        // alist.add(2222); //다른 자료형은 아예 들어갈 수 없게 경고창 뜸
        alist.add("2222");

        //제네릭스를 선언하면 형변환과 같은 불필요한 코딩, 잘못된 형변환 등의 오류를 사전에 방지할 수 있음
        //우리의 DB에 있는 자료만 들어가도록 강제할 수도 있음!
    }
}
