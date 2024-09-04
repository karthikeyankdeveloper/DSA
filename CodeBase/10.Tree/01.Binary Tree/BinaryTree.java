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
        node.right = new Node(data);
    }

    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
