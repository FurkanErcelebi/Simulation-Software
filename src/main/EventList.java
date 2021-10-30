package main;


import java.util.Iterator;
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

    public void travel() {

        Iterator<Event> iterator = queue.iterator();

        System.out.printf("Event List:");
        while (iterator.hasNext()) {
            
            Event event = iterator.next();
            System.out.printf("("+ event.get_type() +":" + event.get_time() + ")->");

        }
        System.out.println("|");

    }

    public Object getMin() {

        return queue.peek();

    }
}
