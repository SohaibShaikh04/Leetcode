class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int last = n * n;

        int[] brd = new int[last + 1];
        int idx = 1;
        boolean leftToRight = true;

        for (int row = n - 1; row >= 0; row--) {
            if (leftToRight) {
                for (int col = 0; col < n; col++) {
                    brd[idx++] = board[row][col];
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    brd[idx++] = board[row][col];
                }
            }
            leftToRight = !leftToRight;
        }

        boolean[] visited = new boolean[last + 1];
        int[] steps = new int[last + 1];
        int[] queue = new int[last + 1];

        int head = -1, tail = -1;
        queue[++tail] = 1;
        visited[1] = true;

        while (head < tail) {
            int curr = queue[++head];

            if (curr == last) return steps[curr];

            for (int i = 1; i <= 6 && curr + i <= last; i++) {
                int next = curr + i;
                int dest = (brd[next] == -1) ? next : brd[next];

                if (!visited[dest]) {
                    queue[++tail] = dest;
                    visited[dest] = true;
                    steps[dest] = steps[curr] + 1;
                }
            }
        }

        return -1;
    }
}