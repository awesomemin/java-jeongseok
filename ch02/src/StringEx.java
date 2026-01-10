public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 21;

        System.out.println(name);
        System.out.println(str);

        String text = """
                class Main {
                    public String main(String args[]) {
                        System.out.println("Hello");
                    }
                }
                """;
        System.out.println(text);
    }
}
