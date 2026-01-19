package Exercise;

class Exercise6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        int dx = x1 - x;
        int dy = y1 - y;
        int dSquare = dx * dx + dy * dy;
        return Math.sqrt(dSquare);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}