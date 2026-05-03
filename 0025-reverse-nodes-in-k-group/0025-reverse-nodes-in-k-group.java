class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        // check if k nodes exist
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }

        // reverse first k nodes
        ListNode prev = null, curr = head, next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        // connect remaining list
        head.next = reverseKGroup(curr, k);

        return prev;
    }
}