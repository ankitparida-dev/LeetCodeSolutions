class Solution {
    public int minimumCost(int[] cost) {
        int count=0;
        int mincost=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            count++;
            if(count==3){
                count=0;
                continue;
            }
            mincost+=cost[i];
        }
        return mincost;
    }
}