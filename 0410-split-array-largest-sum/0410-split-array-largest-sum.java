class Solution {
    public int countSubarrays(int[] nums,int max){
        int subarrays=1;
        int currentsum=0;
        for(int num:nums){
            if(currentsum+num>max){
                subarrays++;
                currentsum=num;
            }
            else{
                currentsum+=num;
            }
        }
        return subarrays;
    }
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countSubarrays(nums,mid)<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}