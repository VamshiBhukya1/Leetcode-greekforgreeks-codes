class Solution {
    public int countVowelSubstrings(String word) {
       
        int n = word.length();
        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                if (!vowels.contains(String.valueOf(c))) break; // stop if not a vowel
                set.add(c);
                if (set.size() == 5) count++;
            }
        }
        return count;
    }
}