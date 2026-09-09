class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int i : nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < bucket.length; i++ ) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry: counts.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i > 0 && index < k; i--) {
            for (int n : bucket[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        } return res;
        
    }
}
