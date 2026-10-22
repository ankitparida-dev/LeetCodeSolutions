class Solution {
    public int maxProduct(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int num=arr[i];
            if(num<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(num,max*num);
            min=Math.min(num,min*num);
            res=Math.max(res,max);
        }
        return res;
    }
}