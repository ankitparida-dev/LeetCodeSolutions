class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set <Character> set=new HashSet();
      int left=0,right=0,max=0;
      while(right<s.length()){
        char c=s.charAt(right);
        if(!(set.contains(c))){
            set.add(c);
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