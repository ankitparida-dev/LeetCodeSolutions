class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set <Integer> set=new HashSet<>();
        int maxlen=Integer.MIN_VALUE;
        for(int ele:nums){
            set.add(ele);
        }
        for(int ele:set){
            int current=ele;
            int len=1;
            if(!set.contains(current-1)){
                while(true){
                    current++;
                    if(!set.contains(current)){
                        break;
                    }
                    len++;
                }
            }
            if(len>maxlen){
                maxlen=len;
            }
        }
        return maxlen;
    }
}