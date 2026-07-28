class Solution {
    public int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+countDigits(n/10);
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int result=countDigits(nums[i]);
            if(result%2==0){
                count++;
            }
        }
        return count;
    }
}