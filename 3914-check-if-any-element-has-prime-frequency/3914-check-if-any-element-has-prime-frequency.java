class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
       HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Check if any frequency is prime
        for (int count : freq.values()) {
            if (isPrime(count)) {
                return true;
            }
        }

        return false;
    }

    // Function to check prime number
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}