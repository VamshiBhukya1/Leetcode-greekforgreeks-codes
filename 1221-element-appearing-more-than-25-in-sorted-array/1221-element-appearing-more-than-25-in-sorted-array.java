class Solution {
    public int findSpecialInteger(int[] arr) {
        // HashMap<Integer,Integer>mp=new HashMap<>();
        // int n=arr.length;
        // for(int i:arr){
        // mp.put(i,mp.getOrDefault(i,0)+1);
        // }
        // int res=0;
        // int p=(n*100)/25;
        // for(int i:mp.values()){
        //     if(i<p){
        //       res=mp.get(i);
        //     }
        // }
        // return res;
        int n=arr.length;
        int res=-1;
        for(int i=0;i<n-n/4;i++){
            if(arr[i]==arr[i+n/4]){
                    return arr[i];
            }
        }
        return -1;
    }
}