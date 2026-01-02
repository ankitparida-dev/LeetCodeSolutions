class Solution {
    public int differenceOfSums(int n, int m) {
       int d1=0,d2=0;
       for(int i=1;i<=n;i++){
        if(i%m==0){
            d1+=i;
        }
        else{
            d2+=i;
        }
       }
       return d2-d1;
    }
}