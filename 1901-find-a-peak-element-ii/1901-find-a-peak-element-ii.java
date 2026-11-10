class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int low=0;
        int high=col-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxRow=0;
            for(int i=0;i<row;i++){
                if(mat[i][mid]>mat[maxRow][mid]){
                    maxRow=i;
                }
            }
            int left=(mid==0)?-1:mat[maxRow][mid-1];
            int right=(mid==col-1)?-1:mat[maxRow][mid+1];
            int current=mat[maxRow][mid];
            if (current > left && current > right) {
                return new int[]{maxRow, mid};
            }

            // Right side contains a bigger element
            else if (right > current) {
                low = mid + 1;
            }

            // Left side contains a bigger element
            else {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}