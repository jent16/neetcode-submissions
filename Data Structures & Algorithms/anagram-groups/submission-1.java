class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> seen = new HashMap<>();

        for (String s:strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            seen.putIfAbsent(sorted, new ArrayList<>());
            seen.get(sorted).add(s);
        }
        return new ArrayList<>(seen.values());
    }
}
