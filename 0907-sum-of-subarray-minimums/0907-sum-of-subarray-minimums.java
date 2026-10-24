class Solution {
    private int[] findPreviousLess(int[] arr) {
        int n = arr.length;
        int[] previousLess = new int[n];
        Arrays.fill(previousLess, -1);

        Stack<Integer> indices = new Stack<>();

        // Scan from left to right for previous boundaries.
        for (int i = 0; i < n; i++) {
            // Remove values that are not strictly smaller.
            while (!indices.isEmpty()
                    && arr[indices.peek()] >= arr[i]) {
                indices.pop();
            }

            // A remaining index is the previous smaller boundary.
            if (!indices.isEmpty()) {
                previousLess[i] = indices.peek();
            }

            // Save the current index for later elements.
            indices.push(i);
        }

        return previousLess;
    }

    // Finds the next smaller-or-equal index for every element.
    private int[] findNextLessOrEqual(int[] arr) {
        int n = arr.length;
        int[] nextLessOrEqual = new int[n];
        Arrays.fill(nextLessOrEqual, n);

        Stack<Integer> indices = new Stack<>();

        // Scan from right to left for next boundaries.
        for (int i = n - 1; i >= 0; i--) {
            // Remove values that are strictly greater.
            while (!indices.isEmpty()
                    && arr[indices.peek()] > arr[i]) {
                indices.pop();
            }

            // A remaining index is the next valid boundary.
            if (!indices.isEmpty()) {
                nextLessOrEqual[i] = indices.peek();
            }

            // Save the current index for earlier elements.
            indices.push(i);
        }

        return nextLessOrEqual;
    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long mod = 1000000007L;

        int[] previousLess = findPreviousLess(arr);
        int[] nextLessOrEqual = findNextLessOrEqual(arr);

        long answer = 0;

        // Calculate each element's contribution as the minimum.
        for (int i = 0; i < n; i++) {
            long leftChoices = i - previousLess[i];
            long rightChoices = nextLessOrEqual[i] - i;

            // Count all subarrays where arr[i] owns the minimum.
            long contribution =
                (arr[i] * leftChoices) % mod;
            contribution =
                (contribution * rightChoices) % mod;

            // Add the current contribution to the answer.
            answer = (answer + contribution) % mod;
        }

        return (int) answer;
    }
}