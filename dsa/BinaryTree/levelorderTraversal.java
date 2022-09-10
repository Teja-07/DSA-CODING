import java.util.ArrayList;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//Here levelOrderTraversal meaning dfs depth first search we have to count the values of every level
//Now we should use deque bcoz in this we can add or remove the elements from both sides
//first we add the root element and we traverse (iterate) whole tree and we add the elements in the list
public class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> preorder=new ArrayList<>();
        if(root==null)
        return preorder;
        Deque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int qlen=queue.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<qlen;i++){
                TreeNode cur=queue.poll();
                ans.add(cur.data);
                if(cur.left!=null)
                queue.add(cur.left);
                if(cur.right!=null)
                queue.add(cur.right);
                preorder.add(ans);
            }
            return preorder;

        }

    }
}
