class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty()){
            return 0;
        }
        String words[]=s.trim().split("\\s+");
        int count=0;
        String last=words[words.length-1];
        for(int i=0;i<last.length();i++){
            count++;
        }
        return count;
    }
}