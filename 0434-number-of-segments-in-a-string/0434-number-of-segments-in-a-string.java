class Solution {
    public int countSegments(String s) {
      String Str[]=s.trim().split("\\s+");
      if(s.trim().isEmpty()){
        return 0;
      }
      return Str.length;
    }
}