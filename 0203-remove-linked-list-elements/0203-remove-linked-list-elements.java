/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newhead=null,tail=null;
        while(head!=null){
            if(head.val!=val){
                ListNode temp=new ListNode(head.val);
                if(newhead==null){
                    newhead=tail=temp;
                }
                else{
                    tail.next=temp;
                    tail=temp;
                }
            }
            head=head.next;
        }
        return newhead;
    }
}