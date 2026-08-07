class Solution {

    public String helper(long n) {

        if(n == 0) {
            return "";
        }

        long rem = n % 16;

        if(rem < 10) {
            return helper(n / 16) + rem;
        }

        return helper(n / 16) + (char)('a' + rem - 10);
    }

    public String toHex(int num) {

        if(num == 0) {
            return "0";
        }

        long n = num;

        if(n < 0) {
            n += (1L << 32); // convert to unsigned 32-bit value
        }

        return helper(n);
    }
}