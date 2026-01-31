class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n,sum=0,product=1;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        int temp2=n;
        while(temp2>0){
            product*=temp2%10;
            temp2/=10;
        }
        return product-sum;
    }
}