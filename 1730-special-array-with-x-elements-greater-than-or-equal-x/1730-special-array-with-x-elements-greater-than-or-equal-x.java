class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int n=nums.length;
        for(int x=0;x<=n;x++){
            int c=0;
            for(int i:nums){
                if(i>=x){
                    c++;
                }
            }
            if(c==x) return c;
        }
        return -1;
    }
}