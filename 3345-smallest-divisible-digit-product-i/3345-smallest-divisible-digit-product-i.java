class Solution {
    public int smallestNumber(int n, int t) {
        if(n==1){
            return 2;
        }
        if(n%2==0){
            return n;
        }
      return n+1;
    }
}