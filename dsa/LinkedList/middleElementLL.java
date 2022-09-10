package LinkedList;
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data,ListNode next){
        this.data=data;
        this.next=next;
    }
}
public class middleElementLL {
    public ListNode middleElement(ListNode head){
        ListNode first=head;//nothing but first element if we assign head.next meaning 2nd or more then that
        ListNode end=head;
        while(end!=null && end.next!=null){
            first=head.next;
            end=end.next.next;
        }
        return first;//here head.next is ntng but we are following the middle element and retriving it

    }
}
//Mostly we are going to use some ref/so called pointer in the java to find the elements in LL
//we must use while loop and next is the ref/pointer and head is the first element and data is the 
//value of the head where we store the data 