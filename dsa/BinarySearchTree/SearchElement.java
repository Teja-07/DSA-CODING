package BinarySearchTree;
import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
public class SearchElement {
    public Treenode SearchElement(int val,TreeNode root){
        while(root!=null && root.val!=val)}{
            root=val<root.val?root.left:root.right;
        }
        return root;
    }
    
}
