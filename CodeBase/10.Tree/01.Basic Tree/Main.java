class Main{
    public static void main(String[] args) {

        Tree tree = new Tree(1);

        tree.insertLeft(tree.root, 2);
        tree.insertRight(tree.root, 3);
        tree.insertLeft(tree.root.left, 4);
        tree.insertRight(tree.root.right, 6);
        tree.insertRight(tree.root.left, 5);
        tree.insertLeft(tree.root.right, 7);
        
    }
}