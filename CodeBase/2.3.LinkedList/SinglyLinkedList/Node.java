public class Node {
    protected int data;
    protected Node next; //ptr

    public Node(int data,Node node){
        this.data = data;
        this.next = node;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
