package linkedlist;

public class DoublyLinkedListImpl {

    public static void main(String [] args){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        insertAtEnd(doublyLinkedList,4);
        insertAtEnd(doublyLinkedList,6);
        insertAtEnd(doublyLinkedList,1);
        insertAtFront(doublyLinkedList,-1);
        insertAtPosition(3,-9,doublyLinkedList);
        //deleteAtEnd(doublyLinkedList);
        deleteAtPosition(doublyLinkedList,3);
        printReverseList(doublyLinkedList);
        printList(doublyLinkedList);
    }

    public static void insertAtEnd(DoublyLinkedList linkedList,int data){
        DoublyLinkedList.Node node = new DoublyLinkedList.Node(data);
        if(linkedList.head==null){
            linkedList.head = node;
            linkedList.tail = node;
        }
        else{
            DoublyLinkedList.Node current = linkedList.head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.previous = current;
            linkedList.tail = node;
        }
    }

    public static void insertAtFront(DoublyLinkedList linkedList,int data) {
        DoublyLinkedList.Node node = new DoublyLinkedList.Node(data);
        if(linkedList.head == null){
            linkedList.head = node;
        }
        else{
            node.previous = linkedList.head.previous;
            node.next = linkedList.head;
            linkedList.head.previous = node;
            linkedList.head = node;

        }
    }

    public static void insertAtPosition(int position,int data,DoublyLinkedList doublyLinkedList) {
        DoublyLinkedList.Node node = new DoublyLinkedList.Node(data);
        int counter = 1;
        if(doublyLinkedList.head==null){
            return;
        }
        else if(position ==1){
            insertAtFront(doublyLinkedList,data);
        }
        else{
            DoublyLinkedList.Node current = doublyLinkedList.head;
            while (current.next!=null){
                if(counter+1==position){
                    node.next = current.next;
                    node.previous = current;
                    current.next.previous = node;
                    current.next = node;
                }
                counter+=1;
                current = current.next;
            }

        }
    }

    public static void deleteAtFront(DoublyLinkedList doublyLinkedList){
        if(doublyLinkedList.head==null){
            return;
        }
        else{
            doublyLinkedList.head.next.previous = doublyLinkedList.head.previous;
            doublyLinkedList.head = doublyLinkedList.head.next;
        }
    }

    public static void deleteAtEnd(DoublyLinkedList doublyLinkedList){
        if(doublyLinkedList.tail==null){
            return;
        }
        else {
            doublyLinkedList.tail.previous.next = doublyLinkedList.tail.next;
            doublyLinkedList.tail = doublyLinkedList.tail.previous;
        }
    }

    public static void deleteAtPosition(DoublyLinkedList doublyLinkedList,int position){
        int counter = 1;
        if(position == 1){
            deleteAtFront(doublyLinkedList);
        }
        else{
            DoublyLinkedList.Node current = doublyLinkedList.head;
            while (current.next!=null){
                if(counter+1==position){
                    current.next.next.previous = current;
                    current.next = current.next.next;
                }
                counter+=1;
                current = current.next;
            }
        }
    }

    public static void printList(DoublyLinkedList linkedList){
        if(linkedList.head==null){
            return;
        }
        else{
            DoublyLinkedList.Node node = linkedList.head;
            System.out.print("null ====>");
            while (node!=null){
                System.out.print(node.data+"====>");
                node = node.next;
            }
            System.out.println("null");
        }
        System.out.print("Head is "+linkedList.head.data +" Tail is "+linkedList.tail.data);
    }

    public static void printReverseList(DoublyLinkedList doublyLinkedList){
        if(doublyLinkedList.tail == null){
            return;
        }
        else{
            DoublyLinkedList.Node node = doublyLinkedList.tail;
            while(node!=null){
                System.out.print(node.data + " ");
                node = node.previous;
            }
        }

    }


}
