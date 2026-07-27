class Solution {

    static boolean zAlgorithm(String text, String pattern) {

        String str = pattern + "$" + text;

        int[] z = new int[str.length()];

        int left = 0;
        int right = 0;

        for(int i = 1; i < str.length(); i++) {

            if(i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while(i + z[i] < str.length() &&
                  str.charAt(z[i]) == str.charAt(i + z[i])) {

                z[i]++;
            }

            if(i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }

            // Pattern found
            if(z[i] == pattern.length()) {
                return true;
            }
        }

        return false;
    }


    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int count = 0;

        // Repeat a until length >= b
        while(sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        // Check current string
        if(zAlgorithm(sb.toString(), b)) {
            return count;
        }

        // Check one extra repetition
        sb.append(a);
        count++;

        if(zAlgorithm(sb.toString(), b)) {
            return count;
        }

        return -1;
    }
}