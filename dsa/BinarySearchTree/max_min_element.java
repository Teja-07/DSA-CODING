import java.util.*;
package BinarySearchTree;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
public class max_min_element {
    static int findMax(Node node){
        if(node==null)
        return node;
        int val=node.data;
        if(node.left>val)
        val=node.left;
        if(node.right>val)
        val=node.right;
        return val;
    }

    
}
