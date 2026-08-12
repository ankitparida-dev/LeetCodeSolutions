class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
                if(k==0){
                    break;
                }
            }
        }
        if(k%2==1){
            int minindex=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[minindex]){
                    minindex=i;
                }
            }
            nums[minindex]=-nums[minindex];
        }
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        return sum;
    }
}