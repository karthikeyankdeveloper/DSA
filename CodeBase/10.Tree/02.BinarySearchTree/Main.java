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

        if (bst.search(bst.root,0)==null) {
            System.out.println("No data Found in Searching!");
        }else{
            System.out.println("Data Exists in BST!");
        }

        if (bst.search(bst.root,50)==null) {
            System.out.println("No data Found in Searching!");
        }else{
            System.out.println("Data Exists in BST!");
        }
    }
    
}
