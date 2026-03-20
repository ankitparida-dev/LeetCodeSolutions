class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void merge(int []nums,int l,int m,int r){
        int temp[]=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m && j<=r){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=m){
            temp[k++]=nums[i++];
        }
        while(j<=r){
            temp[k++]=nums[j++];
        }
        for(i=l,k=0;i<=r;i++,k++){
            nums[i]=temp[k];
        }
    }
    public void mergeSort(int []nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
}