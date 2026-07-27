class Solution {
    public int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }
    public int sumdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumdigits(n/10);
    }
    public int subtractProductAndSum(int n) {
       int result1=product(n);
       int result2=sumdigits(n);
       return result1-result2;
        
    }
}