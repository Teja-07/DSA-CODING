class Node{
    int key;
    Node left,right;
    public Node(int item){
        item=key;
    }
}
class BinaryTree{
    Node root;
    
    public static void main(String args[]){
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        System.out.println("the output of the tree is"+tree.root);
        
    }
}