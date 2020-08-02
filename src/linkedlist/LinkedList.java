package linkedlist;

public class LinkedList {

    Node head;



    public void setHead(Node head) {
        this.head = head;
    }

    static class Node{

     int data;
     Node next;
        Node(int d)
        {
            data = d;
            this.next = null;
        }

    }}