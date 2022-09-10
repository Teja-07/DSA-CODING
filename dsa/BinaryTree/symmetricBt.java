import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//here we are comparing two trees if both the values are same then we can say it is symmetric
//And also now we are just comparing b/w two parts i.e left and rgt
public class symmetricBt {
    public boolean isSymmetric(TreeNode root){
        return root==null || isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null || right==null)
        return left==right;
        if(left.data!=right.data)
        return false;
        return isSymmetric(left.left, right.left) & isSymmetric(right.right,left.right);
    }
}
