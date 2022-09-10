import java.util.*;
//here we can can check whether the tree is bst or bt
class TreeNode {
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}
public class validateBST {
    public boolean isvalidbst(TreeNode root){
        return validbst(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validbst(TreeNode root,long minvalue,long maxvalue){
        if(root==null)
        return true;
        if(root.val>=maxvalue || root.val<=minvalue)
        return false;
        return validbst(root.left,minvalue,root.val) && validbst(root.right, root.val, maxvalue);
    }
}
