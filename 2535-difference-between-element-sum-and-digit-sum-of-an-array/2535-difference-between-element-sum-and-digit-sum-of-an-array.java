class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            while(temp>0){
              int b=temp%10;
              temp/=10;
              sum1+=b;
            }
        }
        int result=sum-sum1;
        if(result<0){
            return -(result);
        }
        return result;
    }
}