class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(sumOfDigits(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
     private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}