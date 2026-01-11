public class TimeExample {
    public static void main(String[] args) {
        Time t = new Time(13, 5, 44);
        System.out.println(t);
        t.setSecond(59);
        System.out.println(t);
        t.setSecond(80);
        System.out.println(t);
    }
}

class Time {
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}