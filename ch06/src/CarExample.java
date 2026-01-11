class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white");
    }
    Car(String color) {
        this(color, "auto", 4);
    }
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("white", "auto", 4);
        Car c3 = new Car("blue");

        System.out.println(c1.color + c1.gearType + c1.door);
        System.out.println(c2.color + c2.gearType + c2.door);
        System.out.println(c3.color + c3.gearType + c3.door);
    }
}