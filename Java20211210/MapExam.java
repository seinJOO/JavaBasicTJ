import java.util.HashMap;

public class MapExam {
    public static void main(String[] args) {
        
        //파이썬의 딕셔너리, JS의 json, 판다스의 series와 같은 키와 밸류 쌍으로 이루어진 자료형
        //오직 키값으로 밸류값을 얻어냄(1:1), 순서(index)의 개념이 없음

        HashMap<String,String> map = new HashMap<String,String>();


        map.put("people", "person");
        map.put("baseball","ball");

        System.out.println(map.get("people"));
        System.out.println(map.size());

    }
}
