class Solution {
    public int product(int n){
        if(n==0){
            return 1;
        }
        return product(n/10)*(n%10);
    }
    public int sumofDigits(int n){
        if(n==0){
            return 0;
        }
        return sumofDigits(n/10)+(n%10);
    }
    public int subtractProductAndSum(int n) {
        int result1=product(n);
        int result2=sumofDigits(n);
        return result1-result2;
        
    }
}