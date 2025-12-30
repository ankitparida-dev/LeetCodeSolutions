class Solution {
    public int findNumbers(int[] nums) {
     int evendigits=0;
     for(int i=0;i<nums.length;i++){
        int temp=nums[i];
        int count=0;
        while(temp>0){
            int b=temp%10;
            temp/=10;
            count++;
        }
        if(count%2==0){
            evendigits++;
        }
     }
     return evendigits;
    }
}