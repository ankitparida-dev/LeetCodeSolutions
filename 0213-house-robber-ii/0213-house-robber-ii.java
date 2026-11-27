class Solution {
    public int robTab(int start,int end,int[] nums){
        int[] dp=new int[nums.length];
        dp[start]=nums[start];
        for(int i=start+1;i<=end;i++){
            int pick=nums[i];
            if(i>start+1){
                pick=nums[i]+dp[i-2];
            }
            int notPick=dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[end];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int case1=robTab(0,n-2,nums);
        int case2=robTab(1,n-1,nums);
        return Math.max(case1,case2);
    }
}