class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int res1 = check(tops[0], tops, bottoms);
        if (tops[0] == bottoms[0]) return res1;
        int res2 = check(bottoms[0], tops, bottoms);

        if (res1 == -1) return res2;
        if (res2 == -1) return res1;
        return Math.min(res1, res2);
    }

    private int check(int target, int[] tops, int[] bottoms) {
        int rotateTop = 0;
        int rotateBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            } else if (tops[i] != target) {
                rotateTop++;
            } else if (bottoms[i] != target) {
                rotateBottom++;
            }
        }
        return Math.min(rotateTop, rotateBottom);
    }
}