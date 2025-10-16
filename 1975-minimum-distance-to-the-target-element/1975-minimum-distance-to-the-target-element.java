class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<n;i++){
            if(nums[i]==target ){
                 ans=Math.abs(i-start);
                 res=Math.min(ans,res);

            }
        }
        return res;
    }
}