package linkedlist;

public class BubbleSortLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        insert(linkedList, 4);
        insert(linkedList, 1);
        insert(linkedList, -10);
        printList(linkedList);
        sort(linkedList);
        printList(linkedList);
    }

    public static void sort(LinkedList linkedList) {
        LinkedList.Node head = linkedList.head;
        LinkedList.Node head1 = linkedList.head;

        if (head == null) {
            return;
        } else {
            while (head.next != null) {
                while (head1.next != null) {
                    if (head1.data > head1.next.data) {
                        int temp = head1.data;
                        head1.data = head1.next.data;
                        head1.next.data = temp;
                    }
                    head1 = head1.next.next;
                }
                head = head.next;
            }
        }
    }

    public static void insert(LinkedList linkedList, int data) {
        LinkedList.Node insertion = new LinkedList.Node(data);
        LinkedList.Node head = linkedList.head;
        if (head == null) {
            linkedList.head = insertion;
        } else {
            while (head.next != null) {
                head = head.next;
            }
            head.next = insertion;
        }
    }

    public static void printList(LinkedList linkedList) {
        LinkedList.Node node = linkedList.head;
        System.out.print("Head===> ");
        while (node != null) {
            System.out.print(node.data + "--->");
            node = node.next;
        }
        System.out.print("null");
    }
}