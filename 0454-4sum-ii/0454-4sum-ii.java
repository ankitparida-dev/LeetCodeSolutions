import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Store all possible sums of nums1 and nums2 with their frequencies
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        
        int count = 0;
        
        // Step 2: Check all possible sums of nums3 and nums4
        for (int c : nums3) {
            for (int d : nums4) {
                int target = -(c + d); // We need (a + b) + (c + d) == 0 -> (a + b) == -(c + d)
                
                // If the complement exists in the map, add its frequency to our count
                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }
        
        return count;
    }
}