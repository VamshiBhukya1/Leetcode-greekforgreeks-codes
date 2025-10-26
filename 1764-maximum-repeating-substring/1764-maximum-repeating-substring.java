class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String repeatword=word;
        while(sequence.contains(repeatword)){
            c++;
            repeatword+=word;
        }
        return c;
    }
}