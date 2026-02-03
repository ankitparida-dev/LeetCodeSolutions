class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int temp=nums[i];
            while(temp>0){
                int b=temp%10;
                temp/=10;
                sum2+=b;
            }
        }
        return sum-sum2;
    }
}