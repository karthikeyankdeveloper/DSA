class Main{
    public static void main(String[] args) {

        Tree tree = new Tree(10);

        tree.insertLeft(tree.root, 12);
        tree.insertRight(tree.root, 30);
        tree.insertLeft(tree.root.left, 44);
        tree.insertRight(tree.root.right, 40);
        
    }
}