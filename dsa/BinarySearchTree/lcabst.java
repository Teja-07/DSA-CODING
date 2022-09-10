import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
public class lcabst {
    public TreeNode lcaofTree(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)
        return null;
        int cur=root.data;
        if(cur<p.data && cur<q.data)
        return lcaofTree(root.right, p, q);
        if(cur>p.data && cur>q.data)
        return lcaofTree(root.left, p, q);
        return root;
    }
    
}
