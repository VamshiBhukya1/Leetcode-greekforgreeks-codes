class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>contain=new ArrayList<>();
        
        for(int i=0;i<words.length;i++){
            if (words[i].indexOf(x) >= 0) {
                contain.add(i);
            }
        }
        return contain;
    }
}