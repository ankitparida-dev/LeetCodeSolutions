class Solution {
    public boolean isPalindromic(String s) {
        int left=0,right=s.length()-1;
        while(left<=right){
           
            char a=s.charAt(left);
            char b=s.charAt(right);
            if(!(matches(a,b))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean matches(char a,char b){
        if(a=='f' && b=='f' || a=='n' && b=='v' || a=='v'&& b=='n'){
            return true;
        }
        else{
        return false;
        }
    }
}