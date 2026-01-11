public class CallStackEx1 {
    public static void main(String[] args) {
        System.out.println("Main started");
        firstMethod();
        System.out.println("Main ended");
    }

    static void firstMethod() {
        System.out.println("First started");
        secondMethod();
        System.out.println("First ended");
    }

    static void secondMethod() {
        System.out.println("Second started");
        System.out.println("secondMethod()");
        System.out.println("Second ended");
    }
}
