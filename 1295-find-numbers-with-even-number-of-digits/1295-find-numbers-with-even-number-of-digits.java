class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){
         int temp=nums[i],count2=0;
         while(temp>0){
            int b=temp%10;
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