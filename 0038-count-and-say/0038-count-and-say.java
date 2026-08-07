class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int k=1;k<n;k++){
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<result.length()){
                int count=0;
                char ch=result.charAt(i);
                while(i<result.length() && result.charAt(i)==ch){
                    count++;
                    i++;
                }
               sb.append(count);
               sb.append(ch);
            }
            result=sb.toString();
        }
        return result;
    }
}