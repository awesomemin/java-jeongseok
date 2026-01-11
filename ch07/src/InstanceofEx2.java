public class InstanceofEx2 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,1);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(0,0);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println("p1.equals(p2) == " + p1.equals(p2));
        System.out.println("p1.eqauls(p3) == " + p1.equals(p3));
    }
}

class Point2D {
    private int x;
    private int y;

    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Point2D p) && x == p.x && y == p.y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}