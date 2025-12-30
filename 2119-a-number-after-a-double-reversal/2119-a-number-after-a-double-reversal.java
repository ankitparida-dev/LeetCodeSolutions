class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int reverse=0;
        while(temp>0){
            int b=temp%10;
            reverse=reverse*10+b;
            temp/=10;
        }
        int doublereverse=0;
        temp=num;
        while(reverse>0){
            int b=reverse%10;
            doublereverse=doublereverse*10+b;
            reverse/=10;
        }
        return doublereverse==num;
    }
}