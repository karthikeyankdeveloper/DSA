public class BinarySearchTree {

    /**
     * Inner Class
     */
    public class Node {

        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
        }
    }

    public Node root;

    public BinarySearchTree(int key){
        root = new Node(key);
    }

    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public Node insert(Node root,int data){

        if(root==null) return new Node(data);

        if(root.data>data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void search(int data){

    }
    
}
