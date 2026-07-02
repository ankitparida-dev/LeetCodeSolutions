class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int maxlen=Integer.MIN_VALUE;
        Set <Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        for(int ele:set){
            int length=1;
            int current=ele;
            if(!set.contains(ele-1)){
                while(true){
                    current++;
                    if(!set.contains(current)){
                        break;
                    }
                    length++;
                }

            }
            if(length>maxlen){
                maxlen=length;
            }
        }
        return maxlen;
    }
}
