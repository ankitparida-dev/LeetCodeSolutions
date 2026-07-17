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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp=head;
        LinkedHashMap<Integer,Integer> hs=new LinkedHashMap<>();
        while(temp!=null){
if(hs.containsKey(temp.val)){
    hs.put(temp.val,hs.get(temp.val)+1);
}
else hs.put(temp.val,0);
temp=temp.next;

        }
        ListNode l1=new ListNode(0);
        ListNode l2=l1;
        for(Integer x:hs.keySet()){
if(hs.get(x)==0){
l1.next=new ListNode(x);
l1=l1.next;

}

        }
        return l2.next;

        
    }
}