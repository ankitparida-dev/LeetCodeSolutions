class Solution {
    public int search(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        return map.getOrDefault(target,-1);
    }
}