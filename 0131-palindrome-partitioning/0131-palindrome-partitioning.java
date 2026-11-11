class Solution {
    public void solve(String s,int ind,List<String> current,List<List<String>> res){
        if(ind==s.length()){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(palindrome(s,ind,i)){
                current.add(s.substring(ind,i+1));
                solve(s,i+1,current,res);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean palindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        solve(s,0,new ArrayList<>(),res);
        return res;
    }
}