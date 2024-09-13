public class BTMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertLeft(binaryTree.root, 12);
        binaryTree.insertRight(binaryTree.root, 4);
        binaryTree.insertLeft(binaryTree.root.left, 1);
        binaryTree.insertRight(binaryTree.root.left, 3);
        binaryTree.insertLeft(binaryTree.root.right, 5);


        System.out.println("\nPre order traversal");
        BinaryTree.preOrder(binaryTree.root);
        // Recursive Way 
        binaryTree.preOrder();
        
        System.out.println("\n\nIn order traversal");
        BinaryTree.inOrder(binaryTree.root);
        // Recursive Way 
        binaryTree.inOrder();
        
        System.out.println("\n\nPost order traversal");
        BinaryTree.postOrder(binaryTree.root);
        // Recursive Way 
        binaryTree.postOrder();

        System.out.println("\n\nLevel order traversal");
        binaryTree.levelOrder();


        System.out.println("Max in Binary Tree : "+binaryTree.findMax(binaryTree.root));




    }
}

