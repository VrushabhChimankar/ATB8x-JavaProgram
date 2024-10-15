package oct_ex_16102024.StaticKeyword;

public class StaticKeyword {

    public static void main(String[] args) {

        Student s = new Student(12);
        System.out.println(Student.school_name);
    }
}

class Student{

    int age;
    static String school_name = "ABC";

    public Student(int age){
        this.age = age;
    }
}