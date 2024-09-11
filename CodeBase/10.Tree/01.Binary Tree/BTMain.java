public class BTMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.insertLeft(binaryTree.root, 12);
        binaryTree.insertRight(binaryTree.root, 4);
        binaryTree.insertLeft(binaryTree.root.left, 1);
        binaryTree.insertRight(binaryTree.root.left, 3);
        binaryTree.insertLeft(binaryTree.root.right, 5);


        BinaryTree.preOrder(binaryTree.root);
        System.out.println();
        BinaryTree.inOrder(binaryTree.root);
        System.out.println();
        BinaryTree.postOrder(binaryTree.root);

    }
}
