class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        if(x<0){
            return false;
        }
        int temp=x;
        while(temp>0){
            int b=temp%10;
            reverse=reverse*10+b;
            temp/=10;
        }
        return x==reverse;
    }
}