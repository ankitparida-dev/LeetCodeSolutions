class Solution {
     public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public int atMost(int[] nums, int k) {
        int left=0,right=0,count=0;
        Map <Integer,Integer> map=new HashMap();
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                int val=nums[left];
                int count2=map.get(val);
                count2--;
                if(count2==0){
                    map.remove(val);
                }
                else{
                    map.put(val,count2);
                }
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}