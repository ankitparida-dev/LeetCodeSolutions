class Solution {
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%10);
    }
    public boolean isSameAfterReversals(int num) {
       int rev=reverse(num,0);
       int drev=reverse(rev,0);
       return num==drev;
    }
}