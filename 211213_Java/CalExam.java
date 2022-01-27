package Java20211213;

class CalExam {
    static int result = 0;
    //static을 사용하면 객체 생성 없이도 접근 가능 - 객체를 안 찍어도 막 가져다 쓸 수 있음
    //하지만~! static은 객체 지향이 아니기 때문에 잘 안씀

    static int add(int num) {
        result += num; // result = result + num
        return result;
    }
    static int sub(int num) {
        result -= num; // result = result - num   -> 기능이 필요할 때마다 계속 추가해야함
        return result;
    }
    // result 매서드는 input과 output이 모두 있는 매서드!
}

