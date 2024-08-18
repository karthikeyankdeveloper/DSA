import java.util.Scanner;

public class Main {

    protected static Node head = null;
    private static int input, value, pos;

    private static void insertAtBeginning(int value) {
        Node newNode = new Node(value, head);
        head = newNode;

        if(head!=null) Console.insertAtBeginning();
    }

    private static void insertAtEnd(int value) {
        Node newNode = new Node(value, null);

        Node temp = head;
        while (temp!=null) {
            if(temp.next==null){
                temp.next = newNode;
                Console.insertAtEnd();
                return;
            }
            temp = temp.next;           
        }

        head = newNode;
        Console.insertAtEnd();
    }

    private static void display() {
        if(head==null){ Console.noData(); return; }
        Node temp = head;
        Console.log("[");
        while (temp!=null) {
            Console.log(temp.next==null?temp.data+"]\n":temp.data+",");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            Console.MenuList();
            input = sc.nextInt();

            switch (input) {
                case 1:
                    Console.enterValue();
                    value = sc.nextInt();
                    insertAtBeginning(value);
                    break;
                case 2:
                    Console.enterValue();
                    value = sc.nextInt();
                    insertAtEnd(value);
                    break;
                case 3:
                    // insert(input);
                    break;
                case 4:
                    // insert(input);
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    break;
            }

        }

    }

    


    

}