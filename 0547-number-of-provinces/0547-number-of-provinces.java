class Solution {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int provinces = 0;

        for (int city = 0; city < n; city++) {

            if (!visited[city]) {
                bfs(city, isConnected, visited);
                provinces++;
            }
        }

        return provinces;
    }

    private void bfs(int start,
                     int[][] isConnected,
                     boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int city = queue.poll();

            for (int neighbor = 0;
                 neighbor < isConnected.length;
                 neighbor++) {

                if (isConnected[city][neighbor] == 1
                        && !visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}