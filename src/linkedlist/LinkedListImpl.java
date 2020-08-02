package linkedlist;

public class LinkedListImpl {

    public static void main(String [] args){

        LinkedList linkedList = new LinkedList();
        insertAtEnd(linkedList,1);
        insertAtEnd(linkedList,4);
        insertAtEnd(linkedList,10);
        insertAtEnd(linkedList,7);
        insertAtFront(linkedList,9);
        printList(linkedList);

    }

    public static void insertAtEnd(LinkedList linkedList, int data){

        LinkedList.Node node = new LinkedList.Node(data);
        if(linkedList.head==null){
            linkedList.setHead(node);
        }
        else{
            LinkedList.Node nextNode = linkedList.head;
            while(nextNode.next!=null){
                // System.out.println(nextNode.getData());
                nextNode = nextNode.next;
            }
            nextNode.next = node;
        }
    }

    public static void insertAtFront(LinkedList linkedList,int data){
        LinkedList.Node node = new LinkedList.Node(data);
        if(linkedList.head==null){
            linkedList.head = node;
        }
        else{
            LinkedList.Node tempNode = linkedList.head;
            node.next = linkedList.head;
            linkedList.head = node;

        }
    }

    public static void printList(LinkedList linkedList){

        LinkedList.Node nextNode = linkedList.head;
        System.out.print("Head===> ");
        while(nextNode!=null){
            System.out.print(nextNode.data+"--->");
            nextNode = nextNode.next;
        }
        System.out.print("null");

    }

}
