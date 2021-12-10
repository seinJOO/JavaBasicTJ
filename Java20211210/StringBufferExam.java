public class StringBufferExam {
    public static void main(String[] args) {
        
        // String Buffer : 문자열을 수정/변경할 때 사용 - 객체가 한번만 생성되고, 그 객체를 계속 수정

        // StringBuffer sb = new StringBuffer(); // 객체 만들기

        // sb.append("hello"); //객체에 문자열 집어넣기
        // sb.append(" ");
        // sb.append("World!!!");

        // String result = sb.toString(); 
        // System.out.println(result);

        // StringBuffer sb = new StringBuffer();
        // sb.append("Hello World");
        // System.out.println(sb.substring(0,4));       //substring도 활용 가능

        //String을 이용한 문자열 추가 - 자료형에 +연산이 사용될 때마다 계속 새로운 객체가 추가되어 생성됨
        //String 자료형은 한번 만들게 되면 수정이 불가능함. 값 자체를 변경할 수 없음. immutable하다고 표현함.
        //toUpperCase와 같은 매서드의 경우에도 문자열이 변경되는 것처럼 보일 수는 있지만, 매서드 수행 시 또 다른 객체를 생성하여 리턴하는 것임.
        // String result = ""; //초기화
        // result += "hello";
        // result += " ";
        // result += "World!!";
        // System.out.println(result);

        // StringBuffer()는 기본적으로 String보다 무거움. 기본적인 메모리 사용량도 크고 속도도 느림.
        // -> 문자열 추가나 변경이 많을 경우에만 StringBuffer()를 사용한다 !!
        // 변경/수정 작업이 거의 없는 경우에는 그냥 String을 사용





    }
}
