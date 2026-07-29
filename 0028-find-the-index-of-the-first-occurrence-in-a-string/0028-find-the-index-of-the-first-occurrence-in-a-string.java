class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if(m == 0) {
            return 0;
        }

        if(m > n) {
            return -1;
        }

        int base = 26;

        long patternHash = 0;
        long windowHash = 0;
        long power = 1;

        // base^(m-1)
        for(int i = 0; i < m - 1; i++) {
            power *= base;
        }

        // Initial hashes
        for(int i = 0; i < m; i++) {
            patternHash = patternHash * base + needle.charAt(i);
            windowHash = windowHash * base + haystack.charAt(i);
        }

        for(int i = 0; i <= n - m; i++) {

            // Hash match
            if(patternHash == windowHash) {

                int j = 0;

                while(j < m &&
                      haystack.charAt(i + j) == needle.charAt(j)) {
                    j++;
                }

                if(j == m) {
                    return i;
                }
            }

            // Rolling hash
            if(i < n - m) {

                windowHash =
                    (windowHash - haystack.charAt(i) * power) * base
                    + haystack.charAt(i + m);
            }
        }

        return -1;
    }
}