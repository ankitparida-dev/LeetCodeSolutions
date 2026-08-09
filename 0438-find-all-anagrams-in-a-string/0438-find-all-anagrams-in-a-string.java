class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] freq = new int[26];
        for(char c : p.toCharArray())
            freq[c - 'a']++;
        int count = p.length();
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            if(freq[s.charAt(right) - 'a'] > 0)
                count--;
            freq[s.charAt(right) - 'a']--;
            if(right - left + 1 == p.length()) {
                if(count == 0)
                    res.add(left);
                if(freq[s.charAt(left) - 'a'] >= 0)
                    count++;
                freq[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return res;
    }
}