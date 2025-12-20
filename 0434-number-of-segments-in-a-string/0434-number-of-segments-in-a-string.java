class Solution {
    public int countSegments(String s) {
      String str[]=s.trim().split("\\s+");
      if(s.trim().isEmpty()){
        return 0;
      }
      return str.length;
    }
}