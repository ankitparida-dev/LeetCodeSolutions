class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        int rightmost=xor&(-xor);
        int b1=0,b2=0;
        for(int i=0;i<n;i++){
            if((rightmost&nums[i])!=0){
                b1^=nums[i];
            }
            else{
                b2^=nums[i];
            }
        }
        return new int[]{b1,b2};
    }
}