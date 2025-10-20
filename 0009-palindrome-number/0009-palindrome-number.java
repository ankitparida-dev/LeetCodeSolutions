class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0,b,temp=x;
        while(temp>0){
            b=temp%10;
            reverse=reverse*10+b;
            temp/=10;
        }
        if((reverse==x)&&(x>=0)){
            return true;
        }
        else{
            return false;
        }
    
    }
}