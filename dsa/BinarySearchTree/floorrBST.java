import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//floor is nothing but we have to find the lesser value from the key
//the values should be present in the tree only
public class floorrBST {
    public TreeNode floorbst(TreeNode root,int key){
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                root=root.data;
                return floor;
            }
            if(root.data>key){
                root=root.right;
            }else{
                root=root.left;
            }
        }
    }
    
}
