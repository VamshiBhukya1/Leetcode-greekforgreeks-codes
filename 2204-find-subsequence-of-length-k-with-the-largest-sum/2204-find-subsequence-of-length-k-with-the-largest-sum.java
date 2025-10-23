class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
       int n = nums.length;

        int[] copy = Arrays.copyOf(nums, n);
        Arrays.sort(copy);

        // Step 2: Determine cutoff value and how many times it appears among top k
        int cutoff = copy[n - k];
        int cutoffCount = 0;
        for (int i = n - k; i < n; i++) {
            if (copy[i] == cutoff) cutoffCount++;
        }

        // Step 3: Collect k largest elements in original order
        int[] result = new int[k];
        int j = 0;
        for (int num : nums) {
            if (num > cutoff) {
                result[j++] = num;
            } else if (num == cutoff && cutoffCount > 0) {
                result[j++] = num;
                cutoffCount--;
            }
            if (j == k) break;
        }

        return result;
    }
}