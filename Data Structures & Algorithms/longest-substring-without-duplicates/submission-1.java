class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int l = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            while (seen.contains(s.charAt(i))) {
                seen.remove(s.charAt(l));
                l++;
            } 
            seen.add(s.charAt(i));
            res = Math.max(res, i - l + 1);
        } return res;
    }
}
