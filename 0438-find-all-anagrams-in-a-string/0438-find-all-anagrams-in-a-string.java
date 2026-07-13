class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> res=new ArrayList();
        int freq[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
        int count=p.length();
        int left=0,right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(freq[ch-'a']>0){
                count--;
            }
            freq[ch-'a']--;
            right++;
            if(right-left==p.length()){
                if(count==0){
                        res.add(left);

                }
                char remove=s.charAt(left);
                freq[remove-'a']++;
                if(freq[remove-'a']>0){
                    count++;
                }
                left++;

            }
        }
        return res;
    }
}