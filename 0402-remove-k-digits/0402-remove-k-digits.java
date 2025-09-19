class Solution {
    public String removeKdigits(String num, int k) {
          StringBuilder stack = new StringBuilder();

        for (char digit : num.toCharArray()) {
            // While k > 0 and last digit in stack > current digit
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }

        // If k still > 0, remove from the end
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        // Remove leading zeros
        int idx = 0;
        while (idx < stack.length() && stack.charAt(idx) == '0') {
            idx++;
        }

        // If empty after trimming, return "0"
        String result = idx == stack.length() ? "0" : stack.substring(idx);
        return result;
    }
}
    
