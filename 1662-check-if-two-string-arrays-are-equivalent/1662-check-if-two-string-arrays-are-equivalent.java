class Solution {
    public boolean arrayStringsAreEqual(String[] s1, String[] s2) {
       String S1="";
       String S2="";
       for(String word:s1){
        S1+=word;
       }
       for(String word:s2){
        S2+=word;
       }
       return S1.equals(S2);
    }
}