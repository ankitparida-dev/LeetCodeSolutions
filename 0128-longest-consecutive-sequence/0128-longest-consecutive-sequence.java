class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0){
        return 0;
       }
       Set <Integer> set=new HashSet<>();
       int maxLen=Integer.MIN_VALUE;
       for(int num:nums){
        set.add(num);
       }
       for(int num:set){
        int current=num;
        int len=1;
        if(!(set.contains(current-1))){
            while(true){
                current++;
                if(!(set.contains(current))){
                    break;
                }
                len++;
            }
        }
        if(len>maxLen){
            maxLen=len;
        }
       }
       return maxLen;
    }
}