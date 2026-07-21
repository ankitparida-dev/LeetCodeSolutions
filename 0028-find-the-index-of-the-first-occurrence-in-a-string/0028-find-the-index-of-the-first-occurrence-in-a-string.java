class Solution {

    public int[] computeLps(String s) {

        int[] lps = new int[s.length()];

        int i = 1;
        int j = 0;

        while(i < s.length()) {

            if(s.charAt(i) == s.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            }
            else {

                if(j != 0) {
                    j = lps[j - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public int strStr(String haystack, String needle) {

        if(needle.length() == 0) {
            return 0;
        }

        int[] lps = computeLps(needle);

        int i = 0;
        int j = 0;

        while(i < haystack.length()) {

            if(haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if(j == needle.length()) {
                return i - j;
            }

            else if(i < haystack.length() &&
                    haystack.charAt(i) != needle.charAt(j)) {

                if(j != 0) {
                    j = lps[j - 1];
                }
                else {
                    i++;
                }
            }
        }

        return -1;
    }
}