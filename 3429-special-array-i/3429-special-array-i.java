class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if (n <= 1) return true; // Single element is always special

        for (int i = 0; i < n - 1; i++) {
            // If two consecutive numbers are equal → not special
            if (nums[i] == nums[i + 1]) {
                return false;
            }

            // If both are even or both are odd → not special
            if ((nums[i] % 2) == (nums[i + 1] % 2)) {
                return false;
            }
        }
        // Passed all checks → special
        return true;
    }
}
