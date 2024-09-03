public class BinaryTree {
    public Node root;

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }


    public BinaryTree(int data){
        root = new Node(data);
    }

    public BinaryTree(){
       root = null;
    }

    public void insertLeft(Node node,int data){
        node.left = new Node(data);
    }

    public void insertRight(Node node,int data){
        node.left = new Node(data);
    }
}
