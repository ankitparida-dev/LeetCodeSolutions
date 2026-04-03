class Solution {
    public boolean isPalindrome(String s) {
        return solve(s, 0, s.length() - 1);
    }

    private boolean solve(String s, int i, int j) {
       
        if (i >= j) return true;

        if (!Character.isLetterOrDigit(s.charAt(i))) {
            return solve(s, i + 1, j);
        }
        if (!Character.isLetterOrDigit(s.charAt(j))) {
            return solve(s, i, j - 1);
        }

        if (Character.toLowerCase(s.charAt(i)) != 
            Character.toLowerCase(s.charAt(j))) {
            return false;
        }

        // move अंदर
        return solve(s, i + 1, j - 1);
    }
}