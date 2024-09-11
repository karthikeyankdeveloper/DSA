public class AVLMain {

    public static void main(String[] args){
        Avl avlTree = new Avl(10);
        // avlTree.insert(9);
        // avlTree.insert(8);
        // avlTree.insert(6);
        // avlTree.insert(7);
        // avlTree.insert(3);
        // avlTree.insert(4);
        // avlTree.insert(12);
        // avlTree.insert(11);
        // avlTree.insert(14);
        // avlTree.insert(15);

        avlTree.insert(8);
        avlTree.insert(7);
        avlTree.insert(11);
        avlTree.insert(13);
        avlTree.insert(12);

        System.out.println("The Root is "+ avlTree.root.data + " height is "+avlTree.root.height);
        avlTree.inorder(avlTree.root);
    }
}
