class Solution {
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix[0].length -1;
        while (l < r) {
            for (int i = 0; i < r - l; i++) {
                int top = l;
                int bot = r;
                int topL = matrix[top][l+i];

                matrix[top][l+i] = matrix[bot - i][l];

                matrix[bot - i][l] = matrix[bot][r-i];

                matrix[bot][r-i] = matrix[top+i][r];

                matrix[top+i][r] = topL;
            }
            l++;
            r--;
        }
    }
}
