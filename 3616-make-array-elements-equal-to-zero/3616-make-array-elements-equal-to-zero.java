class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        int presum=0;
        int c=0;
        for(int i:nums){
            totalsum+=i;
        }
        for(int i=0;i<n;i++){
            presum+=nums[i];
            if(nums[i]==0){
                if(presum*2==totalsum) c+=2;
                if (Math.abs(totalsum - 2 * presum) == 1) {
                    c += 1; // only one direction valid
                }

            }
        }
        return c;
    }
}