package algorithm;

public class Q6 {
    public int[] hitBricks(int[][] grid, int[][] hits) {
        for (int i = 0; i < hits.length; i++) {
            for (int j = 0; j < hits[i].length; j++) {
                grid[i][j] = 0;
            }
        }

        return null;
    }
    class unionFind{
        int[] parent;
        int[] size;
        unionFind (int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0;i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }
    }
}
