public class PointExample {
    public static void main(String[] args) {
        Point point = new Point(4, 3);

        Point3D point3D = new Point3D(1,  -3, 5);

        System.out.println(point.getLocation());
        System.out.println(point3D.getLocation());
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        // return "x: " + x + ", y: " + y + ", z: " + z;
        return super.getLocation() + ", z: " + z;
    }
}
