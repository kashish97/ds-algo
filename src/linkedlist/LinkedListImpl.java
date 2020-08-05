package linkedlist;

public class LinkedListImpl {

    public static void main(String [] args){


        LinkedList linkedList = new LinkedList();
        insertAtEnd(linkedList,1);
        insertAtEnd(linkedList,4);
        insertAtEnd(linkedList,10);
        insertAtEnd(linkedList,7);
        insertAtFront(linkedList,9);
        insertAtPosition(linkedList,11,2);
        insertAtPosition(linkedList,0,5);
//      deleteAtPosition(linkedList,5);
//      deleteAtPosition(linkedList,2);
//      deleteAtFront(linkedList);
//      deleteAtEnd(linkedList);
//      deleteData(linkedList,9);
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

    public static void insertAtPosition(LinkedList linkedList,int data,int position){
        LinkedList.Node node = new LinkedList.Node(data);
        int counter = 1;
        if(position == 1) {
            insertAtFront(linkedList, data);
        }


        LinkedList.Node current = linkedList.head;
        while(current.next!=null){
            if(counter+1 == position){
               LinkedList.Node tempNode = new LinkedList.Node(current.next.data);
               node.next = current.next;
               current.next = node;

            }
            current = current.next;
            counter+=1;

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

    public static void deleteAtPosition(LinkedList linkedList,int position){
        LinkedList.Node head = linkedList.head;
        int counter = 1;
        if(position == 1){
            deleteAtFront(linkedList);
        }
        if(head==null){
            System.out.println("Linked List is null cant delete");
        }
        else{
            while(head.next!=null){
                if(counter+1 == position){
                    head.next = head.next.next;
                }
                counter+=1;
                head = head.next;
            }
        }
    }

    public static void deleteAtFront(LinkedList linkedList){
        LinkedList.Node head = linkedList.head;
        if(head==null){
            System.out.println("Linked List is null cant delete");
        }
        else{
            linkedList.head = head.next;
        }
    }

    public static void deleteAtEnd(LinkedList linkedList){
        LinkedList.Node head = linkedList.head;
        while(head.next.next!=null){
            head = head.next;
        }
        head.next = null;
    }

    public static void deleteData(LinkedList linkedList,int data){
        LinkedList.Node current = linkedList.head;

        if (data == linkedList.head.data){
            deleteAtFront(linkedList);
        }

        while ((current.next!=null)){
            if(current.next.data == data){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

}
