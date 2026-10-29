class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] arr=nums.clone();
        for(int i=0;i<n;i++){
            nums[(i+k)%n]=arr[i];
        }
    }
}