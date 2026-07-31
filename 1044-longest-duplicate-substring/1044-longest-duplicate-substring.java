import java.util.*;

class Solution {

    static long base = 31;
    static long mod = 1000000007L;

    static String search(String s, int len) {

        long hash = 0;
        long power = 1;

        for (int i = 0; i < len - 1; i++) {
            power = (power * base) % mod;
        }

        // First window hash
        for (int i = 0; i < len; i++) {
            hash = (hash * base + (s.charAt(i) - 'a' + 1)) % mod;
        }

        Map<Long, List<Integer>> map = new HashMap<>();
        map.put(hash, new ArrayList<>());
        map.get(hash).add(0);

        for (int i = len; i < s.length(); i++) {

            int oldVal = s.charAt(i - len) - 'a' + 1;
            int newVal = s.charAt(i) - 'a' + 1;

            hash = (hash - oldVal * power % mod + mod) % mod;
            hash = (hash * base + newVal) % mod;

            int start = i - len + 1;

            if (map.containsKey(hash)) {

                for (int prev : map.get(hash)) {

                    if (s.substring(prev, prev + len)
                            .equals(s.substring(start, start + len))) {

                        return s.substring(start, start + len);
                    }
                }

                map.get(hash).add(start);

            } else {

                map.put(hash, new ArrayList<>());
                map.get(hash).add(start);
            }
        }

        return null;
    }

    public String longestDupSubstring(String s) {

        int left = 1;
        int right = s.length() - 1;

        String ans = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            String temp = search(s, mid);

            if (temp != null) {
                ans = temp;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}