class Solution {
    public int countValidSelections(int[] nums) {
       int n = nums.length;
        int validCount = 0;

        for (int start = 0; start < n; start++) {
            if (nums[start] != 0) continue; // can only start from zeros

            // try both directions: -1 (left) and +1 (right)
            for (int dir : new int[] { -1, 1 }) {
                if (isValidStart(nums, start, dir)) validCount++;
            }
        }

        return validCount;
    }

    private boolean isValidStart(int[] nums, int start, int dir) {
        int n = nums.length;
        int[] arr = nums.clone();  // copy because we'll mutate
        int curr = start;
        int d = dir;

        // simulate until we leave array bounds
        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                curr += d;       // move same direction
            } else {
                arr[curr]--;     // decrement
                d = -d;          // reverse direction
                curr += d;       // step after reversing
            }
        }

        // check if all zero at the end
        for (int x : arr) if (x != 0) return false;
        return true;
    }
}