package java1214study;

public class AccessObj {        //아래로 갈 수록 제한이 강해짐
    public int p = 3;       // 모든 접근 허용
    protected int p2 = 4; //protected 같은 패키지에서만 접근 허용 - 단, 상속 받은 경우는 예외
    int k = 2;          //default - 같은 패키지 내에서만 접근 허용(접근제한자 안쓰면 디폴트)
    private int i = 1; //자기자신만 쓸 수 있음
   }

   /*

   접근제한자는 public > protected(같은 패키지 내, 상속 시 접근가능) > (default(같은 패키지 내)) > private (자기자신만)
   */