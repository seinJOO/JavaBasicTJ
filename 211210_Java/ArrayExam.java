package Java20211210;

import java.util.ArrayList;

public class ArrayExam {
    public static void main(String[] args) {
        //Array 배열 - 배열의 길이는 고정됨 = 수정할 수 없음 = 증가할 수 없음

        // int[] num = {1,2,3,4,5};

        // System.out.println(num[2]);  //index는 0부터 시작
        // System.out.println(num.length);

        ArrayList lists = new ArrayList();

        lists.add("1234");
        lists.add("6544");
        lists.add("5432");

        System.out.println(lists.get(0));
        }
}
