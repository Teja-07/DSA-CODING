import java.util.*;
 class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data,TreeNode left,TreeNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
public class mergeTwoBT {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1==null)
        return root2;
        if(root2==null)
        return root1;
        TreeNode root=new TreeNode(root1.data+root2.data);
        root.left=mergeTrees(root1.left,root2.left);
        root.right=mergeTrees(root1.right,root2.right);
        return root;
    }
}
