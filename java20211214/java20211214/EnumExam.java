package java20211214;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    //static 객체 생성 없이도 접근하여 사용 허용
    //final : 상수로 선언 -> 상수 형태로 선언할 경우에는 대문자를 사용함
    //String : 문자열로

    public static void main(String[] args) {
        String gender1;

        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2;

        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        gender2 = "girl";
        gender2 = 1;
    }
}

//열거형
enum Gender {
    MALE, FEMALE;
}
