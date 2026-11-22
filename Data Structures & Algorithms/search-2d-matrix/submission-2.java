class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0; 
        int rows = matrix.length;
        while (i < rows - 1 && matrix[i + 1][0] <= target) {
            i++;
        }
        for (int j = 0; j < matrix[0].length ; j++) {
            if (matrix[i][j] == target) return true;
        }
        return false;
    }
}
