class Solution {
    public void solve(int[] candidates,int target,int index,List<Integer> current,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            current.add(candidates[i]);
            solve(candidates,target-candidates[i],i+1,current,res);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List <List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
}