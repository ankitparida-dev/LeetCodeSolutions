class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        PriorityQueue <Integer> pq=new PriorityQueue <>((a,b)->map.get(a)-map.get(b));
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int ele:map.keySet()){
            pq.add(ele);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[]=new int[k];
        int i=res.length-1;
        while(!pq.isEmpty()){
          res[i]=pq.poll();
          i--;
        }
        return res;
    }
}