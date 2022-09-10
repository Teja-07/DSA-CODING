package LinkedList;
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data,ListNode next){
        this.next=next;
        this.data=data;
    }
}
public class ReverseLL {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
