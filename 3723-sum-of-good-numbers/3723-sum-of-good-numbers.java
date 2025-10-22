class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            boolean leftOk = true;
            boolean rightOk = true;

            if (i - k >= 0 && nums[i] <= nums[i - k]) leftOk = false;
            if (i + k < n && nums[i] <= nums[i + k]) rightOk = false;

            if (leftOk && rightOk) sum += nums[i];
        }
        return sum;
        
    }
}