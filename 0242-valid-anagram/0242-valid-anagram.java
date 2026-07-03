class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
       char[] b=s.toCharArray();
       char[] a=t.toCharArray();
       Arrays.sort(b);
       Arrays.sort(a);
       String s1=String.valueOf(b);
       String s2=String.valueOf(a);
       return s1.equals(s2);
    }
}