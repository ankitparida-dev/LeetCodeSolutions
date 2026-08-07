class Solution {
    public String compressedString(String word) {
       StringBuilder sb=new StringBuilder();
       int i=0;
       int n=word.length();
       while(i<n){
        int count=0;
        char c=word.charAt(i);
        while(i<n && word.charAt(i)==c && count<9){
            count++;
            i++;
        }
        sb.append(count);
        sb.append(c);
       }
       return sb.toString();
    }
}