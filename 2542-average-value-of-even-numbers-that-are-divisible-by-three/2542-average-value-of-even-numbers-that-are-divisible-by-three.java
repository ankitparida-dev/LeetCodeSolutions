class Solution {
    public int averageValue(int[] nums) {
        int avg=0,sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
              sum+=nums[i];
              avg++;
            }
        }
        if(avg==0){
            return 0;
        }
        return sum/avg;
    }
}