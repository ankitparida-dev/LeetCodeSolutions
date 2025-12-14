class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[1001];
        int n=nums.length;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int maxfreq=0;
        for(int i=0;i<1001;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
            }
        }
        int count=0;
        for(int i=0;i<1001;i++){
            if(freq[i]==maxfreq){
                count+=freq[i];
            }
        }
        return count;
    }
}