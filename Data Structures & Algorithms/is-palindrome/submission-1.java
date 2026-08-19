class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int k = s.length() - 1;

        while(i < k) {
            while (i < k && !alphaNum(s.charAt(i))) {
                i++;
            }
            while (i < k && !alphaNum(s.charAt(k))) {
                k--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(k))) {
                return false;
            }
            i++;
            k--;
        }   
        return true;

    }
    public boolean alphaNum(char c) {
        return (c>='A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
