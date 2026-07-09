class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map <Character,Integer> map=new HashMap();
      int max=0,right=0,left=0;
      while(right<s.length()){
        int count=map.getOrDefault(s.charAt(right),0)+1;
        map.put(s.charAt(right),count);
        while(map.get(s.charAt(right))>1){
            char ch=s.charAt(left);
            int c=map.get(ch);
            c--;
            map.put(ch,c);
            left++;
        }
       int len=right-left+1;
        max=Math.max(max,len);
        right++;
      }  
      return max;
    }
}