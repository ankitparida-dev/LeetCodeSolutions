class Solution {
    public String reverseWords(String s) {
        int space = s.indexOf(" ");
        if (space == -1) {
            return reverse(s);
        }
        String first = s.substring(0, space);
        return reverse(first) + " " + reverseWords(s.substring(space + 1));
    }

    private String reverse(String str) {
        if (str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}