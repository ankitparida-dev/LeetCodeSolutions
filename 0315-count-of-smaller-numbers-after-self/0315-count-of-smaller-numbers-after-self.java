class Solution {
    private int[] count;
    private int[] tempIndex;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        int[] indices = new int[n];
        tempIndex = new int[n];
        
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        mergeSort(indices, 0, n - 1, nums);
        
        List<Integer> result = new ArrayList<>();
        for (int c : count) {
            result.add(c);
        }
        return result;
    }

    private void mergeSort(int[] indices, int left, int right, int[] nums) {
        if (left >= right) return;
        
        int mid = left + (right - left) / 2;
        mergeSort(indices, left, mid, nums);
        mergeSort(indices, mid + 1, right, nums);
        merge(indices, left, mid, right, nums);
    }

    private void merge(int[] indices, int left, int mid, int right, int[] nums) {
        int i = left;       // Left pointer
        int j = mid + 1;    // Right pointer
        int k = left;       // Temporary index pointer
        
        int rightCount = 0; // Tracks how many elements from the right half have been placed
        
        while (i <= mid && j <= right) {
            // If the element on the right is smaller/equal, it gets placed first
            if (nums[indices[j]] < nums[indices[i]]) {
                tempIndex[k++] = indices[j++];
                rightCount++; // Keep track of how many smaller elements jumped ahead
            } else {
                // Element on the left is smaller, so all elements currently counted
                // in 'rightCount' are smaller than this left element!
                count[indices[i]] += rightCount;
                tempIndex[k++] = indices[i++];
            }
        }
        
        // Clean up remaining elements in the left half
        while (i <= mid) {
            count[indices[i]] += rightCount;
            tempIndex[k++] = indices[i++];
        }
        
        // Clean up remaining elements in the right half
        while (j <= right) {
            tempIndex[k++] = indices[j++];
        }
        
        // Copy sorted indices back into the original array
        for (int p = left; p <= right; p++) {
            indices[p] = tempIndex[p];
        }
    }
}