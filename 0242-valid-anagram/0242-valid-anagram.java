class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        return s1.equals(s2);
    }
}