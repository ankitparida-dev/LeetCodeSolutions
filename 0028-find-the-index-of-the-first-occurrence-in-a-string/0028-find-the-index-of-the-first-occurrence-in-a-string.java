class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        // Edge cases
        if (m == 0) return 0;
        if (n < m) return -1;
        
        // Outer loop: iterate through possible starting positions in haystack
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            
            // Inner loop: check characters match one by one
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            
            // If we successfully matched every character of the needle
            if (j == m) {
                return i;
            }
        }
        
        return -1; // Needle not found
    }
}