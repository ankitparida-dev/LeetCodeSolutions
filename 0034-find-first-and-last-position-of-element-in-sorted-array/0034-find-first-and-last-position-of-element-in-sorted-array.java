class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstoccurene(nums,target);
        int last=lastoccurence(nums,target);
        int result[]=new int[]{first,last};
        return result;
    }
    private int firstoccurene(int[] nums,int target){
       int n=nums.length;
       int low=0;
       int high=n-1;
       int index=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            index=mid;
            high=mid-1;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return index;
    }
    private int lastoccurence(int[] nums,int target){
       int n=nums.length;
       int low=0;
       int high=n-1;
       int index=-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            index=mid;
            low=mid+1;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return index;
    }
}