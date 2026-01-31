class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num,reverse=0,reverse2=0;
        while(temp>0){
            reverse=reverse*10+temp%10;
            temp/=10;
        }
        while(reverse>0){
            reverse2=reverse2*10+reverse%10;
            reverse/=10;
        }
        return reverse2==num;
    }
}