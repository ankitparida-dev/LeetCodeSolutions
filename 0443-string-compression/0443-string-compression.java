class Solution {
    public int compress(char[] chars) {
       int len=0;
       int i=0;
       int n=chars.length;
       while(i<n){
        char ch=chars[i];
        int count=0;
        while(i<n && chars[i]==ch){
            count++;
            i++;
        }
        chars[len]=ch;
        len++;
        if(count>1){
            String s=Integer.toString(count);
            for(char c:s.toCharArray()){
                chars[len]=c;
                len++;
            }
        }
       }
       return len;
    }
}