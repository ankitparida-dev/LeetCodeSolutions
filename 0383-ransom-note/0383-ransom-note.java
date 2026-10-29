class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Frequency array to store counts of 26 lowercase English letters
        int[] count = new int[26];
        
        // Step 1: Count all characters available in the magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Step 2: Use characters for the ransom note
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            // If the count drops below 0, we ran out of this letter
            if (count[c - 'a'] < 0) {
                return false;
            }
        }
        
        // Step 3: Successfully fulfilled the note
        return true;
    }
}