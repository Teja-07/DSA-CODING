
import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//here balancedbinaryTree meaning both the nodes of the tree should be equal and it should not cross 1
//now by sub lh-rh we can tell it should not cross more then 1

class balancedBinaryTree{
    public int balancedBinaryTree(TreeNode root){
        if(root==null)
        return -1;
        int lh=balancedBinaryTree(root.left);
        int rh=balancedBinaryTree(root.right);
        if((lh & rh)==-1)
        return -1;
        if(abs(lh-rh)>1)
        return -1;
        return 1+Math.max(lh,rh);
    }
    
}