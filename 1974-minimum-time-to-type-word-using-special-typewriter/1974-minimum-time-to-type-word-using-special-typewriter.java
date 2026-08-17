class Solution {
    public int minTimeToType(String word) {
        int total=0;
        char needle='a';
        for(int i=0;i<word.length();i++){
            int diff=Math.abs(needle-word.charAt(i));
            int min=Math.min(diff,26-diff);
            total+=min+1;
            needle=word.charAt(i);
        }
        return total;
    }
}