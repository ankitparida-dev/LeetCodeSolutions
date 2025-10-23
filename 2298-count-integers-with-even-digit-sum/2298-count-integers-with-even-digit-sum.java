class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
           int temp=i,sum=0;
            while(temp>0){
                int b=temp%10;
                sum+=b;
                temp/=10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}