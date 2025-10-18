class Solution {
    static void f(int i,List<Integer>current,List<List<Integer>> ans,int[] arr,int n){
        if(i>=n){
            ans.add(new ArrayList<>(current));
            return ;
        }
        //pick
        current.add(arr[i]);
       f(i+1,current,ans,arr,n);
        //not pick 
        current.remove(current.size()-1);
      f(i+1,current,ans,arr,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
       
         f(0,new ArrayList<>(),ans,nums,n);
         return ans;
    }
}