class Solution {
    public int reverse(int num,int rev){
        if(num==0){
            return rev;
        }
        return reverse(num/10,rev*10+num%10);
    }
    public boolean isSameAfterReversals(int num) {
        int rev=reverse(num,0);
        int drev=reverse(rev,0);
        return drev==num;
    }
}