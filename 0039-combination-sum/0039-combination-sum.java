class Solution {
    void gc(int candidates[],int target,List<List<Integer>> res,List<Integer> temp,int sum,int index){
        if(sum==target){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target || index==candidates.length){
            return;
        }
        temp.add(candidates[index]);
        gc(candidates,target,res,temp,sum+candidates[index],index);
        temp.remove(temp.size()-1);
        gc(candidates,target,res,temp,sum,index+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        gc(candidates,target,res,new ArrayList<>(),0,0);
        return res;
    }
}