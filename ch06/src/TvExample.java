class Tv {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }
}

class TvExample {
    public static void main(String args[]) {
        Tv t1;
        t1 = new Tv();
        t1.channel = 7;
        t1.channelDown();
        System.out.println(t1.channel);

        Tv t2;
        t2 = new Tv();
        for(int i = 0; i < 10; i++) {
            t2.channelUp();
        }
        System.out.println(t2.channel);
    }
}