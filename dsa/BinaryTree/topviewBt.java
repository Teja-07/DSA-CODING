import java.util.*;
class TreeNode{
    int data;
    int hd=0;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//In top view we use the map and queue data structure for viewing the top first we add all element to queue
//map provides key pairs so using that we will add into queue afterwards into the list;
public class topviewBt {
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> preorder=new ArrayList<>();
        if(root==null)
        return preorder;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            TreeNode temp=q.remove;
            int hd=temp.hd;
            TreeNode node=temp.hd;
            map.put(hd,temp.data);
            if(temp.left!=null)
            temp.left.hd=hd-1;
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
            temp.right.hd=hd+1;
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            preorder.add(entry.getValue());
        }
       return preorder;
        
    }
}
