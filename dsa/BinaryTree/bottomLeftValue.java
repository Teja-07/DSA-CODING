import java.util.Deque;
import java.util.LinkedList;

class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
//First eppudu aiyna bottom or ee values of the tree adigina manam dani traverse chyle
//mostly bfs ee aiye breadth in the sense prati horizontally based ga
public class bottomLeftValue {
    public int bottmvalue(TreeNode root){
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            if(cur.right!=null){
                queue.add(cur.right);//dont forget that manam queue lo add chestam ekkada bcoz first manam
                                     // check chestam tree through empty lekapothe queue lo add chestam anthe
            }
            if(cur.left!=null){
                queue.add(cur.left); 
                //Manaki left kavale ante left di kinda rayle right di kavale ante right di kinda rayle
            }
        }
        return root.val;
    }
}
