class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String str=s+s;
        boolean result=str.contains(goal)?true:false;
        return result;
    }
}