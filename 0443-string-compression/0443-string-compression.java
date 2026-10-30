class Solution {
    public int compress(char[] chars) {
        int len=0;
        int i=0;
        int n=chars.length;
        while(i<n){
            int count=0;
            char ch=chars[i];
            while(i<n && ch==chars[i]){
                 count++;
                 i++;
            }
            chars[len]=ch;
            len++;
            if(count>1){
                String st=Integer.toString(count);
                for(char c:st.toCharArray()){
                    chars[len]=c;
                    len++;
                }
            }
        }
        return len++;
    }
}