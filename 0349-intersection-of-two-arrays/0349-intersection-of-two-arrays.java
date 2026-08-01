class Solution {
    public int[] intersection(int[] a, int[] b) {
       HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int x : a)
            set1.add(x);

        for (int x : b) {
            if (set1.contains(x))
                result.add(x);
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (int x : result) {
            ans[i++] = x;
        }

        return ans;   
    }
}