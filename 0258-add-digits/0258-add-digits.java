class Solution {
    public int sumofdigits(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumofdigits(num/10);
    }
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int result=sumofdigits(num);
        return addDigits(result);
    }
}