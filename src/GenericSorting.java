public class GenericSorting<T extends Comparable> {

    T[][] grid;

    public GenericSorting(T[][] grid){
        this.grid = grid;
    }

    public void setGrid(T[][] grid) {
        this.grid = grid;
    }

    public T[][] getGrid() {
        return grid;
    }

    public void sortAsc() {
        // ascending order sort
        int col = grid[0].length;
        int row = grid.length;

        T g1;
        T g2;

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                for (int c = 0; c < row; c++) {
                    for (int d = 0; d < col; d++) {

                        g1 = grid[a][b];
                        g2 = grid[c][d];

                        if (g1.compareTo(g2) < 0) {
                                T temp = grid[a][b];
                                grid[a][b] = grid[c][d];
                                grid[c][d] = temp;
                        }
                    }
                }
            }
        }
    }

    public void sortDes(){
        // descending order sort
        int col = grid[0].length;
        int row = grid.length;

        T g1;
        T g2;

        for (int a = 0; a < row; a++) {
            for (int b = 0; b < col; b++) {
                for (int c = 0; c < row; c++) {
                    for (int d = 0; d < col; d++) {

                        g1 = grid[a][b];
                        g2 = grid[c][d];

                        if (g2.compareTo(g1) < 0) {
                                T temp = grid[a][b];
                                grid[a][b] = grid[c][d];
                                grid[c][d] = temp;
                        }
                    }
                }
            }
        }
    }

    public void print2DArray(){
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.println(grid[i][j] + " ");
            }
            System.out.println();
        }

    }

}

