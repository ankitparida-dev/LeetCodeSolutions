class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,reverse=0;
        while(temp>0){
            int b=temp%10;
            reverse=reverse*10+b;
            temp/=10;
        }
        if(x<0){
            return false;
        }
        else if(x==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}