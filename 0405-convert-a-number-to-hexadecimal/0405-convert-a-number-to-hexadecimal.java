class Solution {

    private void helper(long n, StringBuilder sb) {

        if(n == 0) {
            return;
        }

        helper(n / 16, sb);

        long rem = n % 16;

        if(rem < 10) {
            sb.append(rem);
        } else {
            sb.append((char)('a' + rem - 10));
        }
    }

    public String toHex(int num) {

        if(num == 0) {
            return "0";
        }

        long n = num;

        if(n < 0) {
            n += (1L << 32);
        }

        StringBuilder sb = new StringBuilder();

        helper(n, sb);

        return sb.toString();
    }
}