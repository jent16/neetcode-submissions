class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i : nums) {
            counts.put(i, counts.getOrDefault(i , 0)+ 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> a.getValue()- b.getValue());
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int [] result = new int[k];
        for (int i = 0; i < k; i ++) {
            result[i] = heap.poll().getKey();
        }
        return result;
    }
}
