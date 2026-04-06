class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n=nums2.length;
       int[] nge=new int[n];
       Arrays.fill(nge,-1);
       Stack<Integer> stack=new Stack<>();
       for(int i=0;i<n;i++){
        while(!stack.isEmpty()&&nums2[i]>nums2[stack.peek()]){
            int idx=stack.pop();
            nge[idx]=nums2[i];
        }
        stack.push(i);
       }
       int[] ans=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<n;j++){
            if(nums2[j]==nums1[i]){
                ans[i]=nge[j];
                break;
            }
        }
       }
       return ans;
    }
}