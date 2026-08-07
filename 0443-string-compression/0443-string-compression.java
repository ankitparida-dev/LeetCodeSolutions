class Solution {
    public int compress(char[] chars) {
        // int len=0;
        // int i=0;
        // int n=chars.length;
        // while(i<n){
        //     int count=0;
        //     char ch=chars[i];
        //     while(i<n && chars[i]==ch){
        //         count++;
        //         i++;
        //     }
        //     chars[len]=ch;
        //     len++;
        //     if(count>1){
        //         String s=Integer.toString(count);
        //         for(char c:s.toCharArray()){
        //              chars[len]=c;
        //              len++;
        //         }
        //     }
        // }
        // return len
        
        int len=0;
        int i=0;
        int n=chars.length;
        while(i<n){
            int count=0;
            char ch=chars[i];
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