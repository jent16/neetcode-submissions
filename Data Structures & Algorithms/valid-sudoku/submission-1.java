class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int b = (r/3) * 3 + (c/3);
                char t = board[r][c];
                if (t== '.') continue;
                if (rows[r].contains(t) || cols[c].contains(t) || boxes[b].contains(t)) return false;
                else {
                    rows[r].add(t);
                    cols[c].add(t);
                    boxes[b].add(t);
                }
            }
        }
        return true;

    }
}
