class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String concat=s+s;
        boolean result=concat.contains(goal);
        if(result){
            return true;
        }
        else{
            return false;
        }
    }
}