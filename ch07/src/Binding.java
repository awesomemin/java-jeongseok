public class Binding {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        Child1 c = new Child1();
        System.out.println(p.x);
        System.out.println(c.x);
        p.method();
        c.method();
        Parent1 cc = null;
        cc = (Child1)p;
        System.out.println(cc.x);
        cc.method();
    }
}

class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent");
    }
}

class Child1 extends Parent1 {
    int x = 200;

    void method() {
        System.out.println("Child");
    }
}
