class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List <Boolean> ans=new ArrayList <>();
        int max1=Integer.MIN_VALUE;
        for(int num:candies){
            max1=Math.max(num,max1);
        }
        for(int num:candies){
            ans.add(num+extraCandies>=max1);
        }
        return ans;
    }
}