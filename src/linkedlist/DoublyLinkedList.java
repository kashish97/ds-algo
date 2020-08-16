package linkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
        Node previous;
        Node(int d){
            data = d;
            this.next = null;
            this.previous = null;
        }
    }
}
