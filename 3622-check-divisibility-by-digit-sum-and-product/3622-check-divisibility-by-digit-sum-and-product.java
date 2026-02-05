class Solution {
    public boolean checkDivisibility(int n) {
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
        int total=sum+product;
        if(n%total==0){
            return true;
        }
        return false;
    }
}