package main;


import java.util.LinkedList;
import java.util.Queue;

public class EventList {

    Queue<Event> queue ;

    public EventList() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(Event evt) {

        queue.add(evt);

    }

    public void dequeue() {

        queue.remove();

    }

    public Object getMin() {

        return queue.peek();

    }
}
