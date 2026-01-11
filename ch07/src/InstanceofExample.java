public class InstanceofExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1 instanceof Teacher);
        System.out.println(t1 instanceof MathTeacher);
//        MathTeacher t2 = new Teacher();
//        System.out.println(t2 instanceof Teacher);
//        System.out.println(t2 instanceof MathTeacher);
        Teacher t3 = new MathTeacher();
        System.out.println(t3 instanceof Teacher);
        System.out.println(t3 instanceof MathTeacher);
        MathTeacher t4 = new MathTeacher();
        System.out.println(t4 instanceof Teacher);
        System.out.println(t4 instanceof MathTeacher);

        System.out.println(t1.getClass().getName());
        System.out.println(t3.getClass().getName());
        System.out.println(t4.getClass().getName());
    }
}

class Teacher {}
class MathTeacher extends Teacher {}
