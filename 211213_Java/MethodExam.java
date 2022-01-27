package Java20211213;
public class MethodExam {

    // input이 있을 때는 매서드()안에 값이 들어가고, output이 있을 때는 print명령으로 수행가능
    //

    //1. 입력과 출력이 모두 있는 매서드 (일반적)
    public int sum(int a, int b) {
        return a+b;
    }

    //2. 입력과 출력이 모두 없는 매서드
    public void noino() {
        System.out.println("no input no out");
    }

    //3. 입력만 있는 매서드
    public void onlyinput(String a) {
        System.out.println(a);
    }

    //4. 출력만 있는 메서드
    public String onlyOutput() {
        return "hi";
    }

    //*. 리턴의 다른 사용법 (break처럼 끝내는 용도로 사용)
    public void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;         //"fool"이 들어오면 출력값 (없음) -> 그냥 끝남
        }
        System.out.println("my nick name is " + nick);
    }

    public static void main(String[] args) {
        MethodExam inandout = new MethodExam(); //객체 생성

        System.out.println(inandout.sum(3,4)); 

        inandout.noino(); // 2. -> noino 매서드에 가서 print명령을 수행했을 뿐, 값이 돌아온 건 아님!

        inandout.onlyinput("Hello World"); // 3. -> + 리턴값이 없기 때문에 print명령으로 불러낼 수가 없음 ㅠㅠ 돌아오는 값이 없기때문에,,,

        System.out.println(inandout.onlyOutput()); // 4. -> onlyOutput에 값을 넣을 수 없음

        inandout.sayNick("fool");   //*. void형태이고, return의 값이 정해져있지 않아서 출력 안됨
        inandout.sayNick("austin"); //*. sayNick의 print명령어를 수행
        

    }
}
