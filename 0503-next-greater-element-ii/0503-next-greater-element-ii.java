class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> stack=new Stack<>();
        int res[]=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            int index=i%nums.length;
            while(!stack.isEmpty() && nums[index]>=stack.peek()){
                stack.pop();
            }
            if(i<=nums.length-1){
                if(!stack.isEmpty()){
                    res[index]=stack.peek();
                }
                else{
                    res[i]=-1;
                }
            }
            stack.push(nums[index]);
        }
        return res;
    }
}