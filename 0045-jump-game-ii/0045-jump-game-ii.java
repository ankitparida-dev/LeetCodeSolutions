class Solution {
    public int jump(int[] nums) {
       int left=0,right=0;
       int jumps=0;
       while(right<nums.length-1){
        int maxindex=0;
        for(int i=left;i<=right;i++){
            maxindex=Math.max(maxindex,i+nums[i]);
        }
        jumps++;
        left=right+1;
        right=maxindex;
       }
       return jumps;
    }
}