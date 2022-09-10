import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
public class diameterofBinaryTree {
    public int diameterofBinaryTree(TreeNode root){
        int[] diameter=new int[1];//here we are passing the values of tree in array so that we can acces it
        return diameter[0];
        Treediameter(root,diameter);
    }
    public int Treediameter(TreeNode root,int[] diameter){
        if(root==null)
        return 0;
    }
    int lh=Treediameter(root.left, diameter);
    int lh=Treediameter(root.right, diameter);
    diameter[0]=Math.max(diameter,lh+rh);//here we are adding both the lh and rh so thats why we took the elements
    return 1+Math.max(lh, rh);
    
}
