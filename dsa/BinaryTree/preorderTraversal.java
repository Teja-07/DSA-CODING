import java.util.Stack;
import java.util.function.IntFunction;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
    }
}
//preorder=root->left->right
//Here we will push all the elements into one stack then from there onwards we will remove one one element
//firstly we should push root element to stack and then we should remove first root element only line number 21
//and then after removal of root elements we will add all elements to list lineno 23,24
public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
    List<Integer> preorder=new ArrayList<Integer>();
    Stack<TreeNode> st=new Stack<>();
    if(root==null)
    return preorder;
    st.push(root);
    while(!st.isEmpty()){
        root=st.pop();
        preorder.add(root.data);
        if(root.left!=null)
        st.push(root.left);
        if(root.right!=null)
        st.push(root.right);
        
    }
    return preorder;

}
}
