class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,product=1;
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
        int sum2=sum+product;
        if(n%sum2==0){
            return true;
        }
        else{
            return false;
        }
    }
}