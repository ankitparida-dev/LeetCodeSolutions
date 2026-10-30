class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0){
        return 0;
      }
      int maxLen=Integer.MIN_VALUE;
      Set <Integer> set=new HashSet<>();
      for(int num:nums){
        set.add(num);
      }
      for(int num:set){
        int len=1;
        int current=num;
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