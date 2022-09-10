import java.util.*;

import javax.swing.tree.TreeNode;
class TreeNode{
    int data;
    int hd=0;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
class bottomViewBt{
    public ArrayList<Integer> bottomView(TreeNode root){
        ArrayList<Integer> preorder=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return preorder;
        root.hd=hd;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp=q.remove();
            int hd=temp.hd;
            Map.put(hd,temp.data);
            if(temp.left!=null)
            temp.left.hd=hd-1
            q.add(temp.left);
            if(temp.right!=null)
            temp.right.hd=hd+1;
            q.add(temp.right);
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            preorder.add(entry.getValue())

        }
        return preorder
    }

}