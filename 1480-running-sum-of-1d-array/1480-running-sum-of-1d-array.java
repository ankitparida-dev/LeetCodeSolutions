class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int nums2[]=new int[n];
        nums2[0]=nums[0];
        for(int i=1;i<n;i++){
            nums2[i]=nums2[i-1]+nums[i];
        }
        return nums2;
    }
}
