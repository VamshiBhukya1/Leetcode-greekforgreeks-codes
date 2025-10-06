import java.util.*;

class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        StringBuilder num = new StringBuilder();

        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    // Remove leading zeros before adding
                    set.add(removeLeadingZeros(num.toString()));
                    num.setLength(0); // reset builder
                }
            }
        }

        // Add last number if string ended with digits
        if (num.length() > 0) {
            set.add(removeLeadingZeros(num.toString()));
        }

        return set.size();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') i++;
        return s.substring(i);
    }
}
