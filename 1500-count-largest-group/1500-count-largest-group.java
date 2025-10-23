class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; // max possible digit sum for 9999 is 36

        // count how many numbers have each digit sum
        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            count[sum]++;
        }

        // find the largest group size
        int max = 0;
        for (int c : count) {
            if (c > max) max = c;
        }

        // count how many groups have that largest size
        int groups = 0;
        for (int c : count) {
            if (c == max) groups++;
        }

        return groups;
    }
}
