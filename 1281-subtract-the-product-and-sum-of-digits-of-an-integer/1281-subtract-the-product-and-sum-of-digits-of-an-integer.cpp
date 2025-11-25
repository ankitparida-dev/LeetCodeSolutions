class Solution {
public:
    int subtractProductAndSum(int n) {
        int product=1,sum=0;
        int temp=n;
        while(temp>0){
           int b=temp%10;
           sum+=b;
           temp/=10;
        }
        temp=n;
        while(temp>0){
            int c=temp%10;
            product*=c;
            temp/=10;
        }
        int diff=product-sum;
        return diff;
    }
};