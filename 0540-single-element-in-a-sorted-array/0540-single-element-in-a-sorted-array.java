class Solution {
    public int singleNonDuplicate(int[] arr) {
         int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }

        return arr[low];
    }
}