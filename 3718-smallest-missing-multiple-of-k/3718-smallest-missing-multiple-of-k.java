class Solution {
    public int missingMultiple(int[] nums, int k) {
      int curr=k;
      while(true){
        boolean found=false;
        for(int num:nums){
            if(num==curr){
                found=true;
                break;
            }
        }
        if(!found){
            return curr;
        }
        curr+=k;
      }
    }
}