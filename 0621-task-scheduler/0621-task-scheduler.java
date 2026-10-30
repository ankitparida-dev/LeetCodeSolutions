class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Step 1: Frequency array for 26 uppercase English letters
        int[] count = new int[26];
        int maxFreq = 0;
        int maxCount = 0;
        
        for (char task : tasks) {
            count[task - 'A']++;
            int currentFreq = count[task - 'A'];
            
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxCount = 1; // Reset count for the new maximum frequency
            } else if (currentFreq == maxFreq) {
                maxCount++; // Another task shares the same max frequency
            }
        }
        
        // Step 2: Calculate the partitioned frame size
        int partCount = maxFreq - 1;
        int partLength = n + 1;
        int emptySlots = partCount * partLength + maxCount;
        
        // Step 3: Return the maximum between total tasks and the framed slots
        return Math.max(tasks.length, emptySlots);
    }
}