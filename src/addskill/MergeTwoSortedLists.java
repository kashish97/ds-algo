package addskill;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int data = 0;
        if(l1.val<l2.val){
            data = l1.val;
        }
        else {
            data = l2.val;
        }
        ListNode newNode = new ListNode(data);
        newNode.next = null;



        while(l1.next!=null && l2.next!=null){

            if(l1.val<l2.val){
                newNode.next = l1;
                l1 = l1.next;
                newNode = newNode.next;
            }
            else{
                newNode.next = l2;
                l2 = l2.next;
                newNode = newNode.next;
            }

        }

        if(l1.next!=null){
            while(l1.next!=null){
                newNode.val = l1.val;
                newNode = newNode.next;
                l1 = l1.next;
            }
        }

        else if(l2.next!=null){
            while(l2.next!=null){
                newNode.val = l2.val;
                newNode = newNode.next;
                l2 = l2.next;
            }
        }
        return newNode;
    }

    public static void main(String [] args){}
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
