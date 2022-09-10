import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//Here we just count both the nodes length from both the ends
public class DepthTree {
    public int intDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=intDepth(root.left);
        int rh=intDepth(root.right);
        return 1+Math.max(lh, rh);
    }

    
}
