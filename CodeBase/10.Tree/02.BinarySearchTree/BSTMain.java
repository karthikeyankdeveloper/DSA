public class BSTMain {

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

        System.out.println(bst.search(bst.root,0)==null?"No data Found in Searching!":"Data Exists in BST!");
        System.out.println(bst.search(bst.root,50)==null?"No data Found in Searching!":"Data Exists in BST!");

        bst.delete(50);

        bst.inorder(bst.root);

        System.out.println("\nIs Valid BST : "+ bst.validBST(bst.root,Long.MIN_VALUE,Long.MAX_VALUE));
    }
    
}
