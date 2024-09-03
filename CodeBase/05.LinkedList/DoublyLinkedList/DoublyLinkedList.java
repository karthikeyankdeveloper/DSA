package DoublyLinkedList;

public class DoublyLinkedList {

    // Inner class
    public class ListNode {
        public int data;
        public ListNode next;
        public ListNode prev;
        
        public ListNode(int data){
            this.data = data;
        }

        public ListNode(int data,ListNode next, ListNode prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static ListNode head = null;
    public static ListNode tail = null;

    public void insertAtBeginning(int value){
        ListNode newNode = new ListNode(value);

        if(head==null){
            head = newNode;
            tail = newNode;
            System.out.println("Inserted at beginning");
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);

        if(head==null){
            head = newNode;
            tail = newNode;
            System.out.println("Inserted at beginning");
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void insertAtPosition(int pos, int value){
        

        if(pos==0){
            insertAtBeginning(value);
            return;
        }

        ListNode temp = head;

        for(int i=1;i<pos;i++){
            temp = temp.next;
            if(temp ==null){
                System.out.println("No Position Found!");
                return;
            }
        }

        ListNode newNode = new ListNode(value);

        newNode.prev = temp;

        if(temp.next==null){
            tail = newNode;
        }else{
            newNode.next = temp.next;
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        
    }

    public void displayForward(){
        if(head==null){
            System.out.println("No data Found!");
            return;
        }

        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }

        System.out.print("null\n");
    }

    public void displayBackward(){
        if(head==null){
            System.out.println("No data Found!");
            return;
        }

        ListNode temp = tail;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp = temp.prev;
        }

        System.out.print("null\n");
    }


    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtBeginning(0);
        doublyLinkedList.insertAtBeginning(1);
        doublyLinkedList.insertAtBeginning(2);
        doublyLinkedList.insertAtEnd(22);

        doublyLinkedList.insertAtPosition(4, 23);

        doublyLinkedList.displayForward();
        doublyLinkedList.displayBackward();
        
    }
    
}
