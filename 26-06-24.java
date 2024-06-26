int rows = matrix.length;
        int cols = matrix[0].length;
        int totalCoverage = 0;

        // Traverse the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // When we find a 0, check its surroundings
                if (matrix[i][j] == 0) {
                    // Check up
                    if (i > 0 && matrix[i - 1][j] == 1) {
                        totalCoverage++;
                    }
                    // Check down
                    if (i < rows - 1 && matrix[i + 1][j] == 1) {
                        totalCoverage++;
                    }
                    // Check left
                    if (j > 0 && matrix[i][j - 1] == 1) {
                        totalCoverage++;
                    }
                    // Check right
                    if (j < cols - 1 && matrix[i][j + 1] == 1) {
                        totalCoverage++;
                    }
                }
            }
        }
        
        return totalCoverage;
