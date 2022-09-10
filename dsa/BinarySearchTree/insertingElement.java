import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
class insertingElement{
    public TreeNode insertionElement(TreeNode root,int data){
        if(root==null)
        return new TreeNode(data);
        while(true){
            if(root.data<=data){
                if(root.right!=null){
                    root=root.right;
                }
                else{
                    root.right=new TreeNode(data);
                    break;
                }
            }
            else{
                if(root.left!=null){
                    root=root.left;
                }else{
                    root.left=new TreeNode(data);
                    break;
                }
            }
        }
        return root;
    }
}