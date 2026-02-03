class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int p=-1;
        int q=-1;
      
         if (n < 3) return false;
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                p=i;
                break;
            }
        }
          if (p == -1 || p == 0) return false;
        for(int i=p;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                q=i;
                break;
            }
        }
          if (q == -1 || q == p) return false;
       for(int i=q;i<n-1;i++){
        if(nums[i]>=nums[i+1]){
           return false;
        }
       }
       return true;
        
    }
}