class Solution {
    public boolean canDivide(int[] nums,int divisor,int threshold){
        int total=0;
        for(int num:nums){
            total+=(num+divisor-1)/divisor;
            if(total>threshold){
                return false;
            }
        }
        return total<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int high=0;
        for(int num:nums){
            high=Math.max(high,num);
        }
        int low=1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(canDivide(nums,mid,threshold)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}