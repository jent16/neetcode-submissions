class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (indices.containsKey(difference) && indices.get(difference) != i) {
                return new int[]{i, indices.get(difference)};
            }
        }
        return new int[0];
    }
}
