class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int temp=n;
        while(temp>0){
            int b=temp%10;
            sum+=b;
            temp/=10;
        }
        temp=n;
        while(temp>0){
            int b=temp%10;
            product*=b;
            temp/=10;
        }
        return product-sum;
    }
}