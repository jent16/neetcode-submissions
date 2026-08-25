class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int most = 0;
        int temp = 0;
        while ( l < r) {
            temp =  (r-l)* Math.min(heights[l], heights[r]);
            if (temp > most) {
                most = temp;
            }   
        if (heights[l] > heights[r]) {
            r--;
        }   else  {
                l++;
            }
        }
        return most;
    }
}           
