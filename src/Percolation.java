public class Percolation {
    private final boolean[][] grid;

    public Percolation(int n) {
        grid = new boolean[n][n];
        for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             grid [i][j] = false;
         }
        }
    }

    public void open (int row, int col) {
        if (!grid[row][col]) {
            grid[row][col] = true;
        }
    }

    public boolean isOpen(int row, int col) {
        return grid[row][col];
    }

    public boolean isFull(int row, int col) {
        return false;
    }

    public int numberOfOpenSites() {
        return 0;
    }

    public boolean percolates() {
        return false;
    }

    public static void main(String[] args) {

    }
}
