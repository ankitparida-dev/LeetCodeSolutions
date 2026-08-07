class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int freq[]=new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        int left=0;
        int right=0;
        int start=0;
        int res=Integer.MAX_VALUE;
        int required=t.length();
        while(right<s.length()){
            char c=s.charAt(right);
            if(freq[c]>0){
                required--;
            }
            freq[c]--;
            while(required==0){
                int len=right-left+1;
                if(len<res){
                    res=len;
                    start=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    required++;
                }
                left++;
            }
            right++;
        }
      if(res==Integer.MAX_VALUE){
        return "";
      } 
      
return s.substring(start,start+res);
      
    }
}