class Solution {
   public void solve(int nums[],List <List<Integer>> res,List <Integer> temp,boolean used[]){
    if(temp.size()==nums.length){
        res.add(new ArrayList<>(temp));
        return;
    }
    for(int i=0;i<nums.length;i++){
        if(used[i]){
            continue;
        }
        temp.add(nums[i]);
        used[i]=true;
        solve(nums,res,temp,used);
        temp.remove(temp.size()-1);
        used[i]=false;
            }
   }
    public List<List<Integer>> permute(int[] nums) {
       List <List <Integer>> res=new ArrayList<>();
       solve(nums,res,new ArrayList<>(),new boolean[nums.length]); 
       return res;  
    }
}