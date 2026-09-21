class Solution {
    public static int firstOccurence(int[] nums,int target){
        int low=0,high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
              result=mid;
              high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       return result;
    }
    public static int lastOccurence(int[] nums,int target){
        int low=0,high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
              result=mid;
              low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       return result;
    }
    public int[] searchRange(int[] nums, int k) {
        int res1=firstOccurence(nums,k);
        int res2=lastOccurence(nums,k);
        return new int[]{res1,res2};
    }
}