import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//Here we are using some random ds to store the right view of the bt bcoz 
public class rightviewBT {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        reorderBt(root,preorder,0);
        return preorder;
    }
    public void reorderBt(TreeNode root,List<Integer> preorder,int level){
        if(root==null)
        return;
        if(level==preorder.size()){
         preorder.add(root.data)
        }
        reorderBt(root.right, preorder, level+1);
        reorderBt(root.left, preorder, level+1);
    }
    
}
