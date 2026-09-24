class Solution {
    public String decodeString(String s) {
        Stack<Integer> num=new Stack();
        Stack<String> str=new Stack();
        int number=0;
        String current="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');
            }
            else if(ch=='['){
                num.push(number);
                str.push(current);
                number=0;
                current="";
            }
            else if(ch==']'){
                int repeat=num.pop();
                String prev=str.pop();
                String temp="";
                for(int i=0;i<repeat;i++){
                    temp+=current;
                }
                current=prev+temp;
            }
            else{
               current+=ch; 
            }
        }
        return current;
    }
}