import java.util.*;
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data,ListNode next){
        this.data=data;
        this.next=next;
    }
}
//here there are two LL so now we need to merge both the linked list 
//for that we use one temp variable so that it will store the value of list1 and after stroing it
//it will add list2 and next is the pointer which points to list2 and it will add to it
public class mergeTwoSortedLL{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp=new ListNode();
        ListNode currNode=temp;
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                currNode.next=list1;
                list1=list1.next;
            }else{
                currNode.next=list2;
                list2=list2.next;
            }
            currNode=currNode.next;
        }
        if(list1!=null){
            currNode.next=list1;
            list1=list1.next;
        }
        if(list2!=null){
            currNode.next=list2;
            list2=list2.next;
        }
        return temp.next;
    }
}