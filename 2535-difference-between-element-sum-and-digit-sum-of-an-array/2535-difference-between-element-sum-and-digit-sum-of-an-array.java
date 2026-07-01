class Solution {
    public int arraySum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    public int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumDigits(n/10);
    }
    public int differenceOfSum(int[] nums) {
        int result=arraySum(nums);
        int result2=0;
        for(int i=0;i<nums.length;i++){
            result2+=sumDigits(nums[i]);
        }
        return result-result2;
    }
}