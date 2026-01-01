class Solution {
    public String reverseWords(String s) {
     String[] words=s.split(" ");
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<words.length;i++){
        String word=words[i];
        sb.append(new StringBuilder(word).reverse().toString()).append(" ");
     }
     return sb.toString().trim();
    }
}