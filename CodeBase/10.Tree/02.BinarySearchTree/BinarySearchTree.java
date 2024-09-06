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

    public Node search(Node node,int data){
        if(node==null || node.data==data){
            return node;
        }

        if(data<node.data){
            return search(node.left, data);
        }
            
        return search(node.right, data);
    }

    public Node insert(Node node,int data){
        if(node==null){
            return new Node(data);
        }
        if(node.data>data){
            node.left = insert(node.left, data);
        }else{
            node.right = insert(node.right, data);
        }
        return node;
    }
    
}
