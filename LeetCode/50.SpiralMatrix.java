class SpiralMatrix {
     public int[][] generateMatrix(int n) {
        int currentC = 0; 
        int rows = n - 1;
        int currentR = 0;
        int cols = n - 1;
        int[][] mat = new int[n][n];
        int num = 1, tar = n * n;
        while(num <= tar){
            for(int i = currentC; i <= cols; i++) mat[currentR][i] = num++; // left to right.
            currentR++;
            for(int i = currentR; i <= rows; i++) mat[i][cols] = num++; // top to bottom.
            cols--;
            for(int i = cols ; i >= currentC; i--) mat[rows][i] = num++; // right to left.
            rows--;
            for(int i = rows; i >= currentR; i--) mat[i][currentC] = num++; // bottom to top.
            currentC++;
        }
        return mat;

        
    }
}