class Solution {
    public void solve(List <String> res,String current,int open,int close,int n){
        if(current.length()==2*n){
            res.add(current);
            return;
        }
        if(open<n){
            solve(res,current+"(",open+1,close,n);
        }
        if(close<open){
            solve(res,current+")",open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List <String> res=new ArrayList<>();
        solve(res,"",0,0,n);
        return res;
    }
}