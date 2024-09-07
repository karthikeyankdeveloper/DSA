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

    // If delete node is root and having one child only
    public void delete(int data){
        root = delete(root,data);
    }

    public Node delete(Node node,int data){
        if(node==null) return node;

        if(node.data>data){
            node.left = delete(node.left, data);
        }
        else if(node.data<data){
            node.right =  delete(node.right, data);
        }else{
            if(node.left==null){
                return node.right;
            }else if(node.right==null){
                return node.left;
            }

            node.data = min(node.right);
            node.right = delete(node.right, node.data);
        }
        
        return node;
    }
    

    public int min(Node node){

        int minimum = 0;


        while(node!=null){
            minimum = node.data;
            node = node.left;
        }

        return minimum;

    }
}
