class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
       int total=n*(n+1)/2,sum=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       }
       int result=total-sum;
       return result;
    }
}