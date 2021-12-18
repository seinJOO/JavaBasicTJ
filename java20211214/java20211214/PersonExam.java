package java20211214;

class PersonExam {
    public static void main(String[] args) {
        Person person = new Person("사람",25);
        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person(30);
        System.out.println(person1.age);
    }
}