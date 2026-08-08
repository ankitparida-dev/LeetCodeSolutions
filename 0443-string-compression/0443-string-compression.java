class Solution {
    public int compress(char[] chars) {
        int len=0;
        int i=0;
        int n=chars.length;
        while(i<n){
            char c=chars[i];
            int count=0;
            while(i<n && chars[i]==c){
                count++;
                i++;
            }
            chars[len]=c;
            len++;
            if(count>1){
                String s=Integer.toString(count);
                for(char ch:s.toCharArray()){
                    chars[len]=ch;
                    len++;
                }
            }
        }
        return len;
    }
}