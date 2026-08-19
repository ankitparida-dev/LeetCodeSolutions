class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max1=0;
        List <Boolean> ans=new ArrayList <>();
        for(int num:candies){
             max1=Math.max(num,max1);
        }
        for(int num:candies){
            ans.add(num+extraCandies>=max1);
        }
        return ans;

    }
}