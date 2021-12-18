package java1214study;

public class AccessObjExam {
    public static void main(String[] args) {
        
        AccessObj obj = new AccessObj(); //객체로 AccessObj에 접근
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.k);
        //System.out.println(obj.i); -> 실행안됨
    }
}
