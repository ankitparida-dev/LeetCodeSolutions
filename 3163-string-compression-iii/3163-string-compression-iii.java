class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int n=word.length();
        while(i<n){
            int count=0;
            char ch=word.charAt(i);
            while(i<n && word.charAt(i)==ch && count<9){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
        }
        return sb.toString();
    }
}