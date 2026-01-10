public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int temp;

        System.out.println("x: "+ x + ", y: "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+ x + ", y: "+y);

        final int SEONGMIN_AGE = 25;
        System.out.println(SEONGMIN_AGE);

        String name = "Hyeonmin";
        System.out.println(name);
    }
}
