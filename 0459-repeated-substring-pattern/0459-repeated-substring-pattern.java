class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Step 1: Double the string
        String doubled = s + s;
        
        // Step 2: Remove the first and last character to prevent matching s itself from the exact middle
        String sub = doubled.substring(1, doubled.length() - 1);
        
        // Step 3: Check if the modified string contains the original string
        return sub.contains(s);
    }
}