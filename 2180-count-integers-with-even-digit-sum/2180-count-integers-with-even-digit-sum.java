class Solution {
    public int sumOfDigits(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumOfDigits(num/10);
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int result=sumOfDigits(i);
            if(result%2==0){
                count++;
            }
        }
        return count;
    }
}