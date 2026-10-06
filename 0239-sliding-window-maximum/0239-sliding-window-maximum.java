class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList();
        int res[]=new int[nums.length-k+1];
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1 && !dq.isEmpty()){
                res[j]=nums[dq.peekFirst()];
                j++;
            }
        }
        return res;
    }
}