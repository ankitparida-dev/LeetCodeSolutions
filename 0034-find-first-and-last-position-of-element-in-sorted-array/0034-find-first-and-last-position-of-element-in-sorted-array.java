class Solution {
    public int[] searchRange(int[] nums, int target) {
      int result1=firstOccurence(nums,target);
      int result2=lastOccurence(nums,target);
      return new int[]{result1,result2};
    }
    public static int firstOccurence(int []nums,int target){
        int low=0,high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
               result= mid;
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
     public static int lastOccurence(int []nums,int target){
        int low=0,high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                result= mid;
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
}