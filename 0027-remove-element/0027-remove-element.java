class Solution {
    public int removeElement(int[] nums, int val) {
        Set <Integer> set=new HashSet<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                set.add(nums[i]);
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}