class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        List<Integer> list = new ArrayList<>();

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(grid[i][j]);
            }
        }

        int size = list.size();
        k %= size;

        
        reverse(list, 0, size - 1);
        reverse(list, 0, k - 1);
        reverse(list, k, size - 1);

        
        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(list.get(idx++));
            }
            result.add(row);
        }

        return result;
    }

    private void reverse(List<Integer> list1, int left, int right) {
        while (left < right) {
            int temp = list1.get(left);
            list1.set(left, list1.get(right));
            list1.set(right, temp);
            left++;
            right--;
        }
    }
}

//Used the typical rotate array logic for shifting using a reverse function : )