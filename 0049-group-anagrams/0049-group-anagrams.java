class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Step 1: Convert string to char array
            char[] chars = str.toCharArray();
            // Step 2: Sort the characters
            Arrays.sort(chars);
            // Step 3: Convert back to a String to use as key
            String key = new String(chars);
            
            // Step 4: Group them in the map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}