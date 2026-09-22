class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        int temp = 0;
        while (r < prices.length) {
            if (prices[r] > prices[l]) {
                temp = prices[r] - prices[l];
            } else {
                l = r;
            }
            max = Math.max(max, temp);
            r++;
        }
        return max;
    } 
}
