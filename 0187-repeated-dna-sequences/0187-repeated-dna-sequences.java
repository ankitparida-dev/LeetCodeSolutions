class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        int hash = 0;

        Set<Integer> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            // Add current character (2 bits)
            hash = (hash << 2) | map.get(s.charAt(i));

            // Keep only last 20 bits
            hash = hash & ((1 << 20) - 1);


            if (i >= 9) {

                String sub = s.substring(i - 9, i + 1);

                if (seen.contains(hash)) {

                    if (!repeated.contains(sub)) {
                        repeated.add(sub);
                        ans.add(sub);
                    }

                } else {
                    seen.add(hash);
                }
            }
        }

        return ans;
    }
}