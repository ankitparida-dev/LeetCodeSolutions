import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                dq.addLast(Character.toLowerCase(c));
            }
        }
        while (dq.size() > 1) {
            if (!dq.removeFirst().equals(dq.removeLast())) {
                return false;
            }
        }
        
        return true;
    }
}