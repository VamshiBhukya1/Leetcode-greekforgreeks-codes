class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
       int right=0;
       int left=0;
       for(int i:nums){
        right+=i;
       }
        for(int i=0;i<n;i++){
            right-=nums[i];
            res[i]=Math.abs(left-right);
            left+=nums[i];
        }
        
        return res;
    }
}