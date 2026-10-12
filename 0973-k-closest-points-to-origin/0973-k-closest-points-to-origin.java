class Solution {
    public int distance(int[] point){
            return point[0]*point[0]+point[1]*point[1];
        }
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue <int[]> pq=new PriorityQueue<>((a,b)->distance(b)-distance(a));
        for(int i=0;i<points.length;i++){
              pq.add(points[i]);
              if(pq.size()>k){
                pq.poll();
              }
        }
        int res[][]=new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();

        }
        return res;
    }
}