class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       int ans=0;
       while(truckSize>0){
        int max=0;
        int index=-1;
        for(int i=0;i<boxTypes.length;i++){
            if(boxTypes[i][0]>0 && boxTypes[i][1]>max){
                max=boxTypes[i][1];
                index=i;
            }
        }
        if(index==-1){
            break;
        }
        int take=Math.min(boxTypes[index][0],truckSize);
        ans+=take*boxTypes[index][1];
        boxTypes[index][0]-=take;
        truckSize-=take;
       }
       return ans;
    }
}