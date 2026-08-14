class Solution {
    public String makeFancyString(String s) {
       StringBuilder sb=new StringBuilder();
       int i=0;
       while(i<s.length()){
        char ch=s.charAt(i);
        int k=i;
        int count=0;
        while(k<s.length() && s.charAt(k)==ch){
            count++;
            k++;
        }
        while(count>=3){
            count--;
        }
        for(int j=0;j<count;j++){
            sb.append(ch);
        }
        i=k;
       }
       return sb.toString();
    }
}