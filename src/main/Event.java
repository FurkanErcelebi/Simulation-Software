package main;

public class Event {

    private int type;
    private double time;

    public Event(int type, double time) {
        this.type = type;
        this.time = time;
    }

    public int get_type() {
        return this.type;
    }

    public double get_time() {
        return this.time;
    }
}
