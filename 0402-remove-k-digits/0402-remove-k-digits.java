class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> digits=new Stack<>();
        int remaining=k;
        for(char digit:num.toCharArray()){
            while(remaining>0 && !digits.isEmpty() && digits.peek()>digit){
                digits.pop();
                remaining--;
            }
            digits.push(digit);
        }
        while(remaining>0 && !digits.isEmpty()){
            digits.pop();
            remaining--;
        }
        StringBuilder res=new StringBuilder();
        while(!digits.isEmpty()){
            res.append(digits.pop());
        }
        res.reverse();
        int start=0;
        while(start<res.length() && res.charAt(start)=='0'){
            start++;
        }
        if(start==res.length()){
            return "0";
        }
        return res.substring(start);
    }
}