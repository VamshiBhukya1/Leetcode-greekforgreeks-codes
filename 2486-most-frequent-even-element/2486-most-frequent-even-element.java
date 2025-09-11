class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i:nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
         int maxFreq = Integer.MIN_VALUE;
        int result = -1;

        // Find even number with maximum frequency
        for (int key : mpp.keySet()) {
            if (key % 2 == 0) {
                if (mpp.get(key) > maxFreq) {
                    maxFreq = mpp.get(key);
                    result = key;
                } else if (mpp.get(key) == maxFreq) {
                    // If frequencies are same, return the smaller even number
                    result = Math.min(result, key);
                }
            }
        }

        return result;
    }
}