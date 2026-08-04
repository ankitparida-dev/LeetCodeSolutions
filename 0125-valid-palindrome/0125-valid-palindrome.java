class Solution {
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        return s.equals(reverse(s));
    }
}