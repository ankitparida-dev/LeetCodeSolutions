class Solution {
    public int sumofDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumofDigits(n/10);
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=sumofDigits(x);
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}