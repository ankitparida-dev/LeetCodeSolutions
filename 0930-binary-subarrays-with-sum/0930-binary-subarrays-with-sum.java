class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       Map <Integer,Integer> map=new HashMap();
       int sum=0,count=0;
       map.put(0,1);
       for(int num:nums){
        sum+=num;
        int diff=sum-goal;
        if(map.containsKey(diff)){
            count+=map.get(diff);
        }
       
        map.put(sum,map.getOrDefault(sum,0)+1);
       
       }
      return count;
    }
}
