class Solution {
    public int nextGreaterElement(int n) {
        int INT_MAX = Integer.MAX_VALUE; // 2147483647
        char[] digits = String.valueOf(n).toCharArray();
        int k = digits.length;

        // 1. find i
        int i = k - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) i--;
        if (i < 0) return -1;

        // 2. find j
        int j = k - 1;
        while (digits[j] <= digits[i]) j--;

        // 3. swap
        char tmp = digits[i];
        digits[i] = digits[j];
        digits[j] = tmp;

        // 4. reverse suffix
        reverse(digits, i + 1, k - 1);

        // 5. parse and check overflow
        long val = 0;
        for (char c : digits) {
            val = val * 10 + (c - '0');
            if (val > INT_MAX) return -1;
        }
        return (int) val;
    }

    private void reverse(char[] a, int l, int r) {
        while (l < r) {
            char t = a[l]; a[l] = a[r]; a[r] = t;
            l++; r--;
        }
    }
}
