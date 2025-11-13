class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Set<Integer> res=new HashSet<>();
        for(int i:nums){
            res.add(i);
        }
        List<Integer>arr=new ArrayList<>();
        for(int i=nums[0];i<=nums[n-1];i++){
            if(!res.contains(i)){
                arr.add(i);
            }
        }
        return arr;
        
    }
}