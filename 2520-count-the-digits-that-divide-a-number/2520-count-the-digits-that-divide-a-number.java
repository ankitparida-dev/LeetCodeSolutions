class Solution {
    
    public int countDigits(int num) {
        int count=0,temp=num;
       while(temp!=0){
        int b=temp%10;
        temp/=10;
         if(num%b==0){
            count++;
        }
       }
     return count;
    }
}