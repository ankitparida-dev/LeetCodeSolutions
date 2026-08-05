class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String S:patterns){
            if(word.contains(S)){
                count++;
            }
        }
        return count;
    }
}