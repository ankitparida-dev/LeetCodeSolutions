class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int poistive=0;
        int negative=1;
        for(int num:nums){
            if(num>0){
                arr[poistive]=num;
                poistive+=2;
            }
            else{
                arr[negative]=num;
                negative+=2;
            }
        }
        return arr;
    }
}