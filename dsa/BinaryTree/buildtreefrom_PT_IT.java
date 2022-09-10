public class buildtreefrom_PT_IT {
    static int buildTree{
    Map<Integer,Integer> map=new HashMap<>();
for(int i=0;i<inorder.length;i++){
    map.put(inroder[i]),i);
}

TreeNode root=new buildTree(inorder,inorder.length-1,0,preorder,preoder.length-1,0,imap);
return root;
    }
static int buildTree(int[] inorder,int prestart,int preEnd,int[] preOrder,int inStart,int inEnd,
Map<Integer,Integer> map){
    if(preStart>preEnd || inStart>inEnd)
    int iroot=map.get(node.data)
    int numsleft=iroot-prestart;
    root.left=buildTree(preoder,preoder+1,preoder+numsleft,inorder,inStart,iroot-1,map);
    root.right=buildTree(preoder,preoder+numsleft+1,preEnd,inorder,iroot-1,inEnd,map);
    return root
}
    
}
