class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String temp = strs[0];

        for (int i = 0; i < temp.length(); i++) {

            char ch = temp.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // If current index exceeds string length
                // or characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return temp.substring(0, i);
                }
            }
        }

        return temp;
    }
}