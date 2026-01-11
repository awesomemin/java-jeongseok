public class CarCopy {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        Car1 c2 = new Car1("blue", "manual", 2);
        Car1 c3 = new Car1(c2);

        System.out.println(c1.color + c1.gearType + c1.door);
        System.out.println(c2.color + c2.gearType + c2.door);
        System.out.println(c3.color + c3.gearType + c3.door);

        c2.door = 300;

        System.out.println(c2.color + c2.gearType + c2.door);
        System.out.println(c3.color + c3.gearType + c3.door);
    }
}

class Car1 {
    String color;
    String gearType;
    int door;

    Car1() {
        this("white", "auto", 4);
    }

    Car1(Car1 c) {
        this(c.color, c.gearType, c.door);
    }

    Car1(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
