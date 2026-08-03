class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int maxfreq=0;
        int left=0;
        int right=0;
        int freq[]=new int[26];
        while(right<s.length()){
           freq[s.charAt(right)-'A']++;
           maxfreq=Math.max(freq[s.charAt(right)-'A'],maxfreq);
           while((right-left+1)-maxfreq>k){
            freq[s.charAt(left)-'A']--;
            left++;
           }
           ans=Math.max(right-left+1,ans);
           right++;
        }
        return ans;
    }
}