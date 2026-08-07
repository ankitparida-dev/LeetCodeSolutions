class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int k=1;k<n;k++){
            int i=0;
            StringBuilder sb=new StringBuilder();
            while(i<result.length()){
                char ch=result.charAt(i);
                int count=0;
                while(i<result.length() && ch==result.charAt(i)){
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