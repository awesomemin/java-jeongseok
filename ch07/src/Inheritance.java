public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sayAge();
        s1.sayGrade();
    }
}

class Person {
    String name = "Sam";
    int age = 20;

    void sayAge() {
        System.out.printf("I'm %d years old.%n", age);
    }
}

class Student extends Person {
    double grade = 3.5;

    void sayGrade() {
        System.out.printf("My grade is %.1f/4.5.%n", grade);
    }
}
