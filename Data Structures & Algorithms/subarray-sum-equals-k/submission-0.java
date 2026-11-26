class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int cur = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for (int num: nums) {
            cur += num;
            int diff = cur - k;
            res += map.getOrDefault(diff, 0);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        return res;
    }
}