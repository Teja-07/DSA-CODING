import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class deleteElement{
    public TreeNode deleteElement(int key,TreeNode root){
        
        if(root==null)
        return null;
        if(root.val==key)
        return helper(root);
        TreeNode dummy=root;
        while(root!=null){
            if(root.val>key){
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root);
                    break;
                }else{
                    root=root.right;
                }
            }else{
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root);
                    break;
                }else{
                    root=root.left;
                }
            }
            return dummy;
        }
        
    }
    public TreeNode helper(TreeNode root){
        if(root.right==null){
            return root.left;
        }else if(root.left==null){
            return root.right;
        }else{
            TreeNode rightChild=root.right;
            TreeNode lastchild=lastRightChild(root);
            lastchild.right=rightChild;
        }
        return root.left;
    }
    TreeNode  lastRightChild(TreeNode root){
        if(root.right==null)
        {
            return root;
        }
        return lastRightChild(root.right);
    }
}