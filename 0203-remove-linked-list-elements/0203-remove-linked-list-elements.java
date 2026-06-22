class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode head1=null,tail=null;
       while(head!=null){
        if(head.val!=val){
            ListNode temp=new ListNode(head.val);
            if(head1==null){
              head1=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        head=head.next;
       }
       return head1;
    }
}