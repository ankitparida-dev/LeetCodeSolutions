class Solution {
    public int calculate(String s) {
        Stack <Integer> st=new Stack<>();
        int number=0;
        char opr='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
               number=number*10+(ch-'0');
            }
            if((!Character.isDigit(ch)) && ch!=' ' ||i==s.length()-1){
                if(opr=='+'){
                    st.push(+number);
                }
                else if(opr=='-'){
                    st.push(-number);
                }
                else if(opr=='*'){
                    st.push(st.pop()*number);
                }
                else if(opr=='/'){
                    st.push(st.pop()/number);
                }
                number=0;
                opr=ch;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}