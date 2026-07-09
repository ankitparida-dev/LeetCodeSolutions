class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set <Character> set=new HashSet();
      int max=0,right=0,left=0;
      while(right<s.length()){
       char ch=s.charAt(right);
       if(!(set.contains(ch))){
                 set.add(ch);
                 int len=right-left+1;
                 max=Math.max(len,max);
                 right++;
       }
       else{
        set.remove(s.charAt(left));
        left++;
       }
      }  
      return max;
    }
}