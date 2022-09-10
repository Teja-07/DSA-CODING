import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//In zig zag traversal we move from left to right and right to left in a zig zag way if we move left to
//right then we can keep reverse true or else false
//remaining all we follow level order traversal where we use QUEUE ds
public class zig_zag_treeTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> preorder=new ArrayList<>();
        boolean reverse=true;
        if(root==null)
        return preorder;
        Deque<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int qlen=q.size();
            ArrayList<TreeNode> ans=new ArrayList<>();
            for(int i=0;i<qlen;i++){
                if(reverse)
                ans.add(0,ans.data);
                else
                ans.add(ans.data);
                TreeNode cur=q.poll();
                if(cur.left!=null)
                q.add(cur.left);
                if(cur.right!=null)
                q.add(cur.right);
                preorder.add(ans);
                reverse=reverse?true:false;
            }
            return preorder;
        }
    }

    
}
