public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insert(bst.root,20);
        bst.insert(bst.root,25);
        bst.insert(bst.root,15);
        bst.insert(bst.root,7);
        bst.insert(bst.root,67);
        bst.insert(bst.root,65);
        bst.insert(bst.root,88);
        bst.insert(bst.root,99);
        

        bst.inorder(bst.root);
        bst.search(0);
    }
    
}