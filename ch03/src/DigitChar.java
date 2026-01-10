import java.util.*;

public class DigitChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c = input.charAt(0);
        if(c >= '0' && c <= '9') {
            System.out.println("입력하신 문자는 숫자입니다.");
        } else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("입력하신 문자는 영어입니다.");
        }
    }
}
