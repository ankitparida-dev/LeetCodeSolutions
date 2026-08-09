class Solution {
    public int compress(char[] chars) {
        int len=0;
        int i=0;
        int n=chars.length;
        while(i<n){
            int count=0;
            char c=chars[i];
            while(i<n && c==chars[i]){
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