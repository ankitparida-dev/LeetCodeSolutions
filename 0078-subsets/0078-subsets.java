class Solution {
    void sub(int nums[],int index,List<Integer> temp,List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        sub(nums,index+1,temp,res);
        temp.remove(temp.size()-1);
        sub(nums,index+1,temp,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        sub(nums,0,new ArrayList<>(),res);
        return res;
    }
}