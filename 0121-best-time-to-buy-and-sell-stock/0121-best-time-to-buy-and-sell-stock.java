class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minProfit=prices[0];
        for(int i=0;i<prices.length;i++){
            
                maxProfit=Math.max(maxProfit,prices[i]-minProfit);
                minProfit=Math.min(minProfit,prices[i]);
            
        }
        return maxProfit;
    }
}