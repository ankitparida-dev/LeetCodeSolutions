class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList <int[]> res=new ArrayList();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            int[] ele=res.get(res.size()-1);
            int end=ele[1];
            if(start<=end){
                ele[1]=Math.max(intervals[i][1],end);
            }
            else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}