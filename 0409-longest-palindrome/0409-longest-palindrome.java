class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        int length = 0;
        boolean oddFound = false;

        for (int count : freq) {
            length += (count / 2) * 2; // take pairs
            if (count % 2 == 1) {
                oddFound = true;
            }
        }

        if (oddFound) {
            length += 1; // one odd char can be placed in center
        }

        return length;
    }
}
