class Solution {
    public boolean canMakeBouquets(
            int[] bloomDay, int day, int m, int k) {

        int consecutive = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {

                consecutive++;

                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;
                }

            } else {

                consecutive = 0;
            }

            // No need to continue if enough bouquets are made
            if (bouquets >= m) {
                return true;
            }
        }

        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int low=bloomDay[0];
        int high=bloomDay[0];
        for(int bloom:bloomDay){
            low=Math.min(low,bloom);
            high=Math.max(high,bloom);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMakeBouquets(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}