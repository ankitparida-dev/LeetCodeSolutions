class Solution {
    public int minSubarray(int[] nums, int p) {

        Map <Integer,Integer> map=new HashMap();
        map.put(0,-1);
        long sum=0;
        for(int num:nums){
            sum+=num;

        }
        int target=(int)(sum%p);
        if(target==0){
            return 0;
        }
        long prefix=0;
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
              prefix+=nums[i];
              int current=(int)(prefix%p);
              int rem=((current-target)+p)%p;
              if(map.containsKey(rem)){
                 ans=Math.min(ans,i-map.get(rem));
              }
              map.put(current,i);
        }
        return ans==nums.length?-1:ans;
    }
}