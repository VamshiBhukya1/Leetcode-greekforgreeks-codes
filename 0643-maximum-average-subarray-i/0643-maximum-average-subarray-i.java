class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double smax=0;
        int n=nums.length;
        double maxsum=0;
        if(n==1) return nums[0]/k;
        for(int i=0;i<k;i++){
            smax+=nums[i];
        }
        maxsum=smax/k;
        for(int i=k;i<n;i++){
            smax+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,smax/k);
        }
       
        
        return maxsum;
    }
}