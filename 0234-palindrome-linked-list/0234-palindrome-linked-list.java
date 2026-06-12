class Solution {

    ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head);
    }

    boolean check(ListNode right) {

        if(right == null)
            return true;

        if(!check(right.next))
            return false;

        if(left.val != right.val)
            return false;

        left = left.next;

        return true;
    }
}