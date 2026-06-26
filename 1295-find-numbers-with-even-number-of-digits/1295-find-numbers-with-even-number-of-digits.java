class Solution {
    public int digitCount(int n){
       if(n==0){
        return 0;
       }
     return 1+digitCount(n/10);
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
             int result=digitCount(nums[i]);
             if(result%2==0){
                count++;
             }
        }
        return count;
    }
}