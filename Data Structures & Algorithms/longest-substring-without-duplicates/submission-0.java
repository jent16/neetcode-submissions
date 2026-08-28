class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int result = 0;
        int left = 0;
        for (int right = 0; right <s.length(); right++) {
            char c = s.charAt(right);
            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(c);

            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
