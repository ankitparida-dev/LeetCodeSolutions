class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse=0,reverse2=0,temp=num;
        while(temp>0){
            int b=temp%10;
            reverse=reverse*10+b;
            temp/=10;
        }
        while(reverse>0){
            int b=reverse%10;
            reverse2=reverse2*10+b;
            reverse/=10;
        }
        if(num==reverse2){
            return true;
        }
        else{
            return false;
        }
    }
}