import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    protected Node root;

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

    public void preOrder(){
        System.out.println();

        Stack<Node> stack = new Stack<>();
        if(root!=null)
            stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
            temp = null;
        }
    }

    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void inOrder(){
        if(root==null) return;
        System.out.println();

        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (!stack.isEmpty() || temp !=null) {
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                Node rot = stack.pop();
                System.out.print(rot.data + " ");
                temp = rot.right;
            }            
        }

    }

    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void postOrder(){
        System.out.println();

        if(root==null) return;
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (!stack.isEmpty() || current!=null) {
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else{
                Node temp = stack.peek().right;
                if(temp==null){
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                    while (!stack.isEmpty() && temp==stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }else{
                    current = temp;
                }
            }
        }
    }

    public void levelOrder(){
        if(root==null) return;

        Queue<Node> queue = new ArrayDeque<>();
        // Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // queue.offer(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

    public int findMax(Node root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left>result)
        result = left;
        if(right>result)
        result = right;
        
        return result;
    }
}
