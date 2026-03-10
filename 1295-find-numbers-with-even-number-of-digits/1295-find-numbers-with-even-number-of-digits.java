class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int count2=0;
            int temp=nums[i];
            while(temp>0){
                temp/=10;
                count2++;
            }
            if(count2%2==0){
                count++;
            }
        }
        return count;
    }
}