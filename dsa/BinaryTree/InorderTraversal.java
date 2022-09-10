
import java.util.*;
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
}
//Here we are using bfs now we will store the elements of tree in queue and then we will take into list here poll meaning removing s
//poll meaning removing specific element where as offer meaning inserting paritcular element
//here we are using recursive method
class InorderTraversal{
    public List<Integer> levelOrder(Node root) {
        List<Integer> preorder=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        Node node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                node=st.pop();
                preorder.add(node.data);
                node=node.right;
            }
        }
       return preorder;
    }
}