class Solution {
    public int sumdigits(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumdigits(num/10);
    }
    public int addDigits(int num) {
        if(num<10){
           return num;
        }
        int result=sumdigits(num);
        return addDigits(result);
    }
}