package LinkedList;
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data,ListNode next){
        this.data=data;
        this.next=next;
    }
}

public class palindromeLL {
    public boolean palindromell(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=reverse(slow);
        fast=head;
        while(slow!=null ){
            if(slow.data!=fast.data){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
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
