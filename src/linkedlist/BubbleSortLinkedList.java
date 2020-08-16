package linkedlist;

public class BubbleSortLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        insert(linkedList, 4);
        insert(linkedList, 2);
        insert(linkedList, 1);
        insert(linkedList, 0);
        printList(linkedList);
        sort(linkedList);
        printList(linkedList);
        //printReverseList(linkedList);
    }

    public static void sort(DoublyLinkedList doublyLinkedList){
        if(doublyLinkedList.head == null){
            return;
        }
        else{
            DoublyLinkedList.Node head = doublyLinkedList.head;
            DoublyLinkedList.Node tail = doublyLinkedList.tail;
            while (tail.previous!=null){
                while(head.data!=tail.data){
                    if(head.data>head.next.data){
                        int tempData = head.data;
                        head.data = head.next.data;
                        head.next.data = tempData;
                    }
                    head = head.next;

                }
                tail = tail.previous;

            }
        }
    }



    public static void insert(DoublyLinkedList linkedList,int data){
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