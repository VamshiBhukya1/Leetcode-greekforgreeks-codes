class Solution {
    public int findClosestNumber(int[] nums) {
       
        int c=nums[0];
        for(int i:nums){
            if(Math.abs(i)<Math.abs(c)){
                c=i;
            }else if(Math.abs(i)==Math.abs(c)&&i>c ){
                c=i;
            }

            
        }
        return c;

        
    }
}