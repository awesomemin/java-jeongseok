public class PrintfEx {
    public static void main(String[] args) {
        int age = 22;
        System.out.printf("age in binary: %s%n", Integer.toBinaryString(age));
        System.out.printf("%#X%n", age);
    }
}
