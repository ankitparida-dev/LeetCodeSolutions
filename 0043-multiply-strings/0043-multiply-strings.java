class Solution {
    public String multiply(String num1, String num2) {
       if(num1.equals("0") || num2.equals("0")){
        return "0";
       } 
       int n=num1.length()+num2.length();
       int n1=num1.length();
       int n2=num2.length();
       int res[]=new int[n];
       int i;
       for(i=n1-1;i>=0;i--){
        for(int j=n2-1;j>=0;j--){
            int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            mul=mul+res[i+j+1];
            res[i+j+1]=mul%10;
            res[i+j]+=mul/10;
        }
       }
       StringBuilder sb=new StringBuilder();
       for(i=0;i<res.length;i++){
        if(res[i]!=0){
            break;
        }
       }
        for(int j=i;j<res.length;j++){
            sb.append(res[j]);
        }
        return sb.toString();
    }
}