class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        List<String> ans = new ArrayList<>();

        if (s.length() < 10) {
            return ans;
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('C', 2);
        map.put('G', 3);
        map.put('T', 4);

        long base = 5;
        long power = 1;

        for (int i = 0; i < 9; i++) {
            power *= base;
        }

        long hash = 0;

        // First window hash
        for (int i = 0; i < 10; i++) {
            hash = hash * base + map.get(s.charAt(i));
        }

        Set<Long> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        seen.add(hash);

        for (int i = 10; i < s.length(); i++) {

            // Remove leftmost character
            hash -= map.get(s.charAt(i - 10)) * power;

            // Shift and add new character
            hash = hash * base + map.get(s.charAt(i));

            String sub = s.substring(i - 9, i + 1);

            if (seen.contains(hash)) {
                repeated.add(sub);
            } else {
                seen.add(hash);
            }
        }

        ans.addAll(repeated);

        return ans;
    }
}