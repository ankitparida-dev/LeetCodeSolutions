class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->(a[1]-b[1])); 
        int arrows=1;
        int x=points[0][1]; //shooting point
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=x && x<=points[i][1]){
                continue;
            } else{
                arrows++;
                x=points[i][1];
            }
        }
        return arrows;
    }
}