class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0;
        int top = 0;
        int r = matrix[0].length -1 ;
        int bot = matrix.length -1;
        ArrayList<Integer> res = new ArrayList<>();

        while (l <= r && top <= bot) {
            for (int i = l; i <= r; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bot; i++) {
                res.add(matrix[i][r]);
            }
            r--;
            if (top <=bot) {
            for (int i = r; i >= l; i--) {
                res.add(matrix[bot][i]);
            }
            bot--;
            }

            if (l<=r) {
            for (int i = bot; i >= top; i--) {
                res.add(matrix[i][l]);
            }
            l++;
            }
        }
        return res;
    }
}
