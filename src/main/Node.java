package main;

public  class Node
{
    private Event data;
    private Node next;

    // Constructor to create a new node
    Node(Event d) {
        this.data = d;
        this.next = null;
    }

    public void setData(Event data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Event getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
