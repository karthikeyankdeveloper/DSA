import java.util.Scanner;

public class Main {

    protected static Node head = null;
    private static int input, value, pos;

    private static void insertAtBeginning(int value) {
        Node newNode = new Node(value, head);
        head = newNode;

        if (head != null)
            Console.insertAtBeginning();
    }

    private static void insertAtPosition(int pos, int value) {

        if (pos < 0) {
            Console.invalidPosition();
            return;
        }

        if (pos == 0) {
            insertAtBeginning(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if (temp == null) {
                Console.invalidPosition();
                return;
            }
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;

        System.out.println("------------Value Inserted at Position " + pos + "------------\n");
    }

    private static void deleteAtPosition(int pos) {
        if (head == null) {
            Console.noData();
            return;
        }
        if (pos < 0) {
            Console.invalidPosition();
            return;
        }

        if (pos == 0) {
            head = head.next;
            System.out.println("------------Value Deleted at Position " + pos + "------------\n");
            return;
        }

        Node temp = head;
        Node previous = head;
        for (int i = 1; i <= pos; i++) {
            previous = temp;
            temp = temp.next;
            if (temp == null) {
                Console.invalidPosition();
                return;
            }
        }

        previous.next = temp.next;

        System.out.println("------------Value Deleted at Position " + pos + "------------\n");
    }

    private static void insertAtEnd(int value) {
        Node newNode = new Node(value, null);

        Node temp = head;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = newNode;
                Console.insertAtEnd();
                return;
            }
            temp = temp.next;
        }

        head = newNode;
        Console.insertAtEnd();
    }

    private static void search(int value) {
        if (head == null) {
            Console.noData();
            return;
        }
        Node temp = head;

        while (temp != null) {
            if (value == temp.data) {
                Console.log("True\n");
                return;
            }
            temp = temp.next;
        }

        Console.log("False\n");
    }

    private static void length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        Console.log("Length : " + len + "\n");
    }

    private static void Middle() {
        if (head == null) {
            Console.noData();
            return;
        }
        Node slowtemp = head;
        Node fasttemp = head;
        while (fasttemp.next != null) {
            slowtemp = slowtemp.next;
            fasttemp = fasttemp.next;
            if (fasttemp.next == null) {
                break;
            }
            fasttemp = fasttemp.next;
        }
        Console.log("Middle : " + slowtemp.data + "\n");
    }

    private static void Reverse() {
        if (head == null) {
            Console.noData();
            return;
        }
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
        System.out.println("----Reverse Success -----\n");
    }

    private static void display() {
        if (head == null) {
            Console.noData();
            return;
        }
        Node temp = head;
        Console.log("[");
        while (temp != null) {
            Console.log(temp.next == null ? temp.data + "]\n" : temp.data + ",");
            temp = temp.next;
        }
    }

    private static void FindnEnd(int value) {
        if (head == null) {
            Console.noData();
            return;
        }
        Node Slowtemp = head;
        Node Fasttemp = head;

        for (int i = 0; i < value; i++) {
            Fasttemp = Fasttemp.next;
            if (Fasttemp == null) {
                Console.invalidPosition();
                return;
            }
        }

        while (Fasttemp != null) {
            Fasttemp = Fasttemp.next;
            Slowtemp = Slowtemp.next;
        }

        Console.log("N th Node from End Value: " + Slowtemp.data + "\n");
    }

    private static void duplicate() {
        if (head == null) {
            Console.noData();
            return;
        }
        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        System.out.println("----Duplicate Removed Success -----\n");
    }

    public static Node DetectLoop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }

        return null;
    }

    public static void makeLoop() {

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = six;
        // six.next = null;
        six.next = third;
    }

    public static void removeLoop() {
        Node slow = DetectLoop();
        if(slow==null){
            System.out.println("No Loop Found !");
            return;
        }
        Node temp = head;
        while (temp.next!=slow.next) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;        
        System.out.println("Loop Removed");
    }

    public static void findStartLoop() {
        Node slow = DetectLoop();
        if(slow==null){
            System.out.println("No Loop Found !");
            return;
        }
        Node temp = head;
        while (temp!=slow) {
            temp = temp.next;
            slow = slow.next;
        }     
        System.out.println("Loop Started at value of : "+temp.data);
    }

    
    public static void main(String[] args) {
        insertAtEnd(0);
        insertAtEnd(1);
        insertAtEnd(1);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            Console.MenuList();
            input = sc.nextInt();

            switch (input) {
                case 1:
                    Console.enterValue();
                    insertAtBeginning(value = sc.nextInt());
                    break;
                case 2:
                    Console.enterValue();
                    insertAtEnd(value = sc.nextInt());
                    break;
                case 3:
                    Console.enterPosition();
                    pos = sc.nextInt();
                    Console.enterValue();
                    insertAtPosition(pos, value = sc.nextInt());
                    break;
                case 4:
                    Console.enterPosition();
                    deleteAtPosition(pos = sc.nextInt());
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    sc.close();
                    return;
                case 7:
                    Console.enterValue();
                    search(value = sc.nextInt());
                    break;
                case 8:
                    Reverse();
                    break;
                case 9:
                    Middle();
                    break;
                case 10:
                    System.out.print("Is Loop : " + (DetectLoop()==null?false:true) + "\n");
                    break;
                case 11:
                    removeLoop();
                    break;
                case 12:
                    length();
                    break;
                case 13:
                    Console.log("Enter n th Node : ");
                    FindnEnd(value = sc.nextInt());
                    break;
                case 14:
                    duplicate();
                    break;
                case 15:
                    makeLoop();
                    break;
                case 16:
                    findStartLoop();
                    break;
                default:
                    break;
            }

        }

    }

}