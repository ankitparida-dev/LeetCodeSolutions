class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char []S1=s.toCharArray();
        char []S2=S1.clone();
        int n=S2.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            char temp=S2[left];
            S2[left]=S2[right];
            S2[right]=temp;
            left++;
            right--;
        }
       if(Arrays.equals(S1,S2)){
        return true;
       }
       else{
        return false;
       }
    }
}