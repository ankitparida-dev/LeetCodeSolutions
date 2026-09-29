class Solution {

    public long reverse2(long num, long rev) {

        if (num == 0) {
            return rev;
        }

        return reverse2(num / 10, rev * 10 + num % 10);
    }

    public int reverse(int x) {

        long rev = reverse2(x, 0);

        if (rev > 2147483647 || rev < -2147483648L) {
            return 0;
        }

        return (int) rev;
    }
}