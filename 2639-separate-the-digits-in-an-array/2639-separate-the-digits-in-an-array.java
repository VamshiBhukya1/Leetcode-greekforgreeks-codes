import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num); // convert number to string
            for (char c : s.toCharArray()) {
                list.add(c - '0'); // convert character to integer
            }
        }

        // convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
