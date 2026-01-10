public class OperatorEx {
    public static void main(String[] args) {
        int x = 5;
        x = x++ - ++x;
        System.out.println(x);
    }
}
