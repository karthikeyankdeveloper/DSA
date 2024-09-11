
public class Avl {

    class Node{
        protected int data;
        protected Node left,right;
        protected int height;

        public Node(int data){
            this.data = data;
            this.height = 0;
        }
    }

    protected Node root;

    public Avl(int data){
        root = new Node(data);
    }

    public void insert(int data){
        root = insert(root,data);
    }

    public Node insert(Node root,int data){
        if(root==null)
            return new Node(data);

        if(root.data>data){
            root.left = insert(root.left,data);
        }else if(root.data<data){
            root.right = insert(root.right,data);
        }else{
            return root; //Because same value not allowed to insert
        }

        root.height = 1+getChildMaxHeight(root);

        int diffrence = balanceFactor(root);

        // LL case
        if(diffrence>1 && data<root.left.data){
            return rightRotate(root);
        }
        // LR case
        if(diffrence>1 && data>root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // RR case
        if(diffrence<-1 && data>root.right.data){
            return leftRotate(root);
        }
        // RL case
        if(diffrence<-1 && data<root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private Node rightRotate(Node z){
        Node y = z.left;
        z.left = y.right;
        y.right = z;


        z.height = 1+getChildMaxHeight(z);
        y.height = 1+getChildMaxHeight(y);
        return y;
    }

    private Node leftRotate(Node z){
        Node y = z.right;
        z.right = y.left;
        y.left = z;


        z.height = 1+getChildMaxHeight(z);
        y.height = 1+getChildMaxHeight(y);
        return y;

    }



    public void inorder(Node root){
        // if(root==null) return;
        if(root!=null){
            inorder(root.left);
            System.out.println("The Node "+root.data +" height is "+root.height);
            // System.out.print(root.data+" ");
            inorder(root.right);
        }
    }


    public int getChildMaxHeight(Node node){
        return Math.max(getHeight(node.left),getHeight(node.right));
    }

    public int balanceFactor(Node node){
        return getHeight(node.left)-getHeight(node.right);
    }


    public int getHeight(Node node){
        if (node==null) {
            return -1;
        }
        return node.height;
    }
    
}
