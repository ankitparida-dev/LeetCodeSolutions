class Solution {
    public int firstPoistion(int[] arr,int target){
          int ans=-1;
          int low=0;
          int high=arr.length-1;
          while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
          }
          return ans;
    }
    public int lastPoistion(int[] arr,int target){
         int ans=-1;
          int low=0;
          int high=arr.length-1;
          while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
          }
          return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       int first=firstPoistion(nums,target);
       int last=lastPoistion(nums,target);
       return new int[]{first,last};
    }
}