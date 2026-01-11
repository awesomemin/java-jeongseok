public class CardExample {
    public static void main(String args[]) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.printf("c1은 무늬가 %s이고 숫자는 %d이며 폭과 높이는 각각 %d, %d이다.%n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2은 무늬가 %s이고 숫자는 %d이며 폭과 높이는 각각 %d, %d이다.%n", c2.kind, c2.number, c2.width, c2.height);

        c1.width = 50;
        c1.height = 80;

        System.out.printf("c1은 무늬가 %s이고 숫자는 %d이며 폭과 높이는 각각 %d, %d이다.%n", c1.kind, c1.number, c1.width, c1.height);
        System.out.printf("c2은 무늬가 %s이고 숫자는 %d이며 폭과 높이는 각각 %d, %d이다.%n", c2.kind, c2.number, c2.width, c2.height);
    }
}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}
