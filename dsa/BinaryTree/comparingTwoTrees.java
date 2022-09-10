import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
public class comparingTwoTrees {
    public int iscomparingTwoTrees(TreeNode p,TreeNode q){
        if(p==null|| q==null){
            return (p==q);
        }
        return (p.data==q.data) && iscomparingTwoTrees(p.left, q.left) && iscomparingTwoTrees(p.right, q.right);

    }
}
