package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Queue {

    private int len;
    private Node rear;
    private Node front;
    /*Node front;
    Node rear;

    int len;*/

    public Queue(){
        front = null;
        rear = null;
        len = 0;
    }

    public void enqueue(Event evt) {
        Node node = new Node(evt);

        if(len > 0){
            rear.setNext(node);
            rear = node;
        }
        else {
            rear = node;
            front = rear;
        }
        len++;

    }

    public Object dequeue() {
        Event event = null;
        if(len > 0){
            event = front.getData();
            front = front.getNext();
            len--;
        }
        else {
            System.out.println("Queue is empty!!");
            front = null;
            rear = null;
        }

        return event;
    }

    public void travel(){

        Node curr = front;

        System.out.printf("Waitig Queue:");
        while (curr != null){
            System.out.printf("("+ curr.getData().get_type() +":" + curr.getData().get_time() + ")->");
            curr = curr.getNext();
        }
        System.out.println("|");

    }

    /*public void main(String argd[]){

        new Queue();

        enqueue(new Event(2,3));
        enqueue(new Event(4,5));
        enqueue(new Event(5,6));

        travel();

        Event out = (Event)dequeue();
        System.out.println("Dequeue :" + out.getValue1() + ":" + out.getValue2() );

        enqueue(new Event(7,8));
        travel();

    }*/

}
