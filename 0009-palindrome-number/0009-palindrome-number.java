class Solution {
    public int palindrome(int x,int rev){
      if(x==0){
            return rev;
        }
       return palindrome(x/10,rev*10+x%10);
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        return x==palindrome(x,0);
    }
}