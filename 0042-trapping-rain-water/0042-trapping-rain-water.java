class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1;
        int leftmax=0,rightmax=0;
        int trap=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    trap+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    trap+=rightmax-height[right];
                }
                right--;
            }
        }
        return trap;
    }
}