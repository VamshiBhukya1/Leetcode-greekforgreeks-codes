class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        int t=0;
        for(int i:mp.values()){
            if(i>t){
                t=i;
            }
        }
        int res=0;
        for(int i:mp.values()){
            if(i==t){
                res+=t;
            }
        }
        return res;
    }
}