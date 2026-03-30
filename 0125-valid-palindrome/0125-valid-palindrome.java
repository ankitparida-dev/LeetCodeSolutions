class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); 
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.push(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (c != st.pop()) {
                    return false;
                }
            }
        }
        return true;
    }
}