class Solution {
    public String sortSentence(String s) {
        StringBuilder res=new StringBuilder();
        String[] words=s.split(" ");
        int n = words.length;

        for (int i = 1; i <= n; i++) {
            for (String word : words) {
                // Check the last character (digit) of each word
                if (word.charAt(word.length() - 1) - '0' == i) {
                    // Remove the digit and add to result
                    res.append(word, 0, word.length() - 1).append(" ");
                    break;
                }
            }
        }

        // Remove trailing space
        return res.toString().trim();
        
    }
}