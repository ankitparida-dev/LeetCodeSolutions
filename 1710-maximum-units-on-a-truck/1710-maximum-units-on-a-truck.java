class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
       int total=0;
       for(int[] ele:boxTypes){
        int box=ele[0];
        int unit=ele[1];
        int min=Math.min(box,truckSize);
        total+=min*unit;
        truckSize=truckSize-min;
        if(truckSize==0){
            break;
        }
       }
       return total;
    }
}