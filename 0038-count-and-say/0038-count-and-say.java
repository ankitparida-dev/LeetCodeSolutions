class Solution {
    public String countAndSay(int n) {
      String result="1";
      for(int k=1;k<n;k++){
         StringBuilder sb=new StringBuilder();
         int i=0;
         while(i<result.length()){
            int count=0;
            char c=result.charAt(i);
            while(i<result.length() && c==result.charAt(i)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(c);
         }
         result=sb.toString();
      }
      return result;
    }
    
}