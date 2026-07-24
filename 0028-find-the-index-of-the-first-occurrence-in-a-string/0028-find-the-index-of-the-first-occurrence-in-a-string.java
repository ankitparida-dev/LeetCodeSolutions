class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        String str = needle + "$" + haystack;
        int[] z = new int[str.length()];
        int left = 0;
        int right = 0;

        for(int i = 1; i < str.length(); i++) {
            if(i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }
            while(i + z[i] < str.length() &&
                  str.charAt(z[i]) == str.charAt(i + z[i])) {

                z[i]++;
            }
            if(i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
            // Pattern found
            if(z[i] == needle.length()) {
                return i - needle.length() - 1;
            }
        }
        return -1;
    }
}