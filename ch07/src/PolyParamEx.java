import java.util.Optional;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() { return "Computer"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("not enough money");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " purchase completed");
    }
}

class PolyParamEx {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        System.out.println("remaining money is " + b.money);
        System.out.println("current bonus point is " + b.bonusPoint);


    }
}