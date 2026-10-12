class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
        });

        for (String ele : map.keySet()) {
            pq.add(ele);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        String[] res = new String[k];
        int i = k - 1;

        while (!pq.isEmpty()) {
            res[i] = pq.poll();
            i--;
        }

        return Arrays.asList(res);
    }
}