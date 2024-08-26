package problem;

public class MergeSortedList {

    // a = 1-->3-->5-->8-->10-->11
    // b = 1-->4-->9

    //merge = 1-->1-->3-->4-->5-->8-->9-->10-->11

    public static ListNode merge(ListNode a,ListNode b){

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (a!=null && b!=null) {
            if(a.data<=b.data){
                temp.next = a;
                a = a.next;
            }else{
                temp.next = b;
                b = b.next;
            }

            temp = temp.next;
        }

        if(a==null){
            temp.next = b;
        }
        if(b==null){
            temp.next = a;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(8);
        ListNode a5 = new ListNode(10);
        ListNode a6 = new ListNode(11);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = null;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(9);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;

        display(merge(a1, b1));
    }

    private static void display(ListNode listNode) {
        if (listNode == null) {
            System.out.println("No data Found !");
            return;
        }
        ListNode temp = listNode;
        System.out.print("\n --> [");
        while (temp != null) {
            System.out.print(temp.next == null ? temp.data + "] --> null\n\n" : temp.data + ", ");
            temp = temp.next;
        }
    }
    
}
