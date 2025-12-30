class Solution {
    public int mirrorDistance(int n) {
        int reverse=0;
        int temp=n;
        while(temp>0){
            int b=temp%10;
            reverse=reverse*10+b;
            temp/=10;
        }
        int diff=n-reverse;
        if(diff<0){
            return -(diff);
        }
        return diff;
    }
}